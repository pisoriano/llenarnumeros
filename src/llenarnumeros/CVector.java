/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
package LLenarNumeros;

/**
 *
 * @author piedad
 */
public class CVector {
   private static int nElementos,pos=0;
   private static int[] vector;
   public void insertar (int n){
       if(pos<nElementos)
        vector[pos]=n;
       pos++;                       
    }

    /**
     * Función que devuelve la suma de los elementos del vector
     * @return suma
     */
    public  int sumar(){
        int suma = 0;
        for(int j=0;j<nElementos;j++)
            suma=suma + vector[j];
        return suma;
    }

    /**
     * Función que muestra por pantalla los elementos del vector
     */
    public  void mostrar_vector()
    {
        int j;
        for(j=0;j<nElementos;j++)
                System.out.print(vector[j]+",");
    }
    
    /**
     * Función que ordena los elementos del vector
     */ 
    public  void ordenar_vector(){
        int k,j,temp;
        
        for(k=0;k<nElementos-1;k++)
            for(j=k+1;j<nElementos;j++)
                if(vector[k]>vector[j])
                {
                    temp=vector[j];
                    vector[j]=vector[k];
                    vector[k]=temp;
                }
    }   

    /**
     *
     * @return devuelve el número de elementos del vector
     */
    public  int getnElementos()
    {
        return nElementos;
    }
     public  int posicion(int n)
    {
        return vector[n];
    }
    
     /**
     * Constructor por defecto
     */
    public CVector(){
         nElementos=75;
        vector=new int[nElementos];
        
    }
     /**
     * Constructor que nos crea un vector pasándole el tamaño
     * @param n se le pasa el número de elementos
     */
    public CVector(int n){
        nElementos=n;
        vector=new int[nElementos];
    }
}
