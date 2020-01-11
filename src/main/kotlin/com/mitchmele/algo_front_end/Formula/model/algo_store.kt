package com.mitchmele.algo_front_end.Formula.model

data class AlgorithmSummaryResponse(
    val name: String = "",
    val codeSnippet: String = "",
    val categoryDescription: String = "",
    val difficultyLevel: Int? = null,
    val categoryTags: List<String> = emptyList()
)



data class AlgorithmDomainModel(
    val name: String = "",
    val codeSnippet: String = "",
    val category: Category = Category(categoryDescription = ""),
    val isSolved: Boolean = true
)

data class Category(
    val categoryDescription: String = "",
    val difficultyLevel: Int = 1,
    val tags: List<Tag> = emptyList()
)

data class Tag(val label: String = "")

enum class CategoryDescription(val value: String) {
    HARD("HARD"),
    EASY("EASY"),
    MEDIUM("MEDIUM"),
    EXTREME_PROGRAMMING("EXTREME PROGRAMMING")
}


data class Algorithms(
    val algos: List<AlgorithmDomainModel>
) : List<AlgorithmDomainModel> by algos

data class AlgorithmResponses(
    val listOfAlgos: List<AlgorithmSummaryResponse>
) : List<AlgorithmSummaryResponse> by listOfAlgos