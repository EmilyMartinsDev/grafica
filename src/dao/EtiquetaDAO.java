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
import model.Etiqueta;

/**
 *
 * @author ALEX
 */

enum Material {
    frente_verso,
    cores_frente,
    Verso_preto_fosco;

}
public class EtiquetaDAO {
    Connection con;
     public EtiquetaDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public void cadastrarProduto(Etiqueta obj) {
        try {
            String sql = "insert into tb_etiqueta (descricao, preco, qtd_estoque,tamanho, impressao,material ) values (?,?,?,?,?,?)";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtd_estoque());
             stmt.setDouble(4, obj.getTamanho());
              stmt.setObject(5, obj.getImpressao());
             stmt.setObject(6, obj.getMaterial());
              
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar" + err);
        }
    }

    public List<Etiqueta> listaretiqueta() {
        return null;
    }

    public void alterarProduto(Etiqueta obj) {

    }

    public void excluirProduto(Etiqueta obj) {

    }

    public List<Etiqueta> listaProdutosTela(String nome) {
        return null;
    }

    public Etiqueta listarProdutoPorNomeTela(String nome) {
        return null;
    }

    public Etiqueta listarProdutoPorCodigoTela(int id) {
        return null;

    }

    public void baixaEstoque(int id, int qtdNova) {
        
    }

    public int retornaqtdEstoqueAtual(int id) {
       return 0;
    }
    
    
    
    public void adicionarNoEstoque(int id, int qtdNova) {
        

}
}
