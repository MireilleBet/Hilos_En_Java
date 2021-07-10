/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mireille Betancourt
 */
public class Main {
 
    public static void main(String[]args){
        Cliente cliente1 = new Cliente (" Michell ", 
        new int[] {2, 2, 1, 5, 2} );
        Cliente cliente2 = new Cliente(" Eduardo ",
        new int[] {1, 3, 5, 1, 1});
        Cliente cliente3 = new Cliente(" Mireille Betancourt ", 
        new int[] {8, 4, 2, 6, 4});
        
        Cajera cajero1 = new Cajera(" César ");
        Cajera cajero2 = new Cajera(" Isidro ");
        Cajera cajero3 = new Cajera(" Ramón ");
        
        long initialTime = System.currentTimeMillis();
        
        cajero1.procesarCompra(cliente1, initialTime);
        cajero2.procesarCompra(cliente2, initialTime);
        cajero3.procesarCompra(cliente3, initialTime);
        
    }
}
