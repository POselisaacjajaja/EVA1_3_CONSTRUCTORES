/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_3_constructores;

/**
 *
 * @author isaaczapatto
 */
public class CuentaBancaria {
    //Datos (atributos)
    private String Cliente;
    private double Saldo;
    private String Cuenta;
    
    //Constructor (después de los atributos)
    //Modificador de acceso + nombre de la clase + (argumentos())
    public CuentaBancaria(){//Si no tiene argumentos, es CONSTRUCTOR DEFAULT
        Cuenta = "papunumero de papu cuenta vacío";
        Saldo = 5;
        Cliente = "papu cliente sin papu nombre";
    }
    
    //Segundo constructor, pueden existir dos iguales mientras cambie
    public CuentaBancaria(String nCuenta, double cSaldo, String nCliente){
        nCuenta = Cuenta;
        cSaldo = Saldo;
        nCliente = Cliente;
    }
    
    //Método get
    public String getCliente(){     
    return Cliente;
    }
    public double getSaldo(){     
    return Saldo;
    }
    public String getCuenta(){     
    return Cuenta;
    }
    
    //Método set
    public void setCliente(String valor){
     Cliente = valor;
    }
    public void setSaldo(double valor){
     Saldo = valor;
    }
    public void setCuenta(String valor){
     Cuenta = valor;
    }
    
    //Imprmir los datos
    public void imprmirDatos(){
        System.out.println("Cliente: " + Cliente);
        System.out.println("Número de cuenta: " + Cuenta);
        System.out.println("Saldo: " + Saldo);
        
        
    }
    
}
