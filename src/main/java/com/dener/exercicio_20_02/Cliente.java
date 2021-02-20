/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dener.exercicio_20_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dener
 */
public class Cliente {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String opt;

        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario gerenteImediato = new Funcionario("Gerente Imediato");
        Funcionario gerenteGeral = new Funcionario("Gerente Geral");
        Funcionario diretorFinanceiro = new Funcionario("Diretor Financeiro");
        Funcionario diretorGeral = new Funcionario("Diretor Geral");

        funcionarios.add(gerenteImediato);
        funcionarios.add(gerenteGeral);
        funcionarios.add(diretorFinanceiro);
        funcionarios.add(diretorGeral);

        Double valor = 15000D;
        System.out.println("Valor a ser pago: " + valor);
        for (Funcionario funcionario : funcionarios) {
            if (valor >= 0 && valor <= 500) {
                try {
                    if (funcionario.getCargoFuncionario().equals("Gerente Imediato")) {
                        System.out.println("Aprovar pagamento com Gerente Imediato? Y/N");
                        opt = entrada.nextLine();
                        if (opt.equalsIgnoreCase("Y")) {
                            funcionario.pagar();
                            break;
                        } else if (opt.equalsIgnoreCase("N")) {
                            System.out.println("Gerente Imediato NÃO APROVOU!");
                            break;
                        } else {
                            System.out.println("Caractere inválido!");
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                }
            } else if (valor >= 0 && valor <= 1500) {
                try {
                    if (funcionario.getCargoFuncionario().equals("Gerente Geral")) {
                        System.out.println("Aprovar pagamento com Gerente Geral? Y/N");
                        opt = entrada.nextLine();
                        if (opt.equalsIgnoreCase("Y")) {
                            funcionario.pagar();
                            break;
                        } else if (opt.equalsIgnoreCase("N")) {
                            System.out.println("Gerente Geral NÃO APROVOU!");
                            break;
                        } else {
                            System.out.println("Caractere inválido!");
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                }
            } else if (valor >= 0 && valor <= 5000) {
                try {
                    if (funcionario.getCargoFuncionario().equals("Diretor Financeiro")) {
                        System.out.println("Aprovar pagamento com Diretor Financeiro? Y/N");
                        opt = entrada.nextLine();
                        if (opt.equalsIgnoreCase("Y")) {
                            funcionario.pagar();
                            break;
                        } else if (opt.equalsIgnoreCase("N")) {
                            System.out.println("Diretor Financeiro NÃO APROVOU!");
                            break;
                        } else {
                            System.out.println("Caractere inválido!");
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                }
            } else if (valor >= 0 && valor <= 15000) {
                try {
                    if (funcionario.getCargoFuncionario().equals("Diretor Geral")) {
                        System.out.println("Aprovar pagamento com Diretor Geral? Y/N");
                        opt = entrada.nextLine();
                        if (opt.equalsIgnoreCase("Y")) {
                            funcionario.pagar();
                            break;
                        } else if (opt.equalsIgnoreCase("N")) {
                            System.out.println("Diretor Geral NÃO APROVOU!");
                            break;
                        } else {
                            System.out.println("Caractere inválido!");
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                }
            } else {
                System.out.println("Valor Inválido!");
                break;
            }
        }
    }
}
