/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author broli
 */
public class Operar {
    
    boolean suma,resta,div,mul,potencia;
    int resultado=0;
    
    
    public void sumar(String x){
        
        this.resultado=Integer.parseInt(x);
        suma = true;
       
    }
    
    public void restar(String x){
       this.resultado=Integer.parseInt(x);
        resta = true;
        
    }
    
    public void multiplicar(String x){
        this.resultado=Integer.parseInt(x);
        mul=true;
        
    }
    public void division(String x){
          
         this.resultado=Integer.parseInt(x);
        
        div = true;
        
        
    }
    public void potencia(String x){
        this.resultado=Integer.parseInt(x);
        potencia=true;
    }
    public int resultado(String x){
        if(suma == true){
            resultado = resultado + Integer.parseInt(x);
        }else{
            if(resta == true){
                resultado = resultado - Integer.parseInt(x);
            }else{
                if(mul == true){
                    resultado = resultado * Integer.parseInt(x);
                }else{
                    if(div == true){
                       if(resultado == 0){
                           resultado = resultado / Integer.parseInt(x);
                       }else{
                            
                            JOptionPane.showMessageDialog(null, "el segundo numero debe ser diferente a 0");
                       }
                        
                    }else{
                        if(potencia==true){
                           this.resultado = ((int)Math.pow(resultado, Integer.parseInt(x)));
                       }
                    }
                }
            }
        }
        
        return resultado;
    }
}
