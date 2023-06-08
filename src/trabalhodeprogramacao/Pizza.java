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
public class Pizza extends Prato {
//    Atributos
    private String molho, cobertura;
    
//    Métodos Especiais
    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
    public void cardapioPizza(){
       Scanner ler = new Scanner(System.in);
        System.out.println("Molhos específicos");
        System.out.println("1 - Molho de tomate");
        System.out.println("2 - Molho branco");
        System.out.println("3 - Molho Pesto");
        System.out.println("Escolha uma opcão");
        int molho = ler.nextInt();
        System.out.println("Recheios Específicos");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("Escolha uma opcão");
        int recheio = ler.nextInt();
        System.out.println("Coberturas Específicos");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("Escolha uma opcão");
        int cobertura = ler.nextInt();
    }
     
    
}
