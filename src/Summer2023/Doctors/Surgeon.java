package Doctors;

public class Surgeon extends Doctor{
    public Surgeon(String name) {
        super(name);
    }

    @Override
    public String getSchedule() {
        return " - Surgeon: Monday, Tuesday, Friday, and Sunday";
    }
}
