package gustavo.vidal.primeirasemana;

public class BoletimEscolar {
    public static void main(String[] args) {
        int mediaFinal = 7;
        if (mediaFinal<6)
           System.out.println("Reprovado!");
        else if (mediaFinal == 6)
           System.out.println("Exame!");
        else if (mediaFinal>6)
           System.out.println("Aprovado!");

    }
}
