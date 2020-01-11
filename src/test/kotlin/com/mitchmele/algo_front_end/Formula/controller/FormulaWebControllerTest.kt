package com.mitchmele.algo_front_end.Formula.controller

import com.mitchmele.algo_front_end.Formula.FormulaService
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.ui.Model


class FormulaWebControllerTest {


    val mockService: FormulaService = mock()

    val subject = FormulaWebController(mockService)

    val mockMvc = MockMvcBuilders
        .standaloneSetup(subject)
        .build()

    @Test
    fun `index - should call the formulaService`() {

        mockMvc
            .perform(get("/algorithms"))
            .andExpect(status().is2xxSuccessful)

        verify(mockService).fetchAll(any<Model>())
    }

}