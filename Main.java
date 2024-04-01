
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Animal {
    String nome;
    String especie;
    
    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animais = new ArrayList<>();
        List<Animal> gatos = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do animal (ou 'sair' para encerrar):");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite a espécie do animal:");
            String especie = scanner.nextLine();

            Animal animal = new Animal(nome, especie);
            animais.add(animal);

            if (especie.equalsIgnoreCase("gato")) {
                gatos.add(animal);
            }
        }

        System.out.println("Lista de todos os animais:");

        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.nome + ", Espécie: " + animal.especie);
        }

        System.out.println("Lista de gatos:");
        for (Animal gato : gatos) {
            System.out.println("Nome: " + gato.nome + ", Espécie: " + gato.especie);
        }
    }
}
