package org.pasudo123.commitsearcher.planner.repository

import org.pasudo123.commitsearcher.planner.domain.Planner
import org.springframework.data.jpa.repository.JpaRepository

interface PlannerRepository: JpaRepository<Planner, Long> {
}