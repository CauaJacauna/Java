/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author jacau
 */
public class Professor extends Pessoa{
    private String centro;
    
    public String getCentro(){
        return centro;
    }
    
    public void darAula(){
        System.out.println("Deu aula");
    }
}
