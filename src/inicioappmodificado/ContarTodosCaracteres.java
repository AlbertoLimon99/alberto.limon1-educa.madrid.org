/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioappmodificado;


public class ContarTodosCaracteres extends Atributos{
    public int[] contarTodosCaracteres(String cadena){
            for (int i = 0;i<cadena.length();i++) {
                char car= cadena.charAt(i);
                int ascii=car;
                getContador()[ascii]++;
            }
        return getContador();
        }
}

