
package dimarsaa;


public class Electronico extends Producto {
    //atributos adicionales
    private String marca;
    private int garantiaMeses;
    
    //constructor

    public Electronico(String marca, int garantiaMeses) {
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }
    //metodo meses extra
    public void extenderGarantia(int mesesExtra){
        
        garantiaMeses +=mesesExtra;
        //garantiameses 
        garantiaMeses +=mesesExtra;
        System.out.println("la garantia ha sido extendida a"+ garantiaMeses);
    }
    //ts
    
    
}
