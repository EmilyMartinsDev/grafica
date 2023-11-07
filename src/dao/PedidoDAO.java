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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pedido;

/**
 *
 * @author ALEX
 */
public class PedidoDAO {
        private Connection con;

    public PedidoDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public void cadastrarPedido(Pedido obj) {
   
    }

    public int retornaUltimaPedido() {
        
            return 0;
        
    }

       public double retornaValorPorData( LocalDate data) {

        return 0;
    }
     
     
}
