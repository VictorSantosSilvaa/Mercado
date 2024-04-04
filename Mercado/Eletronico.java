package Mercado;
import java.io.FileWriter;
import java.io.IOException;


class Eletronico extends Produto {
    private String marca;
    private String modelo;
 
//    public Eletronico() {
//    	marca = marca;
//    	modelo = modelo;
//    }
    
    public String getMarca() {
        return marca;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }
 
    public String getModelo() {
        return modelo;
    }
 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Marca: " + marca + ", Modelo: " + modelo;
    }
 
    @Override
    public void gravaEstoque(int codigo, String nome, String descricao, int quantidade, double preco) throws IOException {
        FileWriter writer = new FileWriter("estoque.txt", true);
        writer.write("Código: " + codigo + ", Nome: " + nome + ", Descrição: " + descricao + ", Quantidade: " + quantidade + ", Preço: " + preco + ", Marca: " + marca + ", Modelo: " + modelo + "\n");
        writer.close();
    }
}