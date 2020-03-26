/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioappmodificado;

/**
 *
 * @author Alberto
 * Método ContarPalabrasTotal: Cuenta las palabras totales que hay en el texto introducido. Si en el texto hay un espacio de texto y
 * después hay otra palabra, detecta que es una separación entre ellas, y suma 1 al contador de palabras.
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
