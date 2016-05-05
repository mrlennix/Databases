/*
Class: CSE3320
Semester: Spring 2016
Student Name: Emmanuel Lennix
Student ID: 1001104990
Assignment: project #4


*/
public class Pilot
{
    private String ID;
    private String Name;
    private String DateHired;

    public Pilot(){}

    public void makeDummy()
    {

        setID("ID");
        setName("Name");
        setDateHired("DateHired");

    }

    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getDateHired()
    {
        return DateHired;
    }

    public void setDateHired(String dateHired)
    {
        DateHired = dateHired;
    }

    public String getTable()
    {
        return "Pilot ";
    }

}
