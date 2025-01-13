
public class Hotel {
    //Atributos
    private String idHotel, nombreHotel;
    private ArrayList<Habitacion>habitacionesDisponibles;
    
    
    //Constructor
    
    public Hotel(String idHotel, String nombreHotel) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        this.habitacionesDisponibles= new ArrayList<>();//inicializo como vacio
       
    }
    //Metodo para agregar habitaciones a la lista
    public void agregarHabitacion(Habitacion habitacion){
        habitacionesDisponibles.add(habitacion);
    }
    //metodo para ver las habitaciones disponibles
    public void mostrarHabitaciones(){
        System.out.println("Habitaciones disponibles en el hotel" + nombreHotel);
        for(Habitacion habitacion : habitacionesDisponibles){
            System.out.println("habitacion");
        }
    }
}
