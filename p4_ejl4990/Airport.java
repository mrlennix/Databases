/**
Class: CSE3320
Semester: Spring 2016
Student Name: Emmanuel Lennix
Student ID: 1001104990
Assignment: project #4

 */
public class Airport
{
    private String Code;
    private String City;
    private String State;

    public Airport(){}

    public void makeDummy()
    {

        setCode("Code");
        setCity("City");
        setState("State");

    }

    public String getCode()
    {
        return Code;
    }

    public void setCode(String code)
    {
        Code = code;
    }

    public String getCity()
    {
        return City;
    }

    public void setCity(String city)
    {
        City = city;
    }

    public String getState()
    {
        return State;
    }

    public void setState(String state)
    {
        State = state;
    }

    public String getTable()
    {
        return "Airport ";
    }



}
