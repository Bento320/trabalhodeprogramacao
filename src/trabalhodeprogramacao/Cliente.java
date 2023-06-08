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
public class Cliente {
//    Atributos
    private String nome;
    private int id;
    private int numeroDeCompras = 0;
    
//    Métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroDeCompras() {
        return numeroDeCompras;
    }

    public void setNumeroDeCompras(int numeroDeCompras) {
        this.numeroDeCompras = numeroDeCompras;
    }
    
    public String cadastrarCliente(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o seu nome");
        this.nome = ler.nextLine();
        this.setNome(nome);
        return this.getNome();
    }
    
}
