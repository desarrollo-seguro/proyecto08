package es.santander.ascender.proyecto08;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
    }

}
