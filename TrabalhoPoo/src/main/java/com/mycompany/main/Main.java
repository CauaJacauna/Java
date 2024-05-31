/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author jacau
 */
public class Main {

    public static void main(String[] args) {
        
        /*Pessoa p1 = new Pessoa();
        p1.nome = "Caua";
        p1.idade = 20;
        
        p1.status();*/
        
        Aluno a1 = new Aluno();
        a1.setNome("Joao");
        
        a1.pagarMensalidade();
        System.out.println("#================================#");
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Eduarda");
        
        Regular r1 = new Regular();
        r1.setNome("Caua");

          Turma t1 = new Turma();
          t1.adicionarAluno(a1);
          t1.adicionarAluno(b1);
          t1.adicionarAluno(r1);
          
          t1.listarAlunos();
          t1.removerAluno(a1);
          t1.listarAlunos();
    }
}
