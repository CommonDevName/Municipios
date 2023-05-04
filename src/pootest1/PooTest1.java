package pootest1;

import Models.Municipio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author uncor
 */
public class PooTest1 {
    public static Scanner dataInput = new Scanner(System.in);
    public static ArrayList <Municipio> Municipios = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    AddMunucipios();   
    //Municipio Calkini = new Municipio(2, "Calkini");    //Implicita
    }
    
    public static void AddMunucipios(){
        boolean condition = true;
        String question;
        do{
        System.out.println("Ingrese el id y el nombre de municipio.");
        Municipios.add(new Municipio(dataInput.nextByte(),dataInput.nextLine()));
        System.out.println("desea ingresar otro municipio? Yes or No.");
        question = dataInput.nextLine();
        switch(question){
            case "Yes" ->{}
            case "No" ->{condition = false;}
        }
        }while(condition);
        for(int i; i = Municipios.lenght ){
        
        }
    }
}
