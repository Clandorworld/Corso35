package Pacchetto1;
    //Come le Classi Astratte (con "Extends"), "Implements" da una nuova funzione alla mia Classe
    public class Leone implements Predatore{

        @Override
        public void caccia(){
            System.out.println("Il Leone parte all'attacco");

        }

    }