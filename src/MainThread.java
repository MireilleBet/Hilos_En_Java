/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mireille Betancourt
 */
public class MainThread {
    
    public static void main(String[]args){
        Cliente cliente1 = new Cliente (" Michell ", 
        new int[] {2, 2, 1, 5, 2} );
        Cliente cliente2 = new Cliente(" Eduardo ",
        new int[] {1, 3, 5, 1, 1});
        Cliente cliente3 = new Cliente(" Mireille Betancourt ", 
        new int[] {7, 2, 2, 5, 9});
        
         long initialTime = System.currentTimeMillis();
         
        CajeraThread cajero1 = new CajeraThread(" César ",
        cliente1, initialTime);
        CajeraThread cajero2 = new CajeraThread(" Isidro ",
        cliente2, initialTime);
        CajeraThread cajero3 = new CajeraThread(" Ramón ",
        cliente3, initialTime);
        
        
        
        cajero1.start();
        cajero2.start();
        cajero3.start();
        
    }
}
