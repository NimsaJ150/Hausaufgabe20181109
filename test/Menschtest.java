import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Menschtest {
	
	public Mensch m;

	@Test
	void vorstellen() {
		m = new Mensch();
		String name = "Heinz";
		String text = m.vorstellen(name);
		assertEquals("Ich bin " + name, text);
	}

}
