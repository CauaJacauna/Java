/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList;
/**
 *
 * @author jacau
 */
public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private final ArrayList<Aluno> alunos;
    
    public Turma(){
        this.alunos = new ArrayList();
    }
    
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("Aluno "+ aluno.getNome() + " adicionado");
    }
    
    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
        System.out.println("Aluno "+ aluno.getNome() +" removido");
    }
    
    public void listarAlunos(){
        System.out.println("Lista dos Alunos: ");
        for (Aluno aluno : alunos){
            System.out.println(".  " + aluno.getNome());
        }
    }
}
