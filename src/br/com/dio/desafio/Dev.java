package br.com.dio.desafio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscricao = new LinkedHashSet<>();
    private Set<Conteudo> conteudosconcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp (Bootcamp bootcamp){
        this.conteudosInscricao.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscricao.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosconcluidos.add(conteudo.get());
            this.conteudosInscricao.remove(conteudo.get());
        } else{
            System.out.println("Você não está matriculado em nenhum conteúdo!");
        }

    }

    public double calcularTotalXp(){
        Iterator<Conteudo> iterator = this.conteudosconcluidos.iterator();
        double soma =0;
        while (iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        /*this.conteudosconcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();*/

        return soma;
    }

    private void While(boolean hasNext) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscricao() {
        return conteudosInscricao;
    }

    public void setConteudosInscricao(Set<Conteudo> conteudosInscricao) {
        this.conteudosInscricao = conteudosInscricao;
    }

    public Set<Conteudo> getConteudosconcluidos() {
        return conteudosconcluidos;
    }

    public void setConteudosconcluidos(Set<Conteudo> conteudosconcluidos) {
        this.conteudosconcluidos = conteudosconcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev)) return false;
        Dev dev = (Dev) o;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConteudosInscricao(), dev.getConteudosInscricao()) && Objects.equals(getConteudosconcluidos(), dev.getConteudosconcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscricao(), getConteudosconcluidos());
    }
}
