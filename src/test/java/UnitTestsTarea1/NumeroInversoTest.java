package UnitTestsTarea1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroInversoTest {

    NumeroInverso numeroInverso = new NumeroInverso();

    @Test
    public void testInvertirNumero123() {
        assertEquals("321", numeroInverso.invertir(123));
    }

    @Test
    public void testInvertirNumero100() {
        assertEquals("001", numeroInverso.invertir(100));
    }

    @Test
    public void testInvertirNumero8() {
        assertEquals("8", numeroInverso.invertir(8));
    }

    @Test
    public void testInvertirNumero80() {
        assertEquals("08", numeroInverso.invertir(80));
    }

    @Test
    public void testInvertirNumeroNegativo() {
        assertEquals("Valor Incorrecto", numeroInverso.invertir(-1));
    }
}
