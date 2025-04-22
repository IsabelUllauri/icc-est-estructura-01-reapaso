
import Models.Persona;
import Controllers.PersonaController;
import Views.*;.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {



        Persona[] personas = new Persona[] {

            new Persona("Juan", 25),
            new Persona("maria", 30),
            new Persona("carlos", 22),
            new Persona("ana", 28),
            new Persona("luis", 35),
            new Persona("sofia", 27),
            new Persona("miguel", 40),
            new Persona("laura", 32),
            new Persona("pedro", 29),
            new Persona("elena", 26),
//generamos nuevas pesonas
        };
        PersonaController pC =new PersonaController();
        Views.ViewConsole vC = new Views.ViewConsole(); 
        Controllers.PersonaController      

        vC.printMessage("Personas");
        vC.printPersonsArray(personas);
        vC.printMessage("Personas ordenadas por edad:");
        pC.ordenarPorEdad(personas);
        vC.printPersonsArray(personas);
        vC.printMessage("Buscar persona con edad 40");
        Persona



        // PASOS PARA HACER
        // 0 instanciar las clases necesarias
        // 1 imprimir el arreglo
        // 2 ordenar
        // 3 imprimir el arreglo ordenado
        // 4 buscar 40
        // 5 imprimir resultado
        // 6 buscar edad 99 
        // 7 buscar imrirmir resultado

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR EDAD
        /// LA EDAD

    }
}
