package es.santander.ascender.proyecto08;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class FechaHora implements DatesWithTimeZone {
    @Override
    public String getDateTimeWithTimeZone() {
         Date fechaActual = new Date();
        
        // Mostrar el valor interno en milisegundos desde la "Epoch"
        System.out.println("Fecha interna en milisegundos desde Epoch: " + fechaActual.getTime());
        
        // Crear un formato de fecha y hora que cumpla con ISO 8601
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        
        // Establecer la zona horaria a la del sistema (o la que desees)
        formato.setTimeZone(TimeZone.getDefault());
        
        // Convertir la fecha actual a una cadena con el formato ISO 8601
        String fechaISO8601 = formato.format(fechaActual);
        
        return fechaISO8601;
    }

    @Override
    public int getDayOfWeek() {
        return 0;
    }

    @Override
    public DiaSemana getRandomDiaSemana() {
        // Esto es un ejemplo de tenerlo como número
        int valorNumerico = DiaSemana.DOMINGO.ordinal();
        return DiaSemana.DOMINGO;
    }

}
