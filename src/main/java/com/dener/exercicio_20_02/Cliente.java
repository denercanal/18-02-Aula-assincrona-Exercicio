/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dener.exercicio_20_02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dener
 */
public class Cliente {

    public static void main(String[] args) {

        BusinessAprovacao businessAprovar = new BusinessAprovacao();

        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario gerenteImediato = new Funcionario("Gerente Imediato");
        Funcionario gerenteGeral = new Funcionario("Gerente Geral");
        Funcionario diretorFinanceiro = new Funcionario("Diretor Financeiro");
        Funcionario diretorGeral = new Funcionario("Diretor Geral");

        funcionarios.add(gerenteImediato);
        funcionarios.add(gerenteGeral);
        funcionarios.add(diretorFinanceiro);
        funcionarios.add(diretorGeral);

        Double valor = 500D;
        System.out.println("Valor a ser pago: " + valor);
        businessAprovar.solicitarAprovacao(funcionarios, valor);
        
        valor = 1500D;
        System.out.println("Valor a ser pago: " + valor);
        businessAprovar.solicitarAprovacao(funcionarios, valor);
        
        valor = 5000D;
        System.out.println("Valor a ser pago: " + valor);
        businessAprovar.solicitarAprovacao(funcionarios, valor);
        
        valor = 15000D;
        System.out.println("Valor a ser pago: " + valor);
        businessAprovar.solicitarAprovacao(funcionarios, valor);
        
        valor = 15001D;
        System.out.println("Valor a ser pago: " + valor);
        businessAprovar.solicitarAprovacao(funcionarios, valor);
        
        valor = -1D;
        System.out.println("Valor a ser pago: " + valor);
        businessAprovar.solicitarAprovacao(funcionarios, valor);
    }
}