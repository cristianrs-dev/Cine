
package com.senac.cine.model;

/**
 *
 * @author Cristian
 */
public class Filme {
    private int id;
    private String titulo;
    private String sinopse;
    private String genereo;
    private int anoLancamento;

    public Filme() {
    }

    public Filme(int id, String titulo, String sinopse, String genereo, int anoLancamento) {
        this.id = id;
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.genereo = genereo;
        this.anoLancamento = anoLancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getGenereo() {
        return genereo;
    }

    public void setGenereo(String genereo) {
        this.genereo = genereo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    
    
}
