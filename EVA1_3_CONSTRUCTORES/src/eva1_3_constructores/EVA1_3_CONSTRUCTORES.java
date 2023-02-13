/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_constructores;

/**
 *
 * @author isaaczapatto
 */
public class EVA1_3_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CuentaBancaria Cuenta1 = new CuentaBancaria();
        CuentaBancaria Cuenta1 = new CuentaBancaria("100", 100000, "Clarosiono");
        
        System.out.println("Datos del cliente:");
        Cuenta1.setCliente("Juanpa Zurita");
        Cuenta1.setCuenta("MAAJ960329HDFRRN03");
        Cuenta1.setSaldo(0.07);
        Cuenta1.imprmirDatos();
        
        CuentaBancaria Cuenta2 = new CuentaBancaria();
        Cuenta2.imprmirDatos();
        
        
        CuentaBancaria Cuenta3 = new CuentaBancaria();
        Cuenta3.imprmirDatos();
        
        CuentaBancaria Cuenta4 = new CuentaBancaria();
        Cuenta4.imprmirDatos();
    }
    
}
