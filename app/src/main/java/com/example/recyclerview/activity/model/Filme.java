package com.example.recyclerview.activity.model;

public class Filme {

    private String titulofilme;
    private String genero;
    private String ano;

    public Filme() {
    }

    public Filme(String titulofilme, String genero, String ano) {
        this.titulofilme = titulofilme;
        this.genero = genero;
        this.ano = ano;
    }

    public String getTitulofilme() {
        return titulofilme;
    }

    public void setTitulofilme(String titulofilme) {
        this.titulofilme = titulofilme;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

