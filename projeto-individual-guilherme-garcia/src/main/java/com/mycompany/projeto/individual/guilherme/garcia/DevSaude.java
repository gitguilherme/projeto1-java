/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.individual.guilherme.garcia;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author guilherme.v.garcia
 */
public class DevSaude {
    
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, caro(a) dev, seja bem-vindo(a) ao DevSaúde!\n"
                + "Nesse período de home office, "
                + "devemos nos preocupar ainda mais com a nossa saúde!\n"
                + "A partir disso, o projeto a seguir tem como objetivo lhe "
                + "ajudar a manter a saúde em dia. \\o/");
       
        System.out.println("Para prosseguir, escolha uma opcão:");
        System.out.println("1- Quantas ml de água você deve ingerir diariamente?"
                + " \n2- Cálculo de Índice de massa corpóreo (IMC)"
                + " \n3- Sorteie dicas e desafios \\o/ \n4- Sair\n");
        Integer opcoes = leitor.nextInt();
    
        while (opcoes != 1 && opcoes != 2 && opcoes != 3 && opcoes != 4) {
            System.out.println("Opção inválida. Escolha uma da opção:");
            System.out.println("1- Quantas ml de água você deve ingerir diariamente?"
                    + " \n2- Cálculo de IMC"
                    + " \n3- Participe do desafio! \n4- Sair\n");
            opcoes = leitor.nextInt();

        }
        switch (opcoes) {
            case 1:
                System.out.println("Insira sua idade:");
                Integer idade = leitor.nextInt();
                System.out.println("Insira seu peso (kg):");
                Double peso = leitor.nextDouble();

                while (idade < 10 || idade > 100 || peso < 30.0 || peso > 250.0) {
                    System.out.println("\nDados inválidos!\n");
                    System.out.println("Insira sua idade:");
                    idade = leitor.nextInt();
                    System.out.println("Insira seu peso (kg):");
                    peso = leitor.nextDouble();

                }
                if (idade <= 17) {
                    Double qntd = peso * 40;
                    System.out.println(String.format("Você deve ingerir "
                            + "%.0f ml de água por dia", qntd));

                } else if (idade >= 18 && idade <= 55) {
                    Double qntd = peso * 35;
                    System.out.println(String.format("Você deve ingerir "
                            + "%.0f ml de água por dia!", qntd));

                } else if (idade >= 56 && idade <= 65) {
                    Double qntd = peso * 30;
                    System.out.println(String.format("Você deve ingerir "
                            + "%.0f ml de água por dia!", qntd));

                } else {
                    Double qntd = peso * 25;
                    System.out.println(String.format("Você deve ingerir "
                            + "%.0f ml de água por dia!", qntd));

                }

                System.out.println("\nAté a próxima! :)");
                break;

            case 2:

                System.out.println("Insira sua altura (m):");
                Double altura = leitor.nextDouble();
                System.out.println("Insira seu peso (kg):");
                Double pesoImc = leitor.nextDouble();

                while (altura < 1.00 || altura > 2.50
                       || pesoImc < 30.0 || pesoImc > 250.0) {
                    System.out.println("\nDados inválidos!\n");
                    System.out.println("Insira sua altura (m):");
                    altura = leitor.nextDouble();
                    System.out.println("Insira seu peso (kg):");
                    pesoImc = leitor.nextDouble();

                }
                Double imc = pesoImc / (altura * altura);

                if (imc <= 15) {
                    System.out.println("Abaixo do peso I: Procure um médico, "
                            + "você pode estar com problemas como anorexia.");
                } else if (imc > 15 && imc <= 18.5) {
                    System.out.println("Abaixo do peso I: Procure um médico, "
                            + "você pode estar com problemas como "
                            + "transtornos disgestivos.");
                } else if (imc > 18.5 && imc <= 24.9) {
                    System.out.println("Peso normal: Você está saudável, "
                            + "mantenha o seu IMC!");
                } else if (imc > 24.9 && imc <= 29.9) {
                    System.out.println("Acima do peso: Você pode estar "
                            + "com problemas como fadiga, tente alcancar "
                            + "o IMC ideal.");
                } else if (imc > 29.9 && imc <= 39.9) {
                    System.out.println("Obesidade I: Procure um médico, "
                            + "você pode estar com problemas como diabetes.");
                } else {
                    System.out.println("Obesidade II: Procure um médico, "
                            + "você pode estar com problemas como "
                            + "falta de ar e apneia");
                }
                System.out.println("\nAté a próxima! :)");
                break;

            case 3:
                
                for (var i = 1; i <= 1; i++) {
                    Integer sorteio = ThreadLocalRandom.current().nextInt(1, 5);

            switch (sorteio) {
                case 1:
                    System.out.println("Faça exercícios em casa,"
                            + " é bom para a saúde física e mental!");
                    break;
                case 2:
                    System.out.println("Se distraia um pouco: Longas jornadas "
                            + "de trabalho podem lhe fazer mal...");
                    break;
                case 3:
                    System.out.println("Levante-se e vá ingerir uma fruta! :)");
                    break;
                case 4:
                    System.out.println("Que tal praticar yoga? "
                            + "Irá lhe ajudar durante essa jornada!");
                    break;
                default:
                    System.out.println("Não esqueça de ingerir a quantidade "
                        + "de água recomendada por dia!");
                    break;
            }
                }
                System.out.println("\nAté a próxima! :)");
                break;

            default:
                
                System.out.println("\nCuide-se e até a próxima! :)");
                break;

        }
    }
    
}
