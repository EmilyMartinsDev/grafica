/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author ALEX
 */
public class UsuarioDAO {
      private Connection con;

    public UsuarioDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public void cadastrarFuncionario(Usuario obj) {
       
    }

    public List<Usuario> listarFuncionario() {
      return null;
    }

    public void excluirFuncionario(Usuario obj) {
        

    }

    public void alterarFuncionario(Usuario obj) {
       
    }

    public List<Usuario> buscaFuncionarioNome(String nome) {
      
            return null;
        
    }
    public void efetuaLogin(String email, String senha){
       
    }
}
