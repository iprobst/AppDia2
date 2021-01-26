package ejercicioTM.ej5;

import java.util.Calendar;

public class Fecha {

    Calendar calendar;

    public Fecha(Calendar calendar) {
        this.calendar = calendar;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "calendar=" + calendar +
                '}';
    }
}
