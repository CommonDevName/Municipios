package Models;

import java.util.ArrayList;
import static pootest1.Execution.dataInput;

/**
 *
 * @author CommonName(¿)
 */
public class Processes {
    
    public static ArrayList <Municipio> Municipios = new ArrayList<>();

    public static void AddMunucipios(){
        boolean condition = true;
        char question;
        do{
        System.out.println("\nIngrese el id y el nombre de municipio.\n");
        Municipios.add(new Municipio(dataInput.nextInt(),dataInput.nextLine()));
        System.out.println("\nDesea ingresar otro municipio? Y or N.\n");
        question = dataInput.next().charAt(0);
        switch(question){
            case 'Y' ->{}
            case 'N' ->{condition = false;}
        }
        }while(condition);
    }

    public static void ChangeMunicipios(){
        boolean condition = true;
        char question;
        do{
        int id = dataInput.nextInt();
        System.out.println("Ingrese el id del municipio.");
        Municipios.set(id-1, new Municipio(dataInput.nextInt(),dataInput.nextLine()));
        System.out.println("desea modificar otro municipio? Y or N.");
        question = dataInput.next().charAt(0);
        switch(question){
            case 'Y' ->{}
            case 'N' ->{condition = false;}
        }
        }while(condition);
    }

    public static void SeeMunicipios(){
        for(int i = 1; i < Municipios.size(); ++i){
            System.out.println(Municipios.get(i).toString());
        }
    }
}
