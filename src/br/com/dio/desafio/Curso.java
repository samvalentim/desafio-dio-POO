package br.com.dio.desafio;

public class Curso {
    private String titulo;
    private String descicao;
    private int cargaHoraria;

    public String getTitulo() {
        return titulo;
    }

    public Curso() {
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descicao='" + descicao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
