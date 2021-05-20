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

    @Test
    public void testConstructor1P() {
        Contador test = new Contador(10);
        assertEquals(10, test.getValorLimite());
    }

    @Test
    public void testConstructor3P() {
        Contador test = new Contador(1,1,10);
        int suma = test.getValorInicial() + test.getIncremento() + test.getValorLimite();
        assertEquals(12, suma);
    }
}