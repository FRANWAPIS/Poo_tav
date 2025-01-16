
package mariobross;


public abstract class Personaje {
    //atributos
    protected String nombre;
    protected int vidas, monedas;
    
    //constructor

    public Personaje(String nombre, int vidas, int monedas) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.monedas = monedas;
    }
    
    //metodo abstracto llamado meverse
    public abstract void moverse();
    
    //perder vida
    public int perderVida(){
        //vidas - 10
        if (vidas > 0){
            vidas--; //vidas= vidas-1; es lo mismo que restar 1
            //vidas = 9
        }
        return vidas;
    }
    
    
    //recoger monedas final
    public final int recogerMonedas(){
        monedas++;
        return monedas;
    }
    //TS

    public void mostrarInfo(){
        System.out.println("Nombre:"+ nombre + "vidas:"+ vidas + "monedas:"+ monedas);
    }
    
    
}
