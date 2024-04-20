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
}
