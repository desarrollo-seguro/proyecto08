package es.santander.ascender.proyecto08;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        
        assertEquals(3, diaSemana);
        System.out.println(diaSemana);
    }
}
