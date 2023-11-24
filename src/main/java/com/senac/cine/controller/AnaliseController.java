
package com.senac.cine.controller;

import com.senac.cine.model.Analise;
import com.senac.cine.model.Filme;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Rosilane
 */
@Controller
public class AnaliseController {
   
    @GetMapping("/detalhes/{id}")
    public String exibeDetalhesFilme(@PathVariable int id, Model model) {
    List<Filme> lista = FilmeController.filmes;

        Filme filme = new Filme();
        
        filme=lista.get(id);
        System.out.println("ESTE É O ID "+filme.getTitulo());
    model.addAttribute("filme", filme);
    
    model.addAttribute("analise", new Analise());
    
    return "detalhes";
}

    
    @PostMapping("/adicionarAnalise")
    public String adicionarAnalise( Model model, @RequestParam int id,@RequestParam Filme filme, @RequestParam String comentario, @RequestParam int nota) {
       Analise analise = new Analise(id, filme, comentario, nota);
       model.addAttribute("analise", analise);

        // Redirecionar de volta para a página de detalhes do filme
        return "redirect:/detalhes";
    }
    
    
}
