/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.Teste;

import br.unidf.DAL.CursosDAL;
import br.unidf.DTO.CursosDTO;

/**
 *
 * @author Suporte
 */
public class TesteSelecionarCursoPorID {
    public static void main(String[] args) throws Exception {
        CursosDAL dal = new CursosDAL();
        CursosDTO curso = dal.selecionarCursoPorID(1);
        System.out.println("Código: " + curso.getCurID());
        System.out.println("Nome do Curso: " + curso.getCurNome());
        System.out.println("Endereço: " + curso.getCurEndereco());
    }
}
