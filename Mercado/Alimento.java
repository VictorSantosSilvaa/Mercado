package Mercado;

import java.io.FileWriter;
import java.io.IOException;

class Alimento extends Produto {
    private String dataValidade;
 
    public String getDataValidade() {
        return dataValidade;
    }
 
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
 
    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Data de Validade: " + dataValidade;
    }
 
    @Override
    public void gravaEstoque(int codigo, String nome, String descricao, int quantidade, double preco) throws IOException {
        FileWriter writer = new FileWriter("estoque.txt", true);
        writer.write("Código: " + codigo + ", Nome: " + nome + ", Descrição: " + descricao + ", Quantidade: " + quantidade + ", Preço: " + preco + ", Data de Validade: " + dataValidade + "\n");
        writer.close();
    }
}