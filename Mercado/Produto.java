package Mercado;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

 
class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private int quantidade;
    private Double preco;
 
    public int getCodigo() {
        return codigo;
    }
 
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getDescricao() {
        return descricao;
    }
 
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
 
    public int getQuantidade() {
        return quantidade;
    }
 
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
 
    public double getPreco() {
        return preco;
    }
 
    public void setPreco(double preco) {
        this.preco = preco;
    }
 
    public String exibirDetalhes() {
        return "Código: " + codigo + ", Nome: " + nome + ", Descrição: " + descricao + ", Quantidade: " + quantidade + ", Preço: " + preco;
    }
 
    public void gravaEstoque(int codigo, String nome, String descricao, int quantidade, double preco) throws IOException {
        FileWriter writer = new FileWriter("estoque.txt", true);
        writer.write("Código: " + codigo + ", Nome: " + nome + ", Descrição: " + descricao + ", Quantidade: " + quantidade + ", Preço: " + preco + "\n");
        writer.close();
    }
}
 

