
package com.senac.cine.controller;

import com.senac.cine.model.Analise;
import com.senac.cine.model.Filme;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Rosilane
 */
@Controller
public class AnaliseController {
    List<Filme> lista = FilmeController.filmes;
    List<Analise> analises = new ArrayList<>();
    
    @GetMapping("/detalhes/{id}")
    public String exibeDetalhesFilme(@PathVariable int id, Model model) {
    
        Filme filmeEncontrado = lista.get(id);
    if (filmeEncontrado.getId() >= 0 && filmeEncontrado.getId() <= lista.size()) {
        Filme filme = lista.get(id);
        
        model.addAttribute("filme", filme);
        model.addAttribute("analises", analises);
        model.addAttribute("analise", new Analise());
        return "detalhes";
    } else {
        // Lidar com o caso em que o id não é um índice válido na lista
        return "erro";
    }
}

    
    @PostMapping("/detalhes/{id}")
    public String adicionarAnalise(@PathVariable int id, Model model, @RequestParam String comentario, @RequestParam int nota) {
    

    if (id >= 0 && id < lista.size()) {
        Filme filme = lista.get(id);

        Analise analise = new Analise();
        analise.setComentario(comentario);
        analise.setNota(nota);

        
        analise.setFilme(filme);
       analises.add(analise);
        model.addAttribute("filme", filme);
        model.addAttribute("analise", new Analise());
        return "redirect:/detalhes/"+id;
    } else {
        
        return "erro";
    }
}
    /*
    @GetMapping("/detalhes")
    public String mostraDetalhes(Model model,@PathVariable int id){
        Filme filme = lista.get(id);
        
        model.addAttribute("filme", filme);
        model.addAttribute("analises", analises);
        model.addAttribute("analise", new Analise());
        
        return  "redirect:/detalhes";
    }
    */
    
}
