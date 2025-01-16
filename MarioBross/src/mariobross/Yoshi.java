
package mariobross;


public class Yoshi extends Personaje implements SuperPoder {
    //Atributo especifico
    private String color;
    private booleano poder;
    
    //constructor

    public Yoshi(String color, String nombre, int vidas, int monedas) {
        super(nombre, vidas, monedas);
        this.color = color;
    }
    
    @Override
    public void moverse(){
        System.out.println(nombre + "se mueve saltando");
        
        
    }
    
    @Override
    public int comerEstrella(){
        poder = true;
        return 8; //segundo de poder
    }
    
    @Override
    public boolean comerHongo(){
        return false; //yoshi queda igual
    }
    
    public void usarLengua(){
        if(poder=true){
        System.out.println(nombre + "usa su lengua para comer enemigos");
        }else{
            System.out.println("yoshi no tiene el poder");
        }
    }
    
}
