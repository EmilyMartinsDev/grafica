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
enum Material {
    frente_verso,
    cores_frente,
    Verso_preto_fosco;

}

enum ImpressaoEmum {
    Vinil,
    eletrostático
}
public class Etiqueta {
       private int id;
    private String descricao;
    private double preco;
    private double tamanho;
    private Material material;
    private int qtd_estoque;
    private ImpressaoEmum impressao;

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public ImpressaoEmum getImpressao() {
        return impressao;
    }

    public void setImpressao(ImpressaoEmum impressao) {
        this.impressao = impressao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    

}
