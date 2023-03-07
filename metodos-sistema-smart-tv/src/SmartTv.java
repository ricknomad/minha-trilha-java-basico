public class SmartTv {
    boolean ligada=false;
    static int canal=1;
    static int volume = 25;

    public static void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void mudarCanal(){   
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
    public static void aumentarVolume(){
       //volume= volume + 1;
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    
    }
    public static void diminuirVolume(){
        //volume= volume - 1;
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
        
    }
    public void ligar(){
        ligada=true;

    }

    public void desligar() {
        ligada=false;
        
    }
}