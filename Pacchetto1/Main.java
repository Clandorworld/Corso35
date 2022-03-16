package Pacchetto1;
//Le Interfacce
public class Main {
    public static void main(String[] args){

    Leone leone = new Leone();
    Gazzella gazzella = new Gazzella();
    Pesce pesce = new Pesce();

    gazzella.scappa();
    leone.caccia();
    pesce.caccia();
    pesce.scappa(); //Il Pesce potra accedere a 2 interfacce
    }
}
