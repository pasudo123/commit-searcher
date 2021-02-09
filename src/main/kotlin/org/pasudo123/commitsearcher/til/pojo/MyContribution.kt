package org.pasudo123.commitsearcher.til.pojo

import java.time.LocalDate

class MyContribution constructor(
    myElements: List<MyElement> = emptyList()
) {

    // 최대 커밋 카운트 및 날짜
    private var maxCommitCount = -1
    private var maxCommitDate: LocalDate? = null

    // 최소 커밋 카운트 및 날짜
    private var minCommitCount = 1
    private var minCommitDate: LocalDate? = null

    // 컨트리뷰션 요소
    private var myElements: List<MyElement> = myElements

    // 나의 커밋 상태 메시지
    private var message = ""

    data class MyElement constructor(
        val commitCount: Int = 0,
        val commitDate: LocalDate = LocalDate.now()
    )

    companion object {
        private const val ZERO = 0

        fun myElementCreate(commitCount: Int, commitDate: LocalDate): MyElement {
            return MyElement(commitCount, commitDate)
        }
    }

    // 기본 생성자 이후 호출
    init {
        val maxCommitInfo = this.myElements.maxWithOrNull(compareBy { it.commitCount })
        this.maxCommitCount = maxCommitInfo!!.commitCount
        this.maxCommitDate = maxCommitInfo.commitDate

        // TODO : 0 은 제외시키려고 하는데 어떻게 하지?
        val minCommitInfo = this.myElements.minWithOrNull(compareBy { it.commitCount })
        this.minCommitCount = minCommitInfo!!.commitCount
        this.minCommitDate = minCommitInfo.commitDate
    }
}