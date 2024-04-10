package actividad1;

public class Main {

	public static void main(String[] args) {
		
		Empleado [] e1 = new Empleado[4];
		
		e1[0] = new Empleado("45589933N", "Juan", "Hernandez", 1000);
		e1[1] = new Empleado("45494858M", "Pedro", "Rincon", 2000);
		e1[2] = new Empleado("45783648L", "Adrian", "Velasco", 3000);
		e1[3] = new Empleado("45998273A", "Xema", "Crack", 4000);
		
		aumentarSueldo(e1);

	}
	public static void aumentarSueldo(Empleado[]e1){
		    float sueldot;
            for (int i = 0; i < e1.length; i++) {
			
			sueldot = (e1[i].getSueldo())+((e1[i].getSueldo()/100)*5);
			e1[i].setSueldo(sueldot);
			
			System.out.println(e1[i].getNombre()+" con sueldo "+e1[i].getSueldo() );
		}
		
		
	}
	

}
