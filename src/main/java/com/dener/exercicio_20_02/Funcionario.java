/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dener.exercicio_20_02;

/**
 *
 * @author dener
 */
public class Funcionario {

    private String cargoFuncionario;

    public Funcionario(){}
    
    public Funcionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    public String getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }
    
    public Boolean pagar(){
        System.out.println(this.getCargoFuncionario() + " PAGOU!");
        return true;
    }
}
