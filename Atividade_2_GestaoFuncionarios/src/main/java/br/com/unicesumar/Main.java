package br.com.unicesumar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        ArrayList<FuncionarioMeioPeriodo> listaFuncionariosMeioPeriodo = new ArrayList<>();
        ArrayList<FuncionarioTempoIntegral> listaFuncionariosIntegral = new ArrayList<>();
        ArrayList<Estagiario> listaEstagiario = new ArrayList<>();

        System.out.println("\tGESTOR DE FUNCIONÁRIOS");

        String opcao;
        do {
            System.out.println("\nMenu:\n");
            System.out.println("""
                      1 -- Adicionar Funcionário
                      2 -- Adicionar Funcionário de meio período
                      3 -- Adicionar Funcionário de tempo integral
                      4 -- Adicionar Estagiário
                      5 -- Imprimir informações
                    
                      0 -- Sair
                    """);

            do {
                opcao = sc.nextLine();
            } while (!opcao.equals("0") && !opcao.equals("1") && !opcao.equals("2") &&
                    !opcao.equals("3") && !opcao.equals("4") && !opcao.equals("5"));

            switch (opcao) {
                case "1":
                    System.out.println("Funcionário:");
                    listaFuncionarios.add(addFuncionario());
                    break;

                case "2":
                    System.out.println("Funcionário de meio período:");
                    listaFuncionariosMeioPeriodo.add(addFuncionarioMeioPeriodo());
                    break;

                case "3":
                    System.out.println("Funcionário Integral:");
                    listaFuncionariosIntegral.add(addFuncionarioIntegral());
                    break;

                case "4":
                    System.out.println("Estagiário:");
                    listaEstagiario.add (addEstagiario());
                    break;

                case "5":
                    exibirInformacoes(listaFuncionarios, listaFuncionariosMeioPeriodo, listaFuncionariosIntegral, listaEstagiario);
                    break;
            }

        } while (!opcao.equals("0"));

        System.out.println("\nbye bye");
        sc.close();

    }

//-----------------------------------------------------------------------//

    static Funcionario addFuncionario() {
         Scanner sc = new Scanner(System.in);

         System.out.print("Nome: ");
         String nome = sc.nextLine();

         System.out.print("CPF: ");
         String cpf = sc.nextLine();

         System.out.print("Salário base: ");
         float salarioBase = sc.nextFloat();

         sc.nextLine();

         Funcionario func = new Funcionario(nome, cpf, salarioBase);
         return func;
     }

//-----------------------------------------------------------------------//

    static FuncionarioMeioPeriodo addFuncionarioMeioPeriodo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Horas trabalhadas: ");
        float horasTrabalhadas = sc.nextFloat();
        sc.nextLine();

        System.out.print("Valor da hora trabalhada: ");
        float valorHoraTrabalhada = sc.nextFloat();
        sc.nextLine();

        FuncionarioMeioPeriodo func = new FuncionarioMeioPeriodo(nome, cpf, horasTrabalhadas, valorHoraTrabalhada);
        return func;
    }

//-----------------------------------------------------------------------//

    static FuncionarioTempoIntegral addFuncionarioIntegral() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Salário base: ");
        float salarioBase = sc.nextFloat();
        sc.nextLine();

        System.out.print("Bonus (%): ");
        float bonus = sc.nextFloat();
        sc.nextLine();

        FuncionarioTempoIntegral func = new FuncionarioTempoIntegral(nome, cpf, salarioBase, bonus);
        return func;
    }

//-----------------------------------------------------------------------//

    static Estagiario addEstagiario() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Instituição de ensino: ");
        String instituicao = sc.nextLine();

        System.out.print("Bolsa auxílio: ");
        float bolsa = sc.nextFloat();
        sc.nextLine();

        Estagiario est = new Estagiario(nome, cpf, instituicao, bolsa);
        return est;
    }

//-----------------------------------------------------------------------//

    static void exibirInformacoes(ArrayList<Funcionario> listaFuncionarios, ArrayList<FuncionarioMeioPeriodo> listaFuncionariosMeioPeriodo, ArrayList<FuncionarioTempoIntegral> listaFuncionariosIntegral, ArrayList<Estagiario> listaEstagiario){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nExibir informações de:");
        System.out.println("""
                  1 -- Funcionários
                  2 -- Funcionários de meio período
                  3 -- Funcionários em tempo integral
                  4 -- Estagiários
                """);
        
        String opcao;
        do{
            opcao = sc.nextLine();
        }while (!opcao.equals("1") && !opcao.equals("2") && 
                !opcao.equals("3")&& !opcao.equals("4"));
        
        switch (opcao) {
            case "1":
                System.out.println("Lista de funcionários:");
                for (int i = 0; i < listaFuncionarios.size(); i++) {
                    System.out.print("\n\t"+(i+1)+"°\n");
                    listaFuncionarios.get(i).exibirInformacoes();
                }
                break;

            case "2":
                System.out.println("Lista de funcionários de meio período:");
                for (int i = 0; i < listaFuncionariosMeioPeriodo.size(); i++) {
                    System.out.print("\n\t"+(i+1)+"°\n");
                    listaFuncionariosMeioPeriodo.get(i).exibirInformacoes();
                }
                break;

            case "3":
                System.out.println("Lista de funcionários integrais:");
                for (int i = 0; i < listaFuncionariosIntegral.size(); i++) {
                    System.out.print("\n\t"+(i+1)+"°\n");
                    listaFuncionariosIntegral.get(i).exibirInformacoes();
                }
                break;

            case "4":
                System.out.println("Lista de estagiários:");
                for (int i = 0; i < listaEstagiario.size(); i++) {
                    System.out.print("\n\t"+(i+1)+"°\n");
                    listaEstagiario.get(i).exibirInformacoes();
                }
                break;
        }
    }
}