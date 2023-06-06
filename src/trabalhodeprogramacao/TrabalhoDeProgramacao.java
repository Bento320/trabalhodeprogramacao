/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhodeprogramacao;

/**
 *
 * @author Bento Ambrósio
 */
public class TrabalhoDeProgramacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        Pedido p = new Pedido();
        cli.cadastrarCliente();
        p.mostrarCardapioEfactura();
        
    }
    
}
