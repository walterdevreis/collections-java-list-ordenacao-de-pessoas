import entity.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Pedro", 50, 1.80);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getAltura());
        System.out.println(pessoa.getIdade());

        System.out.println("------------------");

        System.out.println(pessoa);

    }
}