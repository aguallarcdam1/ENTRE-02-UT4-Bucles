
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - Andrés Guallar Chamorro
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int cifraResult = 0;
        int X = 0;
        int cifras = Utilidades.contarCifras(n1);
        int contadol = 0;
        int resultadoT = 1;
        while(cifras != contadol){
            int cifra1 = n1 % 10;
            int cifra2 = n2 % 10;
            cifraResult = cifra1 + cifra2 + X;  
            
            if (cifraResult > 7){
                X = 0;

                cifraResult -= 8;

                
                X = 1;
            }
            resultadoT += cifraResult * 10;
            n1 /= 10;
            n2 /= 10;
            contadol++;
        }
        return resultadoT;
    }

}
