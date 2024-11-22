package es.santander.ascender.proyecto08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatesTest {
    private DatesWithTimeZone cut;

    @BeforeEach
    public void setup() {
        cut = new Dates();
    }

    @Test
    void testGetDateTimeWithTimeZone() {
        String actual = cut.getDateTimeWithTimeZone();

        System.out.println(actual);
    }

    @Test
    void testGetDayOfWeek() {
        int diaSemana = cut.getDayOfWeek();
        
        // Este test no sería correcto, puesto que solo funcionaría los miércoles
        //assertEquals(3, diaSemana);
        assertTrue(diaSemana >= 1 && diaSemana <= 7);
        System.out.println(diaSemana);
    }
}
