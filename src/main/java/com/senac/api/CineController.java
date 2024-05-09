
package com.senac.api;

import ch.qos.logback.core.model.processor.PhaseIndicator;
import com.senac.cine.model.Filme;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filmes")
public class CineController {
    List<Filme> filmes = new ArrayList<>();
    private int id;
    
    @GetMapping
    public List listarFilmes(){
        return filmes;
    }
    
    @GetMapping("/{id}")
    public Filme buscarFilmePorId(@PathVariable int id){
        for(int i = 0; i < filmes.size(); i++){
            Filme filme = filmes.get(id);
            if(filme.getId() ==  id){
                return filme;
            }
        }
        return null;
    }
    
    @PostMapping
    public String registraFilme(@RequestBody Filme filme){
        int id = filmes.size()+1;
        filme.setId(id);
        filmes.add(filme);
        return "filme";
    }
    
    @PutMapping("/{id}")
    public Filme atualizaFilme(@PathVariable int id, @RequestBody Filme FilmeAtualizado){
        for(int i=0;  i < filmes.size(); i++){
            Filme filme = filmes.get(id);
            if(filme.getId() ==  id){
                return filme;
            }
        }
        return null;
    }
    
    @DeleteMapping("/{id}")
    public boolean apagaTarefa(@PathVariable int id){
        for(int i = 0; i <  filmes.size(); i++){
            Filme filme = filmes.get(id);
            if(filme.getId() ==  id){
                filmes.remove(i);
                return true;
            }
        }
        return false;
    }
    
}
