import org.junit.Test;
import static org.junit.Assert.assertEquals;
import src.main.java.Conversor;

public class ConversorTest {

    @Test
    public void testFahrenheitParaCelsius() {
        assertEquals(0, Conversor.fahrenheitParaCelsius(32), 0.001);
        assertEquals(100, Conversor.fahrenheitParaCelsius(212), 0.001);
    }

    @Test
    public void testCelsiusParaFahrenheit() {
        assertEquals(32, Conversor.celsiusParaFahrenheit(0), 0.001);
        assertEquals(212, Conversor.celsiusParaFahrenheit(100), 0.001);
    }
}
