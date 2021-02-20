/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dener.exercicio_20_02;

import java.util.List;

/**
 *
 * @author dener
 */
public class BusinessAprovacao {

    public boolean solicitarAprovacao(List<Funcionario> f, Double valor) {
        String opt;
        for (Funcionario funcionario : f) {
            if (valor >= 0 && valor <= 500) {
                try {
                    if (funcionario.getCargoFuncionario().equals("Gerente Imediato")) {
                        opt = "y";
                        if (opt.equalsIgnoreCase("Y")) {
                            funcionario.pagar();
                            return true;
                        } else {
                            System.out.println("Gerente Imediato NÃO APROVOU!");
                            return false;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                }
            } else if (valor >= 0 && valor <= 1500) {
                try {
                    if (funcionario.getCargoFuncionario().equals("Gerente Geral")) {
                        opt = "y";
                        if (opt.equalsIgnoreCase("Y")) {
                            funcionario.pagar();
                            return true;
                        } else {
                            System.out.println("Gerente Geral NÃO APROVOU!");
                            return false;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                }
            } else if (valor >= 0 && valor <= 5000) {
                try {
                    if (funcionario.getCargoFuncionario().equals("Diretor Financeiro")) {
                        opt = "y";
                        if (opt.equalsIgnoreCase("Y")) {
                            funcionario.pagar();
                            return true;
                        } else {
                            System.out.println("Diretor Financeiro NÃO APROVOU!");
                            return false;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                }
            } else if (valor >= 0 && valor <= 15000) {
                try {
                    if (funcionario.getCargoFuncionario().equals("Diretor Geral")) {
                        opt = "y";
                        if (opt.equalsIgnoreCase("Y")) {
                            funcionario.pagar();
                            return true;
                        } else {
                            System.out.println("Diretor Geral NÃO APROVOU!");
                            return false;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                }
            } else {
                System.out.println("Valor Inválido!");
                return false;
            }
        }
        return true;
    }

}
