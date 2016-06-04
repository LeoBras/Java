import static org.junit.Assert.*;

import org.junit.Test;

public class TestePaciente {

	@Test
	public void testIMC() {
		Paciente	pedro = 	new Paciente(60, 2),
					andre = 	new Paciente(70, 2),
					tome =  	new Paciente(80, 2),
					filipe = 	new Paciente(110, 2),
					matheus = 	new Paciente(130, 2),
					bart = 		new Paciente(150, 2),
					tiago = 	new Paciente(180, 2);
					
		
		assertTrue(pedro.calcularIMC() < 16);
		assertEquals(andre.calcularIMC(), 17.75, 0.75);
		assertEquals(tome.calcularIMC(), 21.75, 3.25);
		assertEquals(filipe.calcularIMC(), 27.5, 2.5);
		assertEquals(matheus.calcularIMC(), 32.5, 2.5);
		assertEquals(bart.calcularIMC(), 37.5, 2.5);
		assertTrue(tiago.calcularIMC() > 40);
		
	}

}
