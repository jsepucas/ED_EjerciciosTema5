package H_CadenasDeADN;
import java.util.Random;
public class ContadorDeGenes {

    public static String generarCadenaADN(int longitud) {
        String bases = "ACGT";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(bases.length());
            sb.append(bases.charAt(index));
        }
        return sb.toString();
    }

    public static int contarGenes(String cadena) {
        int cuenta = 0;
        int index = cadena.indexOf("ATG");
        while (index != -1) {
            cuenta++;
            index = cadena.indexOf("ATG", index + 3); // Buscar el próximo ATG después del actual
        }
        return cuenta;
    }
}
