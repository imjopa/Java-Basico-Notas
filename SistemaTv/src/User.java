public class User {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        /*System.out.println("Canal Atual: " + SmartTv.canal);*/
        smartTv.mudarCanal(100);
        smartTv.canalSucessor();
        smartTv.canalAntecessor();



        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Tv Ligada? " + smartTv.ligada);


        /*smartTv.ligar ();
        System.out.println("Novo Status -> Tv Ligada? " + SmartTv.ligada);
     smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? " + SmartTv.ligada);*/
    }
}
