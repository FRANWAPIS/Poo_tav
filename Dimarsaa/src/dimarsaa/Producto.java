
package dimarsaa;


public class Producto {
    //Atributos
    private String idProducto, nombreProducto;
    private double precio;
    //constructor
    public Producto(String idProducto, String nombreProducto);
    this.idProducto(String idProducto);
    this.nombreProducto = nombreProducto;
    this.precio = precio;
    
    public double getPrecio() {
        return precio;
        
        
    }
    public void setPrecio(double precio) {
        this.precio = precio;
       
    }
    //metodo calcular descuento
    public double calcularDescuento(double descuento) {
        return precio - (precio + descuento/100);
    }
    //ts
    @override
    public String toString(){
        return "Producto(" + "idProducto=" + idProducto + ",nombre"
    }
   
}
