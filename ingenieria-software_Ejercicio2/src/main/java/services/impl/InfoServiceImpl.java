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
		System.out.println("Apellido Paterno: ");
		persona.setApellidoPaterno(sc.nextLine());
		System.out.println("Apellido Materno: ");
		persona.setApellidoMaterno(sc.nextLine());
		System.out.println("ID: ");
		persona.setId(sc.nextLine());
		System.out.println("Estado civil: ");
		persona.setEstadoCivil(sc.nextLine());

	}

	@Override
	public void imprimirDatos(Persona persona) {
		System.out.println("Nombre: " + persona.getName());
		System.out.println("Apellido Paterno: " + persona.getApellidoPaterno());
		System.out.println("Apellido Materno: " + persona.getApellidoMaterno());
		System.out.println("ID: " + persona.getId());
		System.out.println("Estado civil: " + persona.getEstadoCivil());
	}

	@Override
	public void pedirDatosEmpleados(Persona persona) {
		System.out.println("En que año ingresaste: ");
		persona.setAnoIngreso(sc.nextLine());
		System.out.println("Que numero de oficina tiene asignado: ");
		persona.setNumOficina(sc.nextLine());
	}

	@Override
	public void agregarMaterias(Estudiante estudiante) {
		for (int i = 0; i < materias.size(); i++) {
			Materia materia = materias.get(i);
			System.out.println((i + 1) + " materia: " + materia.getNombre());
		}
		// TODO: Implementar la seleccion de materias
		int selectIndex = 1;
		Materia materia = materias.get(selectIndex);
		estudiante.agregarMateria(materia);

		System.out.println("Materias del estudiante");
		for (int j = 0; j < estudiante.getMaterias().size(); j++) {
			Materia materia2 = estudiante.getMaterias().get(j);
			System.out.println("Sus materias" + materia2.getNombre());
		}
//		List<String> materias = new ArrayList<>();
//
//		System.out.println("Cuantos cursos estan tomando: ");
//		int loop = estudiante.setCursoInscrito(sc.nextInt());
//
//		for (int i = 1; i <= loop; i++) {
//			System.out.println("Materia " + i);
//			materias.add(sc.nextLine());
//		}
//		estudiante.setMaterias(materias);
	}

	@Override
	public void cambioEstadoCivil(Persona persona) {
		System.out.println("Tu actual estado civil es: " + persona.getEstadoCivil());
		System.out.print("Cual es tu nuevo estado civil: ");
		persona.setEstadoCivil(sc.nextLine());
	}

	@Override
	public void reAsignacionOficina(Persona persona) {
		System.out.println("Tu actual numero de oficina es: " + persona.getNumOficina());
		System.out.println("Cual es el nuevo numero de tu oficina: ");
		persona.setNumOficina(sc.nextLine());
	}

	@Override
	public void departamentoAsignado(Profesor profesor) {
		System.out.println(
				"Es que departamento esta asignado. Ejemplos:\nIngenieria\nMatematicas\nAdministracion\netc..");
		profesor.setDepartamento(sc.nextLine());
	}

	@Override
	public void seccionAsignada(PersonalServicio personalServicio) {
		System.out.println("En que seccion esta asignado. Ejemplo:\nBiblioteca\nSalones\nOficinas\netc..");
		personalServicio.setSeccionAsignada(sc.nextLine());

	}

	@Override
	public void inicializarMaterias() {
		materias = new ArrayList<Materia>();

		Materia mate = new Materia();
		mate.setNombre("Matematicas");

		Materia fisica = new Materia();
		fisica.setNombre("FIsica");

		materias.add(mate);
		materias.add(fisica);
	}

}
