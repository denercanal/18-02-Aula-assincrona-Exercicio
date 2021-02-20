/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.dener.exercicio_20_02.BusinessAprovacao;
import com.dener.exercicio_20_02.Funcionario;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dener
 */
public class AprovacaoFuncionarioTest {
    
    public AprovacaoFuncionarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void CT001() {
        BusinessAprovacao businessAprovacao = new BusinessAprovacao();
        List<Funcionario> funcionarios = new ArrayList<>();
        
        Funcionario funcionario = new Funcionario("Gerente Imediato");
        
        funcionarios.add(funcionario);
        
        var aprovou = businessAprovacao.solicitarAprovacao(funcionarios, 500D);
        System.out.println(aprovou);
        
        assertEquals(aprovou, true);
    }
    @Test
    public void CT002() {
        BusinessAprovacao businessAprovacao = new BusinessAprovacao();
        List<Funcionario> funcionarios = new ArrayList<>();
        
        Funcionario funcionario = new Funcionario("Gerente Geral");
        
        funcionarios.add(funcionario);
        
        var aprovou = businessAprovacao.solicitarAprovacao(funcionarios, 1500D);
        System.out.println(aprovou);
        
        assertEquals(aprovou, true);
    }
    
    @Test
    public void CT003() {
        BusinessAprovacao businessAprovacao = new BusinessAprovacao();
        List<Funcionario> funcionarios = new ArrayList<>();
        
        Funcionario funcionario = new Funcionario("Diretor Financeiro");
        
        funcionarios.add(funcionario);
        
        var aprovou = businessAprovacao.solicitarAprovacao(funcionarios, 5000D);
        System.out.println(aprovou);
        
        assertEquals(aprovou, true);
    }
    @Test
    public void CT004() {
        BusinessAprovacao businessAprovacao = new BusinessAprovacao();
        List<Funcionario> funcionarios = new ArrayList<>();
        
        Funcionario funcionario = new Funcionario("Diretor Geral");
        
        funcionarios.add(funcionario);
        
        var aprovou = businessAprovacao.solicitarAprovacao(funcionarios, 15000D);
        System.out.println(aprovou);
        
        assertEquals(aprovou, true);
    }
    @Test
    public void CT005() {
        BusinessAprovacao businessAprovacao = new BusinessAprovacao();
        List<Funcionario> funcionarios = new ArrayList<>();
        
        Funcionario funcionario = new Funcionario("Gerente Geral");
        
        funcionarios.add(funcionario);
        
        var aprovou = businessAprovacao.solicitarAprovacao(funcionarios, -15000D);
        System.out.println(aprovou);
        
        assertEquals(aprovou, false);
    }
}
