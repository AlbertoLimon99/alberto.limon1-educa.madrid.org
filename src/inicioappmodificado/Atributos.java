
package inicioappmodificado;


public class Atributos {
    static protected int [] contador;
    static protected char [] letras;
    static protected int palabras;
    static protected int numCaracteresSinBlancos = 0;
    
    
    public Atributos(){
		contador = new int[65536];
		letras = new char[65536];
		palabras = 1;
	}

    /**
     * @return the contador
     */
    public int[] getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int[] contador) {
        this.contador = contador;
    }

    /**
     * @return the letras
     */
    public char[] getLetras() {
        return letras;
    }

    /**
     * @param letras the letras to set
     */
    public void setLetras(char[] letras) {
        this.letras = letras;
    }

    /**
     * @return the palabras
     */
    public int getPalabras() {
        return palabras;
    }

    /**
     * @param palabras the palabras to set
     */
    public void setPalabras(int palabras) {
        this.palabras = palabras;
    }

    /**
     * @return the numCaracteresSinBlancos
     */
    public int getNumCaracteresSinBlancos() {
        return numCaracteresSinBlancos;
    }

    /**
     * @param numCaracteresSinBlancos the numCaracteresSinBlancos to set
     */
    public void setNumCaracteresSinBlancos(int numCaracteresSinBlancos) {
        this.numCaracteresSinBlancos = numCaracteresSinBlancos;
    }
    
}
