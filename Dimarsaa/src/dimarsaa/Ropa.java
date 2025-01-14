
package dimarsaa;


public class Ropa extends Producto {
    //atributos
    private String talla, color;
    
    //constructor

    public Ropa(String talla, String color, String idProducto, String nombreProducto) {
        super(idProducto, nombreProducto);
        this.talla = talla;
        this.color = color;
    }

    public Ropa(String talla, String color, String idProducto) {
        super(idProducto);
        this.talla = talla;
        this.color = color;
    }
    
    //ts

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCalcularDescuento() {
        return calcularDescuento;
    }
    
    //metodo cambiar talla
    public void cambiarTalla(String nuevaTalla){
        talla + nuevaTalla;
        System.out.println("La talla fue actualizada"+ talla);
    }

    
    
    
}
