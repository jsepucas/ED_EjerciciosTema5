package K_Fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class GestorDeFechas {

    private List<Date> fechas;
    private SimpleDateFormat sdf;

    public GestorDeFechas() {
        fechas = new ArrayList<>();
        sdf = new SimpleDateFormat("dd/MM/yyyy");
    }


    public void agregarFecha(String fecha) throws ParseException {
        Date date = sdf.parse(fecha);
        fechas.add(date);
    }

    public List<Date> obtenerFechasOrdenadas() {
        Collections.sort(fechas);
        return fechas;
    }

    public static void main(String[] args) {
        GestorDeFechas gestor = new GestorDeFechas();
        try {
            gestor.agregarFecha("01/01/2021");
            gestor.agregarFecha("01/01/2020");
            gestor.agregarFecha("01/01/2022");

            List<Date> fechasOrdenadas = gestor.obtenerFechasOrdenadas();
            for (Date fecha : fechasOrdenadas) {
                System.out.println(gestor.sdf.format(fecha));
            }
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
    }
}
