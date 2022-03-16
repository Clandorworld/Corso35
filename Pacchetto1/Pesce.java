package Pacchetto1;
//Come le Classi Astratte (con "Extends"), "Implements" da una nuova funzione alla mia Classe
public class Pesce implements Preda, Predatore{


    @Override
    public void scappa() {
        System.out.println("Il Pesce grosso mangia i più piccoli");
    }

    @Override
    public void caccia() {
        System.out.println("Il pesce piccolo fugge dai grandi");
    }
}
