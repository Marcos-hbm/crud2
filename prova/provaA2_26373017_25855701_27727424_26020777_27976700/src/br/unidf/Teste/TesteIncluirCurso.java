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
public class TesteIncluirCurso {
    public static void main(String[] args) throws Exception {
        CursosDTO curso = new CursosDTO();
        curso.setCurNome("Programação Java");
        curso.setCurEndereco("Sala 101");
        CursosDAL dal = new CursosDAL();
        dal.incluirCurso(curso);
        System.out.print("Curso " + curso.getCurNome() + " cadastrado com sucesso!");
    }
}
