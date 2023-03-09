package com.cursoceat.controller;

import java.util.ArrayList;

import com.cursoceat.model.Empleado;
import com.cursoceat.model.JefeEstacion;
import com.cursoceat.model.Locomotora;
import com.cursoceat.model.Maquinista;
import com.cursoceat.model.Mecanico;
import com.cursoceat.model.Tren;
import com.cursoceat.model.Mecanico.ESPECIALIDAD;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//crear un array y vamos guardando cada objeto
		ArrayList<Empleado> misEmpleados=new ArrayList<Empleado>();
		

		Mecanico unMecanico=new Mecanico("jd", "21","2323", 10.00, ESPECIALIDAD.ELECTRICIDAD );
		
		//misEmpleados.add(unMecanico);
		
		unMecanico.mostrarDatos();
	    //System.out.println(unMecanico.toString());
	    
	    Maquinista unMaquinista=new Maquinista("Pepe", "19","6554", 1293.4, "Jefe Seccion");
	    //unMaquinista.mostrarDatos();
	    
	    misEmpleados.add(unMaquinista);
	    
	    JefeEstacion unJefeEstacion=new JefeEstacion ("Diego","545454k","3489",10389.5);
	    //unJefeEstacion.mostrarDatos();
	    
	    misEmpleados.add(unJefeEstacion);
	    
	    JefeEstacion otroJefeEstacion= new JefeEstacion("Azucena" , "85489348", "4312", 234.32);
	    misEmpleados.add(otroJefeEstacion);
	    
	    //muestro en este momento lo que tengo en mis empleados 
	    for(Empleado e:misEmpleados) {
	    	e.mostrarDatos();
	    }
	    
	    
	    //************************
	    System.out.println("*********Desde aqui ejecutamos maquinaria*********");
	    
	    Locomotora unaLocomotora=new Locomotora("433434", 1500,2003, unMecanico);
	    
	    Tren miTren= new Tren(unaLocomotora, unMaquinista);
	    
	    miTren.agregarVagon(30000, 15000, "papatatas");
	    
	    System.out.println(miTren.toString());
	}

}
