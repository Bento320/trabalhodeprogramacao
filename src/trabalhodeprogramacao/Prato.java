/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhodeprogramacao;

import java.util.Scanner;

/**
 *
 * @author Bento Ambrósio
 */
public class Prato {
//    Atributos
    private String nome;
    private String recheio;
    private double preco;
    private String dataDeVAlidade;
    private float peso;
    
//    Métodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco() {
        if(peso < 5){
            this.preco = 10000;
        }else if(peso < 6){
            this.preco = 15000;
        }else if(preco < 8){
            this.preco = 20000;
        }else if(preco < 10){
            this.preco =  25000;
        }
    }

    public String getDataDeVAlidade() {
        return dataDeVAlidade;
    }

    public void setDataDeVAlidade(String dataDeVAlidade) {
        this.dataDeVAlidade = dataDeVAlidade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setPreco();
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    
    
//    Métodos personalizados
    public void cadastroDoProduto(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome do prato: ");
        String nom = ler.nextLine();
        System.out.print("Data de Validade: ");
        String data = ler.nextLine();
    }
    
}
