/**
 Class: CSE3320
Semester: Spring 2016
Student Name: Emmanuel Lennix
Student ID: 1001104990
Assignment: project #4

 */
public class Passenger
{
    private String ID;
    private String Name;
    private String Phone;

    public Passenger(){}

    public void makeDummy()
    {

        setID("ID");
        setName("Name");
        setPhone("Phone");

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

    public String getPhone()
    {
        return Phone;
    }

    public void setPhone(String phone)
    {
        Phone = phone;
    }

    public String getTable()
    {
        return "Passenger ";
    }

}
