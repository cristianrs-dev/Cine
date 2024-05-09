//
package com.senac.cine.controller;
import com.senac.cine.model.Filme;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class FilmeController {
   public static ArrayList<Filme> filmes = new ArrayList<>();
    //link http://localhost:8080/cadastro-filmes
    @GetMapping("/cadastro-filmes")
    public String exibeFormulario(Model model){
        model.addAttribute("filme", new Filme());
        return "cadastro-filmes";
    }
    
    @GetMapping("/filmes")
        public String exibeCadastro(Model model){
            model.addAttribute("filmes", filmes);
            return "registro";
        }
    
    @PostMapping("/cadastro-filme")
    public String setFilme(Model model,@RequestParam int id,@RequestParam String titulo,@RequestParam String sinopse,@RequestParam String genero, @RequestParam int anoLancamento){
        Filme filme = new Filme();
        
        filme.setId(id);
        filme.setTitulo(titulo);
        filme.setGenero(genero);
        filme.setAnoLancamento(anoLancamento);
       
        filmes.add(filme);
        model.addAttribute("filme",filme);
        return "registro";
    }
    
    
        @PostMapping("/registro")
        public String exibeCadastro(@ModelAttribute Filme filme, Model model){
           filmes.add(filme);
     
            model.addAttribute("filmes", filmes);
            return "registro";
        }
        
        
       
        
        
}
