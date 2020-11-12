import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - Andrés Guallar Chamorro
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        Pantalla.borrarPantalla();
        char reinicio = 'S';
        while(reinicio == 'S' || reinicio == 's'){
            Pantalla.borrarPantalla();
            System.out.println("Teclee el primer número en octal:");
            int numero1 = teclado.nextInt();
            System.out.println("Teclee el segundo número en octal:");
            int numero2 = teclado.nextInt();
            while(Utilidades.estaEnOctal(numero1) == false || 
            Utilidades.estaEnOctal(numero2) == false){
                if(Utilidades.estaEnOctal(numero1) == false ){
                    System.out.println("El primer número introducido no está en octal, vuelva a introducirlo:");
                    numero1 = teclado.nextInt();
                }
                else if(Utilidades.estaEnOctal(numero2) == false){
                    System.out.println("El segundo número introducido no está en octal, vuelva a introducirlo:");
                    numero2 = teclado.nextInt();
                }
            }

            while(Utilidades.contarCifras(numero1) 
            != Utilidades.contarCifras(numero2)){
                System.out.println("Las cifras de los dos números no coinciden, vuelva a introducirlos:");
                numero1 = teclado.nextInt();
                numero2 = teclado.nextInt();
            }

            int resultado = calculadora.sumarEnOctal(numero1, numero2);
            System.out.println("El resultado de la suma es: " + resultado);
            Pantalla.hacerPausa();
            System.out.println("Si desea repetir el programa pulse ('S' o 's':");
            reinicio = teclado.nextLine().charAt(0);
        }
        System.out.println("-----Programa Finalizado-----");

    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {

    }

}
