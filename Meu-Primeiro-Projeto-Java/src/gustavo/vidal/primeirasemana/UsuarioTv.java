package gustavo.vidal.primeirasemana;

public class UsuarioTv {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        if (smartTv.ligada == true) {
            System.out.println("Tv Ligada");
        }
        else {
            System.out.println("Tv Desligada");
        }
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: " + smartTv.volume);

       smartTv.ligar();
       if (smartTv.ligada == true) {
        System.out.println(" Teste 2 Tv Ligada");
       }
       else {
        System.out.println(" Teste 2 Tv Desligada");
       }

       smartTv.desligar();
       if (smartTv.ligada == true) {
        System.out.println(" Teste 3 Tv Ligada");
       }
       else {
        System.out.println(" Teste 3 Tv Desligada");
       }



    }
}
