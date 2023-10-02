package TareasFinde.tareaBanco;

public class Banco {
    private ASFI asfi;

    public Banco(ASFI asfi) {
        this.asfi = asfi;
    }

    public int getMaximoPrestamo(String ci) {
        String categoria = asfi.getCategoria(ci);
        switch (categoria) {
            case "A":
                return 200000;
            case "B":
                return 100000;
            default:
                return 0;
        }
    }
}

public class ASFI {
    public String getCategoria(String ci) {
        // Lógica para obtener la categoría de la ASFI
        // Retorna "A", "B", o "C" según la categoría
    }
}

