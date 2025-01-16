
package mariobross;


public class Grupo {
    private ArrayList<Personaje> listaDePersonajes = new ArrayList<>(); //lista esta vacia

    public Grupo() {
    }

    public <any> getListaDePersonajes() {
        return listaDePersonajes;
    }

    public void setListaDePersonajes(<any> listaDePersonajes) {
        this.listaDePersonajes = listaDePersonajes;
    }
    
    
 
    //(personaje = objeto con todos sus datos.
    public void agregarJugador(Personaje jugador){
        listaDePersonajes.add(jugador);
        
        
        
        
    }
    public int calcularMonedas(){
        int totalMonedas = 0;
        for(Personaje monedasPersonaje : listaDePersonajes){
            totalMonedas += monedasPersonaje.monedas;
            if(totalMonedas>=100){
                totalMonedas =totalMonedas + 100;
            }
            
            
            
            
        }
        return totalMonedas;
    }
    public void mostrarInformacionGrupo(){
        for(Personaje personaje : listaDePersonajes){
            personaje.mostrarInfo();
        }
    }
    
}
