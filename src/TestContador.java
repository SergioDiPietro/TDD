import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class TestContador {

    @Test
    public void testObjetoCreado() {
        Contador test = new Contador();
        assertNotNull(test);
    }

    @Test
    public void testConstructorVacio() {
        Contador test = new Contador();
        assertEquals(1, test.getIncremento());
    }
}