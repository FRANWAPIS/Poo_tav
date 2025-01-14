
package dimarsaa;


public class Pedidos {
    //atributos
    private ArrayList<Producto> ListaDeProductos;
    private double total;//monto total del pedido
    
    //constructor

    public Pedidos() {
        this.ListaDeProductos = new ArrayList<>();//lista vacia
        this.total = 0.0; //total en cero
    }
    //metodo pa agregar el pedido
    public void agregarProducto(Producto productoRecibido){
        ListaDeProductos.add(productoRecibido);
        
        //calcular el total del pedido
        public double calcularTotal(Producto PrecioDelProducto){
            
        }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
        
    
}
    
    
    }
