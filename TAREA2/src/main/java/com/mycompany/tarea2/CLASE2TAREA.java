/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea2;

/**
 *
 * @author STEFANNIE FLANDEZ
 */
public class CLASE2TAREA {
    
    public static String InversaAscii(String palabra){
        String res = "";
        double codi;
         codi = Double.parseDouble(palabra);
         
            char caracter = (char)codi;
            res = res + caracter;
            
            System.out.println("Codigo recibido = " + palabra);    
            System.out.println("Resultado en letras: "+ res);
            
        return res;
    }
    
    public static void main(String[] args){    
      String respuesta  = InversaAscii("83"); 
      String respuesta1 = InversaAscii("84"); 
      String respuesta2 = InversaAscii("69"); 
      String respuesta3 = InversaAscii("70"); 
      String respuesta4 = InversaAscii("65"); 
      String respuesta5 = InversaAscii("78");
      String respuesta6 = InversaAscii("78");
      String respuesta7 = InversaAscii("73");
      String respuesta8 = InversaAscii("69");
      
      
      System.out.println(" Su codigo descifrado es: " + respuesta + respuesta1 + respuesta2 + respuesta3 + respuesta4 + respuesta5 + respuesta6 + respuesta7 + respuesta8 );
    }    
}
    
    
    
    
    
    
    
    

