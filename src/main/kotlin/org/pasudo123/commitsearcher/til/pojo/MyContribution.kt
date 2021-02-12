package org.pasudo123.commitsearcher.til.pojo

import java.lang.reflect.Array.get
import java.time.LocalDate

data class MyContribution constructor(
    private val myElements: List<MyElement> = emptyList()
) {

    // 최대 커밋 카운트 및 날짜
    var maxCommitCount = -1
    var maxCommitDate: LocalDate? = null

    // 최소 커밋 카운트 및 날짜
    var minCommitCount = 1
    var minCommitDate: LocalDate? = null

    data class MyElement constructor(
        val commitCount: Int = 0,
        val commitDate: LocalDate = LocalDate.now()
    )

    companion object {
        val EMPTY = MyContribution()
        private const val ONE = 1L

        fun myElementCreate(commitCount: Int, commitDate: LocalDate): MyElement {
            return MyElement(commitCount, commitDate)
        }
    }

    // 기본 생성자 이후 호출
    init {

        val myValidCommits = this.myElements
                .filter { it.commitCount != 0 }
                .filter { it.commitDate > LocalDate.now().minusWeeks(ONE) }

        // 일주일을 기준
        val maxCommitInfo = myValidCommits.maxWithOrNull(compareBy { it.commitCount })
        this.maxCommitCount = maxCommitInfo?.commitCount ?: 0
        this.maxCommitDate = maxCommitInfo?.commitDate ?: LocalDate.now()

        val minCommitInfo = myValidCommits.minWithOrNull(compareBy { it.commitCount })
        this.minCommitCount = minCommitInfo?.commitCount ?: 0
        this.minCommitDate = minCommitInfo?.commitDate ?: LocalDate.now()
    }
}