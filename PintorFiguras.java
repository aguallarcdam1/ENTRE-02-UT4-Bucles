
/**
 *  Clase que dibuja una figura 
 * 
 * @author - Andrés Guallar Chamorro
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';

    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
        for(int fila = 1; fila <= altura; fila++){
            System.out.println();
            escribirEspacios(ESPACIO, (altura - fila) * 2);

            for (int col = 1; col <= fila ; col ++){
                if(col % 2 == 0){
                    escribirEspacios(CAR2, ANCHO_BLOQUE);
                }
                else{
                escribirEspacios(CAR1, ANCHO_BLOQUE);
            }
            }

        }
        System.out.println();

    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
        for (int contador = 1; contador <= n; contador++){
            System.out.print(caracter);

        }
    }
}
