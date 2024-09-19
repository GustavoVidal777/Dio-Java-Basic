package gustavo.vidal.primeirasemana;

public class MinhaClass {

    public static void main(String[] args) {

        String primeiroNome = "Gustavo";
        String segundoNome = "Vidal";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);

    }
    
}

