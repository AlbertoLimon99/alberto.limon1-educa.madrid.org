/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioappmodificado;

/**
 *
 * @author Alberto
 */
public class ContarPalabrasTotal extends Atributos{
     public int contarPalabrasTotal(String cadena){
            char car2= ' ';
            for (int i = 0;i<cadena.length();i++){
                char car= cadena.charAt(i);
                int ascii=car;
                getLetras()[ascii]= car;
                if (car == ' ' && car2!=' ') {
                    setPalabras(getPalabras() + 1);
                }
                car2=car;
            }
            return getPalabras();
        }
    
}
