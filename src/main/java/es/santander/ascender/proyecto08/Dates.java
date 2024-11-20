package es.santander.ascender.proyecto08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Dates implements DatesWithTimeZone {
    @Override
    public String getDateTimeWithTimeZone() {
        Date fechaActual = new Date();
        
        // Crear un formato de fecha y hora que incluya la zona horaria
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss'Z'");
        
        // Establecer la zona horaria a la del sistema (o la que desees)
        formato.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        // Convertir la fecha actual a una cadena con el formato deseado
        String fechaConZonaHoraria = formato.format(fechaActual);


        return fechaConZonaHoraria;
    }

    @Override
    public int getDayOfWeek() {
        // TODO Auto-generated method stub
        Calendar calendar = Calendar.getInstance();

        // Obtener el día de la semana (1=domingo, 2=lunes, ..., 7=sábado)
        int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

        // Si quieres que el lunes sea 1, podemos ajustar el valor
        int diaLunesComo1 = (diaSemana == Calendar.SUNDAY) ? 7 : diaSemana - 1;
        
        return diaLunesComo1;
    }

    public String otroMetodo() {
        return null;
    }
}
