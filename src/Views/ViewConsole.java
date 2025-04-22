package Views;
import Models.Persona;

public class ViewConsole {

    public void printPersonsArray(Persona [] personas){
        for(int i=0;i<personas.length;i++){
            System.out.println("nombre"+personas[i].getNombre()+"edad"+personas[i].getEdad());
        }
 


    }
    public void printMessage(String message){

    }
    
}
