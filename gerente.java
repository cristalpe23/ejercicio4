package practica4;

public class gerente extends empleado {
	
    public float sueldo() {
    	float incremento=getSalario()*getHorasTrabajadas();
    	float sueldo=(incremento*50/100)+incremento;
        
    	return sueldo; 
    }

}