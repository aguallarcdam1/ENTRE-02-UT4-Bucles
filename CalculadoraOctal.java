
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
        int contadol = 0;
        int resultadoT = 0;
        while(n1 != 0 || n2 != 0){
            int cifra1 = n1 % 10;
            int cifra2 = n2 % 10;
            cifraResult = cifra1 + cifra2 + X;  
            X = 0;
            if (cifraResult > 7){
                

                cifraResult -= 8;
                resultadoT = resultadoT + ((int) Math.pow(10,contadol) 
                                            * (cifraResult));

                X = 1;
            }
            else{
                resultadoT += ((int) Math.pow(10,contadol) * cifraResult);
            }
            n1 /= 10;
            n2 /= 10;
            contadol++;
        }
        if (X == 1){
            resultadoT += ((int) Math.pow(10,contadol) * 1);
        }
        return resultadoT;
    }
    
    
}
