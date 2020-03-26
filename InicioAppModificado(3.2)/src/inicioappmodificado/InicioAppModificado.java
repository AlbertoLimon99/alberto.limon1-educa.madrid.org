
package inicioappmodificado;

import java.util.Scanner;

/**
 *
 * @author Alberto Limón
 */
public class InicioAppModificado {

 
    public static void main(String[] args) {
          
		InicioAppModificado ia = new InicioAppModificado();
		Scanner scan = new Scanner(System.in);
		System.out.println(TEXTO_PEDIR_CADENA);
		String cadena = scan.nextLine();
		
                //Llamada a los métodos de contarPalabras
		int numeroCaracteres = ia.contarCaracteresTotal(cadena);
                int palabrasTotales = ia.contarPalabrasTotal(cadena);
                int [] caracteresDeCadaTipo = ia.contarTodosCaracteres(cadena);
		
		//LLamada a los métodos de mostrarResultado
                ia.textoCaracteresTotal(numeroCaracteres);
                ia.textoNumeroPalabras(palabrasTotales);
                ia.textoTodosCaracteres(caracteresDeCadaTipo);

                scan.close();
    }
        
 	int [] contador;
	char [] letras;
	int palabras;
	int numCaracteresSinBlancos = 0;
	final String TEXTO_LETRAS= "Las letras que se repiten son:";
	final String TEXTO_PALABRAS= "Se han ingresado ";
	final String TEXTO_FINAL_PALABRAS= " palabras.";
	final String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS= "Se han introducido un total de ";
	final String TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS= " caracteres(sin contar los blancos).";
	static final String TEXTO_PEDIR_CADENA= "Introduzca un conjunto de caracteres:";
	
	public InicioAppModificado(){
		contador = new int[65536];
		letras = new char[65536];
		palabras = 1;
	}

        //Dividimos el método de contarPalabras
        private int contarCaracteresTotal(String cadena){
            for (int i = 0; i < cadena.length(); i++) {
                char car = cadena.charAt(i);
                if(car != ' '){
                    numCaracteresSinBlancos++;}
            }
            return numCaracteresSinBlancos;
        }
        
        private  int contarPalabrasTotal(String cadena){
            char car2= ' ';
            for (int i = 0;i<cadena.length();i++){
                char car= cadena.charAt(i);
                int ascii=car;
                letras[ascii]= car;
                if (car == ' ' && car2!=' ') {
                    palabras++;
                }
                car2=car;
            }
            return palabras;
        }
        
        private int[] contarTodosCaracteres(String cadena){
            for (int i = 0;i<cadena.length();i++) {
                char car= cadena.charAt(i);
                int ascii=car;
                contador[ascii]++;
            }
        return contador;
        }
	
        //Dividimos el método mostrarResultado
        private String textoCaracteresTotal(int total){
            System.out.println(TEXTO_TOTAL_CARACTERES_SIN_BLANCOS + numCaracteresSinBlancos + TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS);
            return null;
        }
        
        private String textoNumeroPalabras(int total){
            System.out.println(TEXTO_PALABRAS + palabras + TEXTO_FINAL_PALABRAS);
            return null;
        }
        private String textoTodosCaracteres(int [] total){
            System.out.println(TEXTO_LETRAS);
            for (int i = 0;i<letras.length;i++){ 
                if(contador[i]>0 && letras[i] !=' '){
                    if(contador[i]==1){
                        System.out.println(""+letras[i] + " --> " + contador[i] + " vez.");
                    }else if(contador[i]>1){
                        System.out.println(""+letras[i] + " --> " + contador[i] + " veces.");
                    }
                }
            }                   
            return null;
        }
}
    
