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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Cliente;
import java.util.List;
import java.sql.SQLException;
/**
 *
 * @author ALEX
 */
public class ClienteDAO {
     private Connection con;

    public ClienteDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public void cadastrarCliente(Cliente obj) {
        try {
            //escrever comando sql
            String sql = "insert into tb_clientes (nome, rg, cpf, email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "values (?,?,?,?,?,?,?,?,?,?,?,?,?);";

            //ORGANIZAR/Prepaarar O CODIGO SQL
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(6, obj.getCelular());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getEstado());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar" + err);
        }
    }

    public void excluirCliente(Cliente obj) {
        try {
            //escrever comando sql
            String sql = "delete from tb_clientes where id = ?";

            //ORGANIZAR/Prepaarar O CODIGO SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "erro ao excluir" + err);
        }
    }

    public void alterarCliente(Cliente obj) {
        try {
            //escrever comando sql
            String sql = "update tb_clientes set nome=?, rg=?, cpf=?, email=?,telefone=?,celular=?,cep=?,endereco=?,numero=?,complemento=?,bairro=?,cidade=?,estado=? where id=?";

            //ORGANIZAR/Prepaarar O CODIGO SQL
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(6, obj.getCelular());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getEstado());
            stmt.setInt(14, obj.getId());
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "erro ao alterar" + err);
        }
    }

    public List<Cliente> ListarClientes() {
        try {
            List<Cliente> lista = new ArrayList<>();

            String sql = "select * from tb_clientes";
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente obj = new Cliente();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setCelular(rs.getString("celular"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));

                lista.add(obj);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao listar" + e);

            return null;
        }

    }

    public List<Cliente> buscaClienteNome(String nome) {
        try {
            List<Cliente> lista = new ArrayList<>();

            String sql = "select * from tb_clientes where nome like?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente obj = new Cliente();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setCelular(rs.getString("celular"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));

                lista.add(obj);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao listar" + e);

            return null;
        }

    }

    public Cliente listarClientePorNomeTela(String nome) {
        try {

            String sql = "select * from tb_clientes where nome=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();
            Cliente obj = new Cliente();
            while (rs.next()) {
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setCelular(rs.getString("celular"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));

            }
            return obj;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao listar" + e);

            return null;
        }

    }
    public Cliente listarClientePorCPFTela(String cpf) {
        try {

            String sql = "select * from tb_clientes where cpf=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);

            ResultSet rs = stmt.executeQuery();
            Cliente obj = new Cliente();
            while (rs.next()) {
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setCelular(rs.getString("celular"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));

            }
            return obj;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao listar" + e);

            return null;
        }
    }
}

    


