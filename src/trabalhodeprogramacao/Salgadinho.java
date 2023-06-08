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
public class Salgadinho extends Prato {
//    Atributos
    private String tipo, massa;
    
//    Métodos especiais

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }
    public void cardapiosalgadinho() {
    Scanner ler = new Scanner(System.in);
        System.out.println("Tipos específicos");
        System.out.println("1 - ");
        System.out.println("2 - Frito");
        System.out.println("Escolha uma opcão");
        int molho = ler.nextInt();
        System.out.println("Recheios Específicos");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("Escolha uma opcão");
        int recheio = ler.nextInt();
        System.out.println("Massas Específicos");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("Escolha uma opcão");
        int massa = ler.nextInt();
    }
}
