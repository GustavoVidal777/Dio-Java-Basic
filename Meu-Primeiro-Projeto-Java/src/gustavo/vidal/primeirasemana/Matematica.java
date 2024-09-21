package gustavo.vidal.primeirasemana;
public class Matematica {
    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 8;
        int contador = 0;
        int x = 0;

            for (int i = 0; i < 100; i++) {
                numero1 = numero1 *1;
                numero2 = numero2 -1;
                contador = numero1 + numero2;  
                x = x +1;

            if (contador == 0 || contador == 5)               {
                i = 100;
                System.out.println("Contador chegou a " + contador);
                System.out.println("Numero de operações = " + x);
            }
                
            }
        }
    }

