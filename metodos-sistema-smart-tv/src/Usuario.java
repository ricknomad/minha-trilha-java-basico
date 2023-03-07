public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.aumentarVolume();

        System.out.println("Canal Atual : " + SmartTv.canal);

        SmartTv.mudarCanal(13);

        System.out.println("Canal Atual : " + SmartTv.canal);

        System.out.println("Volume Atual : " + SmartTv.volume);

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual : " + SmartTv.canal);
        System.out.println("Volume Atual : " + SmartTv.volume);



    
        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

    }
}
