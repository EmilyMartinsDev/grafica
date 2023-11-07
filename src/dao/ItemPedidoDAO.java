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
import model.ItemPedido;

/**
 *
 * @author ALEX
 */
public class ItemPedidoDAO {
         private Connection con;

    public ItemPedidoDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void cadastrarItem(ItemPedido obj){
    
    }
    
     public List<ItemPedido> listaItensComprados( int pedido_id) {
         return null;
    }
}
