package pootest1;

import java.util.Scanner;
import Models.Processes;

/**
 *
 * @author CommonName(¿)
 */
public class Execution {

    public static Scanner dataInput = new Scanner(System.in);

    public static void AppExecution(){
        Menu();
    }
    
    public static void MenuText(){
        System.out.println("\nBienvenido, elija una opcion.\n"+
                           "\nAgregar un municipio. (1)\n"+
                           "Cambiar un municipio. (2)\n"+
                           "Ver la lista de municipios. (3)\n"+
                           "Salir. (0)\n");
    }

    public static void Menu(){
        int election;
        boolean condition = true;
        do{
        MenuText();
        election = dataInput.nextInt();
        switch(election){
            case 1->{Processes.AddMunucipios();}
            case 2->{if(Processes.Municipios.isEmpty()){
                        System.err.println("\nAccion invalida, antes de,"+
                                           " introduzca un municipio.");
                    }else{Processes.ChangeMunicipios();}}
            case 3->{if(Processes.Municipios.isEmpty()){
                        System.err.println("\nAccion invalida, antes de,"+
                                           " introduzca un municipio.");
                    }else{Processes.SeeMunicipios();}}
            case 0->{System.err.println("\nGood Bye...\n");
                     condition = false;}
            default->{System.err.println("\nInput invalido,"+
                                         "introduzcalo nuevamente.\n");}
            }
        }while(condition);
        }
}
