package br.com.unicesumar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Batalhar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Personagem> personagens = new ArrayList<>();

        while(true){
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar um personagem");
            System.out.println("2 - Exibir todos os personagens");
            System.out.println("3 - Iniciar Batalha");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    criarPersonagem(scanner, personagens);
                    break;
                case 2:
                    exibirPersonagem(personagens);
                    break;
                case 3:
                    iniciarBatalha(scanner, personagens);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println();
                    System.out.println();
                    System.out.println("Opção inválida, tente novamente.");
                    System.out.println();
                    System.out.println();
            }
        }
    }

    private static void criarPersonagem(Scanner scanner, List<Personagem> personagens){
        System.out.println("Escolha a classe do personagem");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch(opcao){
            case 1:
                System.out.print("Nome: ");
                String nomeGuerreiro = scanner.nextLine();
                System.out.print("Nível: ");
                int nivelGuerreiro = scanner.nextInt();
                System.out.print("HP: ");
                int hpGuerreiro = scanner.nextInt();
                System.out.print("ATK: ");
                int ataqueGuerreiro = scanner.nextInt();
                System.out.print("DEF: ");
                int defGuerreiro = scanner.nextInt();
                System.out.print("Força extra: ");
                int forcaExtra = scanner.nextInt();
                System.out.print("Armadura: ");
                int armadura = scanner.nextInt();
                scanner.nextLine();
                personagens.add(new Guerreiro(nomeGuerreiro, nivelGuerreiro, hpGuerreiro, ataqueGuerreiro, defGuerreiro, forcaExtra, armadura));
                break;
            case 2:
                System.out.print("Nome: ");
                String nomeMago = scanner.nextLine();
                System.out.print("Nível: ");
                int nivelMago = scanner.nextInt();
                System.out.print("HP: ");
                int hpMago = scanner.nextInt();
                System.out.print("ATK: ");
                int ataqueMago = scanner.nextInt();
                System.out.print("DEF: ");
                int defMago = scanner.nextInt();
                System.out.print("Mana: ");
                int mana = scanner.nextInt();
                System.out.print("Poder Mágico: ");
                int poderMagico = scanner.nextInt();
                scanner.nextLine();
                personagens.add(new Mago(nomeMago, nivelMago, hpMago, ataqueMago, defMago, mana, poderMagico));
                break;
            case 3:
                System.out.print("Nome: ");
                String nomeArqueiro = scanner.nextLine();
                System.out.print("Nível: ");
                int niveArqueiro = scanner.nextInt();
                System.out.print("HP: ");
                int hpArqueiro = scanner.nextInt();
                System.out.print("ATK: ");
                int ataqueArqueiro = scanner.nextInt();
                System.out.print("DEF: ");
                int defArqueiro = scanner.nextInt();
                System.out.print("Precisão: ");
                int precisao = scanner.nextInt();
                System.out.print("Alcance: ");
                int alcance = scanner.nextInt();
                scanner.nextLine();
                personagens.add(new Arqueiro(nomeArqueiro, niveArqueiro, hpArqueiro, ataqueArqueiro, defArqueiro, precisao, alcance));
                break;
            default:
                System.out.println("Classe inválida, tente novamente.");
        }
    }

    private static void exibirPersonagem(List<Personagem> personagens){
        System.out.println();
        System.out.println();
        System.out.println("Lista de Personagens: ");
        System.out.println();
        System.out.println();
        for (Personagem personagem : personagens) {
            personagem.exibirStatus();
            System.out.println();
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    private static void iniciarBatalha(Scanner scanner, List<Personagem> personagens){

        if(personagens.size() < 2) {
            System.out.println();
            System.out.println();
            System.out.println("Você precisa de pelo menos dois personagens para iniciar uma batalha");
            System.out.println();
            System.out.println();
            return;
        }

        System.out.println();
        System.out.println("Escolha o primeiro personagem(índice):");
        for (int i = 0; i < personagens.size(); i++) {
            System.out.println(i + " - " + personagens.get(i).getNome());
        }
        int index1 = scanner.nextInt();
        scanner.nextLine();
        Personagem p1 = personagens.get(index1);
        System.out.println();

        System.out.println();
        System.out.println("Escolha o segundo personagem(índice): ");
        for (int i = 0; i < personagens.size(); i++) {
            System.out.println(i + " - " + personagens.get(i).getNome());
        }
        int index2 = scanner.nextInt();
        scanner.nextLine();
        Personagem p2 = personagens.get(index2);
        System.out.println();

        batalhar(p1,p2);
    }

    private static void batalhar(Personagem p1, Personagem p2){
        System.out.println();
        System.out.println("Iniciando batalha entre " + p1.getNome() + " e " + p2.getNome());
        System.out.println();

        while(p1.estaVivo() && p2.estaVivo()){
            System.out.println(p1.getNome() + " ataca " + p2.getNome());
            System.out.println();
            p1.atacar(p2);
            p2.exibirStatus();
            System.out.println();
            if (!p2.estaVivo()){
                System.out.println(p2.getNome() + " foi derrotado");
                System.out.println();
                break;
            }

            System.out.println(p2.getNome() + " ataca " + p1.getNome());
            System.out.println();
            p2.atacar(p1);
            System.out.println();
            p1.exibirStatus();
            if(!p1.estaVivo()){
                System.out.println(p1.getNome() + " foi derrotado");
                System.out.println();
                break;
            }
        }

        System.out.println();
        System.out.println("A batalha acabou");
        System.out.println();
        System.out.println();
    }
}



