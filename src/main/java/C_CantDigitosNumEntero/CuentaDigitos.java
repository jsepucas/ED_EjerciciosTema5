package C_CantDigitosNumEntero;

public class CuentaDigitos {
    public static int contarDigitos(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return 1 + contarDigitos(numero / 10);
        }
    }

    public static void main(String[] args) {
        int numero = 12345;
        System.out.println("El número " + numero + " tiene " + contarDigitos(numero) + " dígitos.");
    }
}
