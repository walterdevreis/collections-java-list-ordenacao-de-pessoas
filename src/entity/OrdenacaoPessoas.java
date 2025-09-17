package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas(){
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

   public void ordenarPorIdade(){
       Collections.sort(listaDePessoas, (p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));

       System.out.println(listaDePessoas);
  }

  public void ordernarPorAltura(){
        Collections.sort(listaDePessoas, (p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));

        System.out.println(listaDePessoas);
  }

}
