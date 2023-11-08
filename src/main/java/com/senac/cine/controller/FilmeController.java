
package com.senac.cine.controller;


import com.senac.cine.model.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Rosilane
 */

@Controller
public class FilmeController {
    
    @GetMapping("/cadastro-filmes")
    public String exibeFormulario(Model model){
        model.addAttribute("filme", new Filme());
        return "cadastro-filmes";
    }
}
