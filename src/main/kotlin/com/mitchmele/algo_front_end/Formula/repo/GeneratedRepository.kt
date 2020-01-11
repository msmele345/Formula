package com.mitchmele.algo_front_end.Formula.repo

import com.mitchmele.algo_front_end.Formula.model.AlgorithmSummaryResponse
import reactor.core.publisher.Flux

interface GeneratedRepository {

    fun findAll(): Flux<AlgorithmSummaryResponse>

}