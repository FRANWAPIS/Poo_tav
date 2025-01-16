
package mariobross;
import java.util.Scanner;
public class MarioBross {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grupo grupo = new Grupo();
        boolean continuar = true; //define si el menu continua ejecutandose
        
        while(continuar==true){
            System.out.println("Seleccione una opcion");
            System.out.println("1 Crear un Mario");
            System.out.println("2 Crear un Yoshi");
            System.out.println("3 Mover Personajes");
            System.out.println("4 Calcular el total de monedas del grupo");
            System.out.println("5 Mostrar informacion de los personajes");
            System.out.println("6 Salir");
            int opcion = scanner.nextInt();
            
            scanner.nextLine(); //borra 
            //Switch para cada opcion
            switch(opcion){
                case 1:
                //
                Mario mario = new Mario (true, "Mario Bross", 10, 50);
                grupo.agregarJugador(Mario);
                    System.out.println("Mario se creo y agrego al grupo");
                    break;
                case 2:
                    
                    Yoshi yoshi = new Yoshi("Verde", "Yoshi", 10, 500);
                    grupo.agregarJugador(yoshi);
                    System.out.println("yoshi se creo y agrego al grupo");
                    break;
                    
                    
                case 3:
                    for(Personaje personaje : grupo.getListaDePersonajes()){
                        personaje.moverse();
                    }
                    break;
                    
                case 4:
                    int totalMonedas = grupo.calcularMonedas();
                    System.out.println("las monedas del grupo son" + totalMonedas);
                    break;
                    
                case 5:
                    grupo.mostrarInformacionGrupo();
                    break;
                    
                case 6:
                    continuar = false;
                    System.out.println("saliendo del programa");
                    break;
                default:
                    System.out.println("agrega una opcion valida");
                
            }
            
        }scanner.close();
       
    }
    
}
