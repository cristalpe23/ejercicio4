package practica4;

public class contador extends empleado {
    
        public float sueldo() {
    	float incremento=getSalario()*getHorasTrabajadas();
    	float sueldo=(incremento*35/100)+incremento;
        
    	return sueldo; 
    }

}