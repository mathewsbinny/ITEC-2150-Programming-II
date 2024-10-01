package Doctors;

public class FamilyMedicine extends Doctor{
    public FamilyMedicine(String name) {
        super(name);
    }

    @Override
    public String getSchedule() {
        return " - Family Medicine: Monday through Friday and Saturday by weekly";
    }
}
