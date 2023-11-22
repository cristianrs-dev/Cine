
package com.senac.cine.controller;

import com.senac.cine.model.Analise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Rosilane
 */
@Controller
public class AnaliseController {
    
    @GetMapping("/detalhes")
    public String exibeDetalhesFilme(Model model){
        model.addAttribute("analise", new Analise());
        return "detalhes";
    }
    
    @PostMapping("/adicionarAnalise")
    public String adicionarAnalise(Analise analise) {
        // Lógica para adicionar a análise ao filme (por exemplo, salvar no banco de dados)
        // ...

        // Redirecionar de volta para a página de detalhes do filme
        return "redirect:/detalhes";
    }
    
    
}
