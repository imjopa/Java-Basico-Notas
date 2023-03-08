public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 10;


    public void mudarCanal(int novoCanal){
        System.out.println("Canal Atual: " + novoCanal);
        canal = novoCanal;
    }
   public void canalSucessor() {
       canal = canal + 1;
       System.out.println("Canal Sucessor: " + canal);
   }
   public void canalAntecessor(){
       canal = canal - 2;

       System.out.println("Canal Antecessor: " + canal);
   }

    /*public void ligar() {
        ligada = true;

    }

    public void desligar() {
        ligada = false;

    }*/

    public void aumentarVolume() {
        volume = volume + 1;
        System.out.println("Aumentando o Volume para: " + volume);
    }

    public void diminuirVolume() {
        volume = volume - 1;
        System.out.println("Diminuindo o Volume para: " + volume);
    }

}
