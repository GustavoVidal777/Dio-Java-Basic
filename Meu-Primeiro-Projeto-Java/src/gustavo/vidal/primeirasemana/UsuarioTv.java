package gustavo.vidal.primeirasemana;

public class UsuarioTv {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        if (smartTv.ligada == true) {
            System.out.println("Tv Ligada");
        }
        else {
            System.out.println("Tv Ligada");
        }
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
    }
}
