import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoas {
    String nome;
    String sexo;

    public Pessoas(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
}

public class generoPessoa {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        List<Pessoas> geral = new ArrayList<>();
        List<Pessoas> masculino = new ArrayList();
        List<Pessoas> feminino = new ArrayList();

        while(true) {
            System.out.println("Digite o nome da pessoa(ou 'sair' para encerrar):");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o sexo da pessoa:");
            String sexo = scanner.nextLine();

            Pessoas pessoas = new Pessoas(nome, sexo);
            geral.add(pessoas);

            if (sexo.equalsIgnoreCase("feminino")) {
                feminino.add(pessoas);
            } else if (sexo.equalsIgnoreCase("masculino")) {
                masculino.add(pessoas);
            }
        }

        System.out.println("Lista geral:");
        for(Pessoas pessoas : geral){
            System.out.println("Nome: " + pessoas.nome + ", Sexo: " + pessoas.sexo);
        }
        System.out.println();

        System.out.println("Lista de homens:");
        for(Pessoas pessoas : masculino){
            System.out.println("Nome: " + pessoas.nome + ", Sexo: " + pessoas.sexo);
        }
        System.out.println();

        System.out.println("Lista de mulheres:");
        for(Pessoas pessoas : feminino) {
            System.out.println("Nome: " + pessoas.nome + ", Sexo: " + pessoas.sexo);
        }
    }
}