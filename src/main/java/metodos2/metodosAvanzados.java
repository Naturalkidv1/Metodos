/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos2;

/**
 *
 * @author ajbazan01
 */
public class metodosAvanzados {

    
    
    
    public static void main(String[] args) {
        
        
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo("0753 JHG", "Kia");
        
        v2.setMarca("Honda");
        
        System.out.println(v2.getAtributos());
        v2.setMarca("Mercedes");
        // v1.imprimirAtributos();
        System.out.println(v2.getAtributos());
        // v2.imprimirAtributos();
        v1.setMatricula("1234 DDD");
        v1.setMarca("Renault");
        System.out.println(v1.getAtributos());
        //System.out.println(v2.getAtributos());
    }
    
    
}
