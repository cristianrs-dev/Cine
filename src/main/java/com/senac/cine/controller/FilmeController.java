
package com.senac.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Rosilane
 */

@Controller
public class FilmeController {
    
    @GetMapping("/cadastro-filmes")
    public String exibeFormulario(){
        
        return "cadastro-filmes";
    }
}
