
package com.senac.cine.model;

/**
 *
 * @author Cristian
 */
public class Analise {
    private int id;
    private Filme filme;
    private String comentario;
    private int nota;

    public Analise() {
    }

    public Analise(int id, Filme filme, String comentario, int nota) {
        this.id = id;
        this.filme = filme;
        this.comentario = comentario;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
}
