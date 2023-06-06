/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhodeprogramacao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bento Ambrósio
 */
public class Pedido {
//    Atributos
    private Cliente cliente;
    private double taxaDeServico;
    private ArrayList <Prato> prato = new ArrayList<>();
    
//    Métodos Especiais

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTaxaDeServico() {
        return taxaDeServico;
    }

    public void setTaxaDeServico(double taxaDeServico) {
        this.taxaDeServico = taxaDeServico;
    }

    public ArrayList<Prato> getPrato() {
        return prato;
    }

    public void setPrato(ArrayList<Prato> prato) {
        this.prato = prato;
    }
    
    public void mostrarCardapioEfactura(){
       Scanner ler = new Scanner(System.in);
        
        System.out.println("=========Seja bem vindo=========");
        System.out.println("=============Cardapio=============");
        System.out.println("Pizza");
        System.out.println("Pizza");
        System.out.println("Pizza");
        System.out.println("Pizza");
        System.out.println("Pizza");
        System.out.println("Pizza");
        System.out.println("Pizza");
        System.out.println("Pizza");
        System.out.println("Pizza");
        System.out.println("Lanch");
        System.out.println("Lanch");
        System.out.println("Lanch");
        System.out.println("Lanch");
        System.out.println("Lanch");
        System.out.println("Lanch");
        System.out.println("Lanch");
        System.out.println("Lanch");
        System.out.println("Lanch");
        System.out.println("Salgadinho");
        System.out.println("Salgadinho");
        System.out.println("Salgadinho");
        System.out.println("Salgadinho");
        System.out.println("Salgadinho");
        System.out.println("Salgadinho");
        System.out.println("Salgadinho");
        System.out.println("Salgadinho");
        System.out.println("Salgadinho");
        System.out.println("Salgadinho");
        
        System.out.println("Desaja efectuar um pedido?");
        System.out.println("Digite 's' se sim ou 'n' se não!");
        String opcao = ler.nextLine();
        if("s".equals(opcao)){
            System.out.println("Escolha quantos pratos forem necessário");
            System.out.println("Quando desejar parar digite 'p'");
            System.out.println("Escolha sua opção no cardápio digitando o numero em que se encontra o prato");
            for(;;){
                String p = ler.nextLine();
                if(!"p".equals(p)){
                    
                }else{
                    break;
                }
            }
            
            System.out.println("Nome do cliente: "+this.getCliente().getNome());
            System.out.println("");
            
        }else{
            
        }
    }
    
}
