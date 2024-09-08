package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestaoFuncionarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionariosList = new ArrayList<>();
        int resp;

        do {
            System.out.println("Escolha uma opção:\n" +
                    "   1- Cadastrar Estagiário.\n" +
                    "   2- Cadastrar Funcionario Meio Periodo.\n" +
                    "   3- Cadastrar Funcionario Tempo Integral.\n" +
                    "   4- Exibir informações de todos os funcionários.\n" +
                    "   5- Mostrar salários de todos os funcionários.\n" +
                    "   0- Sair.\n" +
                    "Resp: ");
            resp = sc.nextInt();

            switch(resp){
                case 1:{
                    Estagiario estag = new Estagiario();
                    System.out.println("Digite o nome: ");
                    estag.setNome(sc.next());
                    System.out.println("Digite o cpf: ");
                    estag.setCpf(sc.next());
                    System.out.println("Digite o valor da bolsa auxílio: ");
                    estag.setBolsaAuxilio(sc.nextDouble());
                    System.out.println("Digite a instituição de ensino: ");
                    estag.setInstEnsino(sc.next());

                    estag.exibirInformacoes();
                    funcionariosList.add(estag);
                    break;
                }
                case 2: {
                    FuncionarioMeioPeriodo funcionario = new FuncionarioMeioPeriodo();

                    System.out.println("Digite o nome: ");
                    funcionario.setNome(sc.next());
                    System.out.println("Digite o cpf: ");
                    funcionario.setCpf(sc.next());
                    System.out.println("Digite as horas trabalhadas: ");
                    funcionario.setHorasTrabalhadas(sc.nextInt());
                    System.out.println("Digite o valor por hora: ");
                    funcionario.setValorPorHora(sc.nextInt());

                    funcionario.exibirInformacoes();
                    funcionariosList.add(funcionario);
                    break;
                }
                case 3: {
                    FuncionarioTempoIntegral funcionario = new FuncionarioTempoIntegral();

                    System.out.println("Digite o nome: ");
                    funcionario.setNome(sc.next());
                    System.out.println("Digite o cpf: ");
                    funcionario.setCpf(sc.next());
                    System.out.println("Digite o salário base: ");
                    funcionario.setSalarioBase(sc.nextDouble());
                    System.out.println("Digite o bonus: ");
                    funcionario.setBonus(sc.nextInt());

                    funcionario.exibirInformacoes();
                    funcionariosList.add(funcionario);
                    break;
                }
                case 4: {
                    for (int i = 0; i < funcionariosList.size(); i++) {
                        funcionariosList.get(i). exibirInformacoes();
                        System.out.println("\n\n");
                    }
                    break;
                }
                case 5: {
                    for (int i = 0; i < funcionariosList.size(); i++) {
                        System.out.println("Nome: " + funcionariosList.get(i).getNome());
                        System.out.println("Salario: " + funcionariosList.get(i).calcularSalario());
                        System.out.println("\n\n9");
                    }
                    break;
                }
            }
        }while(resp != 0);
    }
}
