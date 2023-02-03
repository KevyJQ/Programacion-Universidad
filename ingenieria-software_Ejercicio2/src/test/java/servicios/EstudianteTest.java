package servicios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import model.Estudiante;
import model.Materia;

public class EstudianteTest {

	@Test
	public void agregarMateria() {
		List<Materia> materias = new ArrayList<>();
		Materia materia = new Materia();
		materia.setNombre("Mate");
		materias.add(materia);
		assertEquals(materias.size(), 1);
	}

	@Test
	public void exiteEstudiante() {
		Estudiante estudiante = new Estudiante();
		estudiante.setName("NameTest");
		assertNotNull(estudiante.getName());
	}
}
