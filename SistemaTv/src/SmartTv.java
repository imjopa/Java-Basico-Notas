public class SmartTv {

    static boolean ligada = false;
    static int canal = 1;
    static int volume = 10;


    public void mudarCanal(int novoCanal){
        System.out.println("Canal Atual: " + novoCanal);
        canal = novoCanal;
    }
   public void canalSucessor() {
       System.out.println("Canal Sucessor: " + canal++);
        canal++;
   }
   public void canalAntecessor(){
       System.out.println("Canal Antecessor: " + canal);
        canal--;
   }

    public void ligar() {
        ligada = true;

    }

    public void desligar() {
        ligada = false;

    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o Volume para: " + volume);
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo o Volume para: " + volume);
        volume--;
    }

}
