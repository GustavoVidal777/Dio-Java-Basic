package gustavo.vidal.primeirasemana;

public class SmartTv {

        boolean ligada = false;
        int canal = 10;
        int volume = 30;  

        public void ligar(){
            ligada = true;
        }

        public void desligar(){
            ligada = false;
        }

        public void aumentarVolume(){
            volume ++;
            System.out.println("+ volume: " + volume);
        }

        public void diminuirVolume(){
            volume --;
            System.out.println("- volume: " + volume);
        }

        public void mudarCanal(int novoCanal){
            if (novoCanal <= 100 || novoCanal >=1)
            canal = novoCanal;
        }

        public void aumentarCanal(){
            canal ++;
        }

        public void diminuirCanal(){
            canal --;
        }

        }
        


