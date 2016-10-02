/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author rafael
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        empleado empleado=new empleado();
        empleado.setSalario(100);
        empleado.setHorasTrabajadas(40);
        float sueldo=empleado.sueldo();
        System.out.println(sueldo);
        contador contador=new contador();
        contador.setSalario(100);
        contador.setHorasTrabajadas(40);
        sueldo=contador.sueldo();
        System.out.println(sueldo);
        gerente gerente=new gerente();
        gerente.setSalario(100);
        gerente.setHorasTrabajadas(40);
        sueldo=gerente.sueldo();
        System.out.println(sueldo);
    }
    
}
