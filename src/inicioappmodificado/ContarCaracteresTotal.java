
package inicioappmodificado;

/**
 *
 * @author Alberto
 * Método ContarPalabrasTotal:
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
