import entity.OrdenacaoPessoas;
import entity.Pessoa;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Alisson", 47, 1.85);
        ordenacaoPessoas.adicionarPessoa("João Marcos", 25, 1.75);
        ordenacaoPessoas.adicionarPessoa("Marcos Vinicius", 46, 1.77);
        ordenacaoPessoas.adicionarPessoa("Vanessa da Cunha", 22, 1.65);
        ordenacaoPessoas.adicionarPessoa("Maria Luiza", 18, 1.68);

        System.out.println("--------------------------------------");

        System.out.println("Ordenar por Idade:");
        ordenacaoPessoas.ordenarPorIdade();

        System.out.println("--------------------------------------");

        System.out.println("Ordernar por Altura:");
        ordenacaoPessoas.ordernarPorAltura();

    }
}