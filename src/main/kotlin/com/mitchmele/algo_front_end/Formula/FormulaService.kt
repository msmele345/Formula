package com.mitchmele.algo_front_end.Formula

import org.springframework.stereotype.Service
import org.springframework.ui.Model
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers.model
import sun.security.x509.OIDMap.addAttribute
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable



@Service
class FormulaService {

    fun fetchAll(model: Model): String {
        // loads 1 and display 1, stream data, data driven mode.
//        val reactiveDataDrivenMode = ReactiveDataDriverContextVariable(movieRepository.findAll(), 1)

//        model.addAttribute("movies", reactiveDataDrivenMode)

        // classic, wait repository loaded all and display it.
        //model.addAttribute("movies", movieRepository.findAll());

        return "index.html"
    }
}
