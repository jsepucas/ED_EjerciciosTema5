package F_CadLongHexa;

public class ConversorHexaDecimal {

    public static int hexaADecimal(String hex, int longitud) {
        if (longitud == 0) {
            return 0;
        } else {
            char caracterActual = hex.charAt(longitud - 1);
            int valorActual = Character.digit(caracterActual, 16);
            return valorActual * (int) Math.pow(16, hex.length() - longitud) + hexaADecimal(hex, longitud - 1);
        }
    }

    public static void main(String[] args) {
        String hex = "1A3F";
        int resultado = hexaADecimal(hex, hex.length());
        System.out.println("El valor decimal de la cadena hexadecimal " + hex + " es: " + resultado);
    }
}
