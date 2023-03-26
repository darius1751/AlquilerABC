package alquiler_abc_main;


import alquiler_abc.models.Client;
import alquiler_abc.models.Rent;
import alquiler_abc.models.Vehicule;
import alquiler_abc.views.MainMenu;
import java.util.ArrayList;


public class Main {
    public static ArrayList<Vehicule> vehicules;
    public static ArrayList<Client> clients;
    public static ArrayList<Rent> rents;
    public static void main(String[] args){
        initialValues();
        new MainMenu().setVisible(true);
    }
    private static void initialValues(){
        vehicules = new ArrayList();
        clients = new ArrayList();
        rents = new ArrayList();
    }
}
