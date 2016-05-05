/**
 Class: CSE3320
Semester: Spring 2016
Student Name: Emmanuel Lennix
Student ID: 1001104990
Assignment: project #4

 */
public class Plane
{
    private String ID;
    private String Make;
    private String Model;
    private String LastMaint;
    private String LastMaintA;

    public Plane(){}

    public void makeDummy()
    {

        setID("ID");
        setMake("Make");
        setModel("Model");
        setLastMaint("LastMaint");
        setLastMaintA("LastMaintA");

    }

    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public String getMake()
    {
        return Make;
    }

    public void setMake(String make)
    {
        Make = make;
    }

    public String getModel()
    {
        return Model;
    }

    public void setModel(String model)
    {
        Model = model;
    }

    public String getLastMaint()
    {
        return LastMaint;
    }

    public void setLastMaint(String lastMaint)
    {
        LastMaint = lastMaint;
    }

    public String getLastMaintA()
    {
        return LastMaintA;
    }

    public void setLastMaintA(String lastMaintA)
    {
        LastMaintA = lastMaintA;
    }

    public String getTable()
    {
        return "Plane ";
    }

}
