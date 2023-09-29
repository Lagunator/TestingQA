package UnitTestsTarea1;

public class NumeroInverso {

    public String invertir(int number) {
        if (number < 0) {
            return "Valor Incorrecto";
        }
        String numeroComoCadena = Integer.toString(number);
        String resultado = "";
        for (int i = numeroComoCadena.length() - 1; i >= 0; i--) {
            resultado += numeroComoCadena.charAt(i);
        }
        return resultado;
    }
}

