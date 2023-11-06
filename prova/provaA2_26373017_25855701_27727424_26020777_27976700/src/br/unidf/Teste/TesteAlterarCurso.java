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
public class TesteAlterarCurso {
    public static void main(String[] args) throws Exception {
        CursosDAL dal = new CursosDAL();
        CursosDTO curso = new CursosDTO();
        curso.setCurID(1);
        curso.setCurNome("Programação Java");
        curso.setCurEndereco("Sala 101");
        dal.alterarCurso(curso);
        System.out.print("Curso " + curso.getCurNome() + " alterado com sucesso!");
    }
}
