import org.junit.*;
import static org.junit.Assert.*;

public class TestExempleSujet {
	
	@Test
	public void testExemple() throws Exception {
		String[] args = {"-K","10","-A",".90","-K","20","-P","-K","30","-C"};
		Configuration configuration = CLIClassique.configuration(args);
		assertEquals(configuration.toString(),"alpha=0.9, epsilon=-1.0, indice=30, mode=CREUSE");
	}
	
}
