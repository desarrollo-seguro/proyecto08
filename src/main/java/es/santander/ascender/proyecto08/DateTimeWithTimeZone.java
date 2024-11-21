package es.santander.ascender.proyecto08;

public interface DateTimeWithTimeZone {
    public static final int LUNES = 0;

    public abstract String getActual();
    public abstract int getDayOfTheWeek();
}
