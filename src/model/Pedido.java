/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ALEX
 */
public class Pedido {
     private int id;
    private Cliente cliente;
    private String data_pedido;
    private double total_pedido;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setTotal_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public double getTotal_pedido() {
        return total_pedido;
    }

    public void setTotal_venda(double total_pedido) {
        this.total_pedido = total_pedido;
    }
}
