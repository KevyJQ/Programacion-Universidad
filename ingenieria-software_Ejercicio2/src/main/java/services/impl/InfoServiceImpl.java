package services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Estudiante;
import model.Materia;
import model.Persona;
import model.PersonalServicio;
import model.Profesor;
import services.InfoService;

public class InfoServiceImpl implements InfoService {
	Scanner sc = new Scanner(System.in);
	List<Materia> materias;

	@Override
	public void pedirDatos(Persona persona) {
		System.out.print("Nombre: ");
		persona.setName(sc.nextLine());
		System.out.print("Apellido Paterno: ");
		persona.setApellidoPaterno(sc.nextLine());
		System.out.print("Apellido Materno: ");
		persona.setApellidoMaterno(sc.nextLine());
		System.out.print("ID: ");
		persona.setId(sc.nextLine());
		System.out.print("Estado civil: ");
		persona.setEstadoCivil(sc.nextLine());
		System.out.print("Numero de Oficina.\nSi eres estudiante solo dale Enter: ");
		persona.setNumOficina(sc.nextLine());
		System.out.println();
	}

	@Override
	public void imprimirDatosGeneral(Persona persona) {
		System.out.println("Nombre: " + persona.getName());
		System.out.println("Apellido Paterno: " + persona.getApellidoPaterno());
		System.out.println("Apellido Materno: " + persona.getApellidoMaterno());
		System.out.println("ID: " + persona.getId());
		System.out.println("Estado civil: " + persona.getEstadoCivil());
		System.out.println("Numero de oficina: " + persona.getNumOficina());
	}

	public void imprimirMaterias(Estudiante estudiante) {
		System.out.println("Las materias que tengo incritas son :");
		for (int j = 0; j < estudiante.getMaterias().size(); j++) {
			Materia materia2 = estudiante.getMaterias().get(j);
			System.out.println(materia2.getNombre());
		}
		System.out.println();
	}

	@Override
	public void imprimirDepartamento(Profesor profesor) {
		System.out.println("Año de ingreso " + profesor.getaIngreso());
		System.out.println("Departamento: " + profesor.getDepartamento());
	}

	@Override
	public void imprimirSeccionAsignada(PersonalServicio personalServicio) {
		System.out.println("Año de ingreso: " + personalServicio.getaIngreso());
		System.out.println("Seccion Asignada: " + personalServicio.getSeccionAsignada());
	}

	@Override
	public void pedirDatosProfesor(Profesor profesor) {
		System.out.println("En que año ingreso: ");
		profesor.setaIngreso(sc.nextLine());
		System.out.println("Que numero de oficina tiene asignado: ");
		profesor.setNumOficina(sc.nextLine());
		System.out.println(
				"Es que departamento esta asignado. Ejemplos:\nIngenieria\nMatematicas\nAdministracion\netc..");
		profesor.setDepartamento(sc.nextLine());
	}

	@Override
	public void pedirDatosPersonalSerivicio(PersonalServicio personalServicio) {
		System.out.println("En que año ingreso: ");
		personalServicio.setaIngreso(sc.nextLine());
		System.out.println("En que seccion esta asignado. Ejemplo:\nBiblioteca\nSalones\nOficinas\netc..");
		personalServicio.setSeccionAsignada(sc.nextLine());
	}

	@Override
	public void agregarMaterias(Estudiante estudiante) {
		for (int i = 0; i < materias.size(); i++) {
			Materia materia = materias.get(i);
			System.out.println((i + 1) + " materia: " + materia.getNombre());
		}
		System.out.print("\nQue materia deseas agregar: ");
		int index = sc.nextInt();
		Materia materia = materias.get(index - 1);
		estudiante.agregarMateria(materia);

		System.out.println("\nLista de materias");
		for (int j = 0; j < estudiante.getMaterias().size(); j++) {
			Materia materia2 = estudiante.getMaterias().get(j);
			System.out.println(materia2.getNombre());
		}
		System.out.println();
	}

	@Override
	public void cambioEstadoCivil(Persona persona) {
		System.out.println("Tu actual estado civil es: " + persona.getEstadoCivil());
		System.out.print("Cual es tu nuevo estado civil: ");
		persona.setEstadoCivil(new String());
		persona.setEstadoCivil(sc.nextLine());
	}

	@Override
	public void reAsignacionOficina(Persona persona) {
		System.out.println("Tu actual numero de oficina es: " + persona.getNumOficina());
		System.out.println("Cual es el nuevo numero de tu oficina: ");
		persona.setEstadoCivil(new String());
		persona.setNumOficina(sc.nextLine());
	}

	@Override
	public void inicializarMaterias() {
		materias = new ArrayList<Materia>();

		Materia mate = new Materia();
		mate.setNombre("Matematicas");

		Materia fisica = new Materia();
		fisica.setNombre("FIsica");

		Materia quimica = new Materia();
		quimica.setNombre("Quimica");

		Materia etica = new Materia();
		etica.setNombre("Etica");

		Materia calculo = new Materia();
		calculo.setNombre("Calculo");

		Materia ia = new Materia();
		ia.setNombre("Inteligencia Artificial");

		materias.add(mate);
		materias.add(fisica);
		materias.add(quimica);
		materias.add(etica);
		materias.add(calculo);
		materias.add(ia);

	}
}
