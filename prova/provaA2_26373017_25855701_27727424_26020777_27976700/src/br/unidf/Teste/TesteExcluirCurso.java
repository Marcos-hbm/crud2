/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.Teste;

import br.unidf.DAL.CursosDAL;

/**
 *
 * @author Suporte
 */
public class TesteExcluirCurso {
    public static void main(String[] args) throws Exception {
        CursosDAL dal = new CursosDAL();
        dal.excluirCurso(4);
        System.out.print("Curso excluído com sucesso!");
    }
}
