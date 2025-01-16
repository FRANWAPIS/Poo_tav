
package mariobross;


public class Mario extends Personaje implements SuperPoder {
    private boolean poderFuego; //false
    
    //constructor

    public Mario(boolean poderFuego, String nombre, int vidas, int monedas) {
        super(nombre, vidas, monedas);
        this.poderFuego = poderFuego;
    }
    @Override
    public void moverse(){
        System.out.println(nombre + "se mueve corriendo rapidamente");
        
        
    }
    
    @Override
    public int comerEstrella(){
        poderFuego = true; //mario tiene poder de lanzar bolas de fuego
        return 10; //segundo de poder
    }
    
    @Override
    public boolean comerHongo(){
        return true; //mario crece al comer un hongo
    }
    
    public void lanzarBolasFuego(){
        if(poderFuego==true){
            System.out.println(nombre + "lanza bolas de fuego");
        }else{
            System.out.println(nombre + "no tiene el poder de fuego");
        }
        
    }
}
