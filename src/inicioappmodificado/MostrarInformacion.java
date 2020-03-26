
package inicioappmodificado;


public class MostrarInformacion extends Atributos{
    static final String TEXTO_LETRAS= "Las letras que se repiten son:";
    static final String TEXTO_PALABRAS= "Se han ingresado ";
    static final String TEXTO_FINAL_PALABRAS= " palabras.";
    static final String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS= "Se han introducido un total de ";
    static final String TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS= " caracteres(sin contar los blancos).";


    static public void textoCaracteresTotal(int total){
            System.out.println(TEXTO_TOTAL_CARACTERES_SIN_BLANCOS + numCaracteresSinBlancos + TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS);

        }
    static public void textoNumeroPalabras(int total){
            System.out.println(TEXTO_PALABRAS + palabras + TEXTO_FINAL_PALABRAS);
            
        }
    static public void textoTodosCaracteres(int [] total){
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
        }
}