
package dimarsaa;


public class Cliente {
    //atrinutos
    private String idCliente, nombreCliente;
    private ArrayList<Pedidos> pedidosRealizados;
    
    
    //contructor

    public Cliente(String idCliente, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.pedidosRealizados = new ArrayList<>(); //inicializ<ando pedidos realizados como una lista vacia

    }
    //metodo para agregar pedido
    public void agregarPedido(Pedidos pedidoRedcibido){
        //nmouse
        pedidosRealizados.add(pedidoRecibido);
        System.out.println("producto agregado a la lista" + pedidoRecibido);
        
    }
    //metodo para mostrar los pedidos realizados.
    public void mostrarPedidos(){
        System.out.println("pedidos realizados por: "+ nombreCliente);
        for(Pedidos productoEntontrado: pedidosRealizados){
            System.out.println("productoEncontrado");
        }
    }
    // uss

    public Cliente(String idCliente, String nombreCliente, <any> pedidosRealizados) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.pedidosRealizados = pedidosRealizados;
    }
    
    
    
    
    
}
