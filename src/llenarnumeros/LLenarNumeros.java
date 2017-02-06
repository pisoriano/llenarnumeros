/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LLenarNumeros;

/**
 *
 * @author piedad
 */
public class LLenarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CVector v = new CVector();
        int i;
        for(i=0;i<v.getnElementos();i++)
        {
            v.insertar((int)(Math.random()*100));
        }   
        
        System.out.println("Los elementos del vector son:");
        v.mostrar_vector();
        System.out.println("\nLa suma es "+v.sumar());
        System.out.println("\nLos elementos del vector ordenado son:");
        v.ordenar_vector();
        v.mostrar_vector();
    }
    
}
