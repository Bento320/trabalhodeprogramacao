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
    
    public void mostrarCardapio(){
        System.out.println("==========Seja Bem Vindo============");
        System.out.println("===========Cardápio===========");
        System.out.println("1 - Pizza");
        System.out.println("2 - Lanch");
        System.out.println("3 - Salgadinho");
    }
    public void solicitacao(){
      Scanner ler = new Scanner(System.in);
        System.out.println("Deseja efectuar um pedido?");
        System.out.println("1- Sim");
        System.out.println("2- Não");
        int resposta = ler.nextInt();
        if(resposta == 1){
            this.mostrarCardapio();
            System.out.println("Escolha o prato desejado");
            for(;;){
                String p = ler.nextLine();
                if(!p.equals('p')){
                    int opcao = ler.nextInt();
                    switch(opcao){
                        case 1:
                            Pizza pizza = new Pizza();
                            pizza.cardapioPizza();
                            break;
                        case 2:
                            Lanch lanch = new Lanch();
                            lanch.cardapiolanch();
                            break;
                        case 3:
                            Salgadinho sal = new Salgadinho();
                            sal.cardapiosalgadinho();
                        default:
                            System.out.println("Opção inválida");
                    }
                    System.out.println("Deseja adicionar mais pratos ao seu pedido?");
                    System.out.println("caso não digite 'p'");
                    this.mostrarCardapio();
                    
                }else{
                    break;
                }
            }
        }
    }
    public void pedirOutros(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Deseja adicionar outros pratos ao seu pedido?");
        System.out.println("1- sim");
        System.out.println("2- não");
        int resposta = ler.nextInt();
        if(resposta == 1){
            this.mostrarCardapio();
            System.out.println("Escolha o prato desejado");
            int opcao = ler.nextInt();
                    switch(opcao){
                        case 1:
                            Pizza pizza = new Pizza();
                            pizza.cardapioPizza();
                            break;
                        case 2:
                            Lanch lanch = new Lanch();
                            lanch.cardapiolanch();
                            break;
                        case 3:
                            Salgadinho sal = new Salgadinho();
                            sal.cardapiosalgadinho();
                        default:
                            System.out.println("Opção inválida");
                    }
        }else{
            
        }
       
    }
   
    
    public void dadosDoPedido(){
        Cliente cli = new Cliente();
        System.out.println("Nome do cliente: "+cli.cadastrarCliente());
    }
    
}
