/**
Class: CSE3320
Semester: Spring 2016
Student Name: Emmanuel Lennix
Student ID: 1001104990
Assignment: project #4


 */
public class Flight
{
    private String FLNO;
    private String Meal;
    private String Smoking;

    public Flight(){}

    public void makeDummy()
    {

        setFLNO("FLNO");
        setMeal("Meal");
        setSmoking("Smoking");

    }

    public String getFLNO()
    {
        return FLNO;
    }

    public void setFLNO(String FLNO)
    {
        this.FLNO = FLNO;
    }

    public String getMeal()
    {
        return Meal;
    }

    public void setMeal(String meal)
    {
        Meal = meal;
    }

    public String getSmoking()
    {
        return Smoking;
    }

    public void setSmoking(String smoking)
    {
        Smoking = smoking;
    }

    public String getTable()
    {
        return "Flight ";
    }
}
