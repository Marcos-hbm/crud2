/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.DAL;

import br.unidf.DTO.CursosDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Suporte
 */
public class CursosDAL extends ConexaoMySQL {
    
    // Método CRUD conforme especificado
    public void crud() throws SQLException {
       
    }

    public void incluirCurso(CursosDTO curso) throws SQLException, java.sql.SQLException, Exception {
        try {
            abrirBD();
            SQL = "INSERT INTO Cursos (curNome, curEndereco) VALUES (?, ?)";
            ps = con.prepareStatement(SQL);
            ps.setString(1, curso.getCurNome());
            ps.setString(2, curso.getCurEndereco());
            ps.executeUpdate();
        } finally {
            fecharBD();
        }
    }

    public CursosDTO selecionarCursoPorID(int curID) throws SQLException, java.sql.SQLException, Exception {
        CursosDTO curso = new CursosDTO();
        try {
            abrirBD();
            SQL = "SELECT * FROM Cursos WHERE curID = ?";
            ps = con.prepareStatement(SQL);
            ps.setInt(1, curID);
            rs = ps.executeQuery();
            if (rs.next()) {
                curso.setCurID(rs.getInt("curID"));
                curso.setCurNome(rs.getString("curNome"));
                curso.setCurEndereco(rs.getString("curEndereco"));
            }
        } finally {
            fecharBD();
        }
        return curso;
    }

    public List<CursosDTO> selecionarListaCursos() throws SQLException, java.sql.SQLException, Exception {
        List<CursosDTO> listaCursos = new ArrayList<>();
        try {
            abrirBD();
            SQL = "SELECT * FROM Cursos ORDER BY curNome";
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                CursosDTO curso = new CursosDTO();
                curso.setCurID(rs.getInt("curID"));
                curso.setCurNome(rs.getString("curNome"));
                curso.setCurEndereco(rs.getString("curEndereco"));
                listaCursos.add(curso);
            }
        } finally {
            fecharBD();
        }
        return listaCursos;
    }

    public void alterarCurso(CursosDTO curso) throws SQLException, java.sql.SQLException, Exception {
        try {
            abrirBD();
            SQL = "UPDATE Cursos SET curNome = ?, curEndereco = ? WHERE curID = ?";
            ps = con.prepareStatement(SQL);
            ps.setString(1, curso.getCurNome());
            ps.setString(2, curso.getCurEndereco());
            ps.setInt(3, curso.getCurID());
            ps.execute();
        } finally {
            fecharBD();
        }
    }

    public void excluirCurso(int curID) throws SQLException, java.sql.SQLException, Exception {
        try {
            abrirBD();
            SQL = "DELETE FROM Cursos WHERE curID = ?";
            ps = con.prepareStatement(SQL);
            ps.setInt(1, curID);
            ps.execute();
        } finally {
            fecharBD();
        }
    }

    public CursosDTO selecionarCursosPorID(Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class SQLException extends Exception {

        public SQLException() {
        }
    }
}