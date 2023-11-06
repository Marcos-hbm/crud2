/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.DTO;

/**
 *
 * @author Suporte
 */
    
    public class CursosDTO {
    private int curID;
    private String curNome;
    private String curEndereco;

    // Getters e setters
    public int getCurID() {
        return curID;
    }

    public void setCurID(int curID) {
        this.curID = curID;
    }

    public String getCurNome() {
        return curNome;
    }

    public void setCurNome(String curNome) {
        this.curNome = curNome;
    }

    public String getCurEndereco() {
        return curEndereco;
    }

    public void setCurEndereco(String curEndereco) {
        this.curEndereco = curEndereco;
    }
}