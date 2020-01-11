package com.mitchmele.algo_front_end.Formula.controller

import com.mitchmele.algo_front_end.Formula.FormulaService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam


@Controller
@RequestMapping("/algorithms")
class FormulaWebController(
    val formulaService: FormulaService
) {
    @RequestMapping(method = [RequestMethod.GET])
    fun index(
        @RequestParam(name="name", required=false, defaultValue="World") name: String,
        model: Model
    ): String {
        model.addAttribute("name", name)
        return "index"
    }
}