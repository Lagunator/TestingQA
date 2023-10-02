package TareasFinde.tareaBanco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BancoTest {
    private Banco banco;
    private ASFI mockASFI;

    @BeforeEach
    public void setUp() {
        mockASFI = Mockito.mock(ASFI.class);
        banco = new Banco(mockASFI);
    }

    @Test
    public void testGetMaximoPrestamoCategoriaA() {
        // Configura el comportamiento simulado del método getCategoria(ci)
        Mockito.when(mockASFI.getCategoria("454566")).thenReturn("A");

        int maxPrestamo = banco.getMaximoPrestamo("454566");

        assertEquals(200000, maxPrestamo);
    }

    @Test
    public void testGetMaximoPrestamoCategoriaB() {
        Mockito.when(mockASFI.getCategoria("999999")).thenReturn("B");

        int maxPrestamo = banco.getMaximoPrestamo("999999");

        assertEquals(100000, maxPrestamo);
    }

    @Test
    public void testGetMaximoPrestamoCategoriaC() {
        Mockito.when(mockASFI.getCategoria("77777")).thenReturn("C");

        int maxPrestamo = banco.getMaximoPrestamo("77777");

        assertEquals(0, maxPrestamo);
    }
}

