package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resp, pers;
        Scanner sc = new Scanner(System.in);
        List <Personagem> personagensList = new ArrayList<>();

        do {
            System.out.println("Escolha uma opção: \n" +
                    "   1- Criar um personagem.\n" +
                    "   2- Excluir um personagem.\n" +
                    "   3- Batalhar.\n" +
                    "   0- Sair.\n" +
                    "Resp: ");
            resp = sc.nextInt();
            switch (resp){
                case 1:{
                    if (personagensList.size() < 2){
                        System.out.println("\n\n1- Criar Arqueiro.\n" +
                                "2- Criar Guerreiro.\n" +
                                "3- Criar Mago.");
                        pers = sc.nextInt();
                        switch (pers){
                            case 1: {
                                Arqueiro a = new Arqueiro();

                                System.out.println("Digite o nome: ");
                                a.setNome(sc.next());
                                System.out.println("Digite o nivel: ");
                                a.setNivel(sc.nextInt());
                                System.out.println("Digite o HP: ");
                                a.setHp(sc.nextInt());
                                System.out.println("Digite o ataque: ");
                                a.setAtk(sc.nextInt());
                                System.out.println("Digite a defesa: ");
                                a.setDef(sc.nextInt());
                                System.out.println("Digite a precisao: ");
                                a.setPrecisao(sc.nextInt());
                                System.out.println("Digite o alcance: ");
                                a.setAlcance(sc.nextInt());

                                personagensList.add(a);

                                break;
                            }
                            case 2: {
                                Guerreiro g = new Guerreiro();

                                System.out.println("Digite o nome: ");
                                g.setNome(sc.next());
                                System.out.println("Digite o nivel: ");
                                g.setNivel(sc.nextInt());
                                System.out.println("Digite o HP: ");
                                g.setHp(sc.nextInt());
                                System.out.println("Digite o ataque: ");
                                g.setAtk(sc.nextInt());
                                System.out.println("Digite a defesa: ");
                                g.setDef(sc.nextInt());
                                System.out.println("Digite a força extra: ");
                                g.setForcaExtra(sc.nextInt());
                                System.out.println("Digite a armadura: ");
                                g.setArmadura(sc.nextInt());

                                personagensList.add(g);

                                break;
                            }
                            case 3: {
                                Mago m = new Mago();

                                System.out.println("Digite o nome: ");
                                m.setNome(sc.next());
                                System.out.println("Digite o nivel: ");
                                m.setNivel(sc.nextInt());
                                System.out.println("Digite o HP: ");
                                m.setHp(sc.nextInt());
                                System.out.println("Digite o ataque: ");
                                m.setAtk(sc.nextInt());
                                System.out.println("Digite a defesa: ");
                                m.setDef(sc.nextInt());
                                System.out.println("Digite a mana: ");
                                m.setMana(sc.nextInt());
                                System.out.println("Digite o poder mágico: ");
                                m.setPoderMagico(sc.nextInt());

                                personagensList.add(m);

                                break;
                            }
                            default:
                                System.out.println("\nSelecione uma opção viável.\n");
                        }
                    }else
                        System.out.println("\nListagem cheia, exclua ou batalhe com os personagens.\n");
                    break;
                }
                case 2:{
                    if (personagensList.size() > 0){
                        System.out.println("Personagem " + personagensList.size() + " foi removido.");
                        personagensList.removeLast();
                    }else
                        System.out.println("\nNenhum personagem na lista.\n");

                    break;
                }
                case 3:{
                    if (personagensList.size() == 2){
                        do {

                        }while(personagensList.get(0).estaVivo() && personagensList.get(1).estaVivo());
                    }else
                        System.out.println("\nCrie 2 personagens para batalhar\n");
                    break;
                }
                case 0:{
                    System.out.println("\nSaindo...");
                    break;
                }
                default:
                    System.out.println("\nEscolha uma opção viável.\n");
            }
        }while(resp != 0);
    }
}