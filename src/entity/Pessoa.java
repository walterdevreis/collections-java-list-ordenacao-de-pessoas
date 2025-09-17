package entity;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>, Comparator<Pessoa>{

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(){
    }

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(this.getIdade(), pessoa.getIdade());
    }


    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
    }

    public String toString(){
        return "Nome: "
                + getNome()
                + "\n"
                + "Idade: "
                + getIdade()
                + "\n"
                + "Altura: "
                + getAltura();
    }

}
