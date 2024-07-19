package src.test.java;

import src.main.java.Conversor;

public class ConversorTest {

    public void testFahrenheitParaCelsius() {
        assertEquals(0, Conversor.fahrenheitParaCelsius(32), 0.001);
        assertEquals(100, Conversor.fahrenheitParaCelsius(212), 0.001);
    }

    private void assertEquals(int i, double fahrenheitParaCelsius, double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    public void testCelsiusParaFahrenheit() {
        assertEquals(32, Conversor.celsiusParaFahrenheit(0), 0.001);
        assertEquals(212, Conversor.celsiusParaFahrenheit(100), 0.001);
    }
}
