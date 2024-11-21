import java.util.List;

import logica.Fachada;
import logica.VOPersona;

public class Principal {
	public static void main(String[] args) {
		Fachada fachada = new Fachada();
		/*
		fachada.nuevaPersona(new VOPersona(4, "Persona1", 6));
		fachada.nuevaPersona(new VOPersona(5, "Persona2", 4));
        fachada.nuevaPersona(new VOPersona(6, "Persona3", 8));
        */
		//TEST
        List<VOPersona> mayores = fachada.listarMayores(5);
        for (VOPersona persona : mayores) {
            System.out.println(" CEDULA: " + persona.getId() + ", NOMBRE: " + persona.getNombre() + ", EDAD: " + persona.getEdad());
        }
	}
}