package tareasFinde;

import tareasFinde.ASFI;

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

