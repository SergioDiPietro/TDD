import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class TestContador {

    @Test
    public void testObjetoCreado() {
        Contador test = new Contador(0,1,10);
        assertNotNull(test);
    }

    @Test
    public void testConstructor() {
        Contador test = new Contador(0,1,10);
        assertNotNull(test);
    }
}