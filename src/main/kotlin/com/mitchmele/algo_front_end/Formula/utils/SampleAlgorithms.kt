package com.mitchmele.algo_front_end.Formula.utils

import com.mitchmele.algo_front_end.Formula.model.AlgorithmSummaryResponse

fun sampleAlgorithm(): List<AlgorithmSummaryResponse> {
    return listOf(
        AlgorithmSummaryResponse(
            name = "countDupes",
            codeSnippet = """
            fun parseString(arr: String): Int = arr.last()
        """.trimIndent(),
            categoryDescription = "EASY",
            difficultyLevel = 2,
            categoryTags = listOf("Tag: Strings", "Tag: Data Processing")
        ),
        AlgorithmSummaryResponse(
            name = "getSize",
            codeSnippet = """
            fun getSize(arr: Array<Int>): Int = arr.size
        """.trimIndent(),
            categoryDescription = "EASY",
            difficultyLevel = 3,
            categoryTags = listOf("Tag: Collections", "Tag: Data Processing")
        ),
        AlgorithmSummaryResponse(
            name = "findFirst",
            codeSnippet = """
            fun countDupes(arr: Array<Int>): Int = arr.first()
        """.trimIndent(),
            categoryDescription = "EASY",
            difficultyLevel = 1,
            categoryTags = listOf("Tag: Processing", "Tag: Data Processing")
        ),
        AlgorithmSummaryResponse(
            name = "updateString",
            codeSnippet = """
            fun countDupes(str: String, newChar: String): String = str.replace(str, newChar)
        """.trimIndent(),
            categoryDescription = "EASY",
            difficultyLevel = 2,
            categoryTags = listOf("Tag: Strings", "Tag: Data Processing")
        ),
        AlgorithmSummaryResponse(
            name = "countDupes",
            codeSnippet = """
            fun countDupes(arr: Array<Int>): Int = arr.size - arr.distinct()
        """.trimIndent(),
            categoryDescription = "EASY",
            difficultyLevel = 2,
            categoryTags = listOf("Tag: Collections", "Tag: Data Processing")
        )
    )
}


fun generateAlgorithm(interval: Long): List<AlgorithmSummaryResponse> {
    return sampleAlgorithm().shuffled().take(1)
}



