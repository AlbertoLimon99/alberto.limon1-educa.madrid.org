
package inicioappmodificado;

import java.util.Scanner;

/**
 *
 * @author Alberto Limón
 */
public class InicioAppModificado extends Atributos{

 
    public static void main(String[] args) {
          
		InicioAppModificado ia = new InicioAppModificado();
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una cadena de caracteres");
		String cadena = scan.nextLine();
		
                ContarPalabrasTotal obj1=new ContarPalabrasTotal();
                ContarCaracteresTotal obj2=new ContarCaracteresTotal();
                ContarTodosCaracteres obj3=new ContarTodosCaracteres();
                MostrarInformacion obj4=new MostrarInformacion();
		
		
		obj4.textoNumeroPalabras(obj1.contarPalabrasTotal(cadena));
                
                obj4.textoCaracteresTotal(obj2.contarCaracteresTotal(cadena));
               
                obj4.textoTodosCaracteres(obj3.contarTodosCaracteres(cadena));

                scan.close();
    }             
       
}
    
