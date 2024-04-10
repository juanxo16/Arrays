package actividad1;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		
		Empleado[]empleado = new Empleado[5];
		menuPrincipal(empleado);
				

	}
	
public static void menuPrincipal(Empleado[]empleado) {
	Scanner sc = new Scanner(System.in);
	int eleccion = 0;
	int i=0;
	do { 
	System.out.println("Elija una opción: ");
	System.out.println("1.ALTA ");
	System.out.println("2.CONSULTA ");
	System.out.println("3.SALIR ");
	eleccion = sc.nextInt();
	
	switch(eleccion) {
		case 1:
			while(i < empleado.length && empleado[i] != null) {
				i++;
			}
			if(i < empleado.length) {
		    Empleado e1 = new Empleado();
			System.out.println("Introduzca los datos del empleado: ");
			System.out.println("Nombre: ");
			e1.setNombre(sc.next());
			System.out.println("Apellido: ");
			e1.setApellido(sc.next());
			System.out.println("DNI: ");
			e1.setDni(sc.next());
			System.out.println("Sueldo: ");
			e1.setSueldo(sc.nextFloat());	
			
			empleado[i]=e1;
			}
			else {
				System.out.println("No hay mas espacio");
			}
		break;
	
		case 2:
		for (Empleado e1 : empleado) {
			if( e1 != null) {			
			System.out.println("Estos son los datos del cliente ");
			System.out.println("Nombre");
			System.out.println(e1.getNombre());
			System.out.println("Apellido");
			System.out.println(e1.getApellido());
			System.out.println("DNI");
			System.out.println(e1.getDni());
			System.out.println("Sueldo");
			System.out.println(e1.getSueldo());
			System.out.println(" ");
			}
	}
	break;
		case 3:
	System.out.println("Saliste con éxito");
	
	default:
		System.out.println("Elija una de las 3 opciones");
	}
	}while(eleccion!=3);
	sc.close();
}
}

