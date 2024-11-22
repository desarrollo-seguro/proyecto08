package es.santander.ascender.proyecto08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class BattleRoyalTest {

    @Test
    public void testExecuteDeleteMe() {
        DatesWithTimeZone a;

        a = new Dates();
        a = new FechaHora();
        
        String resultado;
        if (a instanceof Dates) {
             resultado = a.getDateTimeWithTimeZone();
        } else {
            resultado = a.getDateTimeWithTimeZone();
        }

        a.getRandomDiaSemana();
    }

    @Test
    public void testStream() {
        List<String> lista = Arrays.asList("Hola", "Adios", "Hi", "Goodbye");
        
        int suma = lista.stream()
                .mapToInt(s -> s.length())
                .filter(x -> x >= 5)
                .sum();

        assertEquals(12, suma);

        List<String> cadenasCortas = lista.stream()
                .filter(s -> s.length() < 5)
                .collect(Collectors.toList());
        assertEquals(2, cadenasCortas.size());
    }

}
