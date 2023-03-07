
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoCardenasFigueroaPedroPatricio2223 miVehiculoCardenasFigueroaPedroPatricio2223;
        int stockActual;
        
        
        miVehiculoCardenasFigueroaPedroPatricio2223 = new VehiculoCardenasFigueroaPedroPatricio2223("Seat",18000,100);
        
        
        operativaVehiculosCardenasFigueroaPedroPatricio2223(miVehiculoCardenasFigueroaPedroPatricio2223, 50); 
    }

    private static void operativaVehiculosCardenasFigueroaPedroPatricio2223(VehiculoCardenasFigueroaPedroPatricio2223 miVehiculoCardenasFigueroaPedroPatricio2223, int cantidad) {
        int stockActual;
        
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoCardenasFigueroaPedroPatricio2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoCardenasFigueroaPedroPatricio2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoCardenasFigueroaPedroPatricio2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }
      

}
    
