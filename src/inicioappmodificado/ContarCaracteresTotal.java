
package inicioappmodificado;

/**
 *
 * @author Alberto
 * Método ContarCaracteresTotal: Cuenta los caracteres totales que hay en el texto introducido. No cuenta los espacios en blanco.
 * Cuando detecta un espacio en blanco, no suma al contador de caracteres totales.
 */
public class ContarCaracteresTotal extends Atributos {
    public int contarCaracteresTotal(String cadena){
            for (int i = 0; i < cadena.length(); i++) {
                char car = cadena.charAt(i);
                if(car != ' '){
                    setNumCaracteresSinBlancos(getNumCaracteresSinBlancos() + 1);}
            }
            return getNumCaracteresSinBlancos();
        }
    
    
}
