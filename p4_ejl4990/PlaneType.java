/**
 Class: CSE3320
Semester: Spring 2016
Student Name: Emmanuel Lennix
Student ID: 1001104990
Assignment: project #4

 */
public class PlaneType
{
    private String Make;
    private String Model;
    private String FlyingSpeed;
    private String GroundSpeed;

    public PlaneType(){}

    public void makeDummy()
    {

        setMake("Make");
        setModel("Model");
        setFlyingSpeed("FlyingSpeed");
        setGroundSpeed("GroundSpeed");

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

    public String getFlyingSpeed()
    {
        return FlyingSpeed;
    }

    public void setFlyingSpeed(String flyingSpeed)
    {
        FlyingSpeed = flyingSpeed;
    }

    public String getGroundSpeed()
    {
        return GroundSpeed;
    }

    public void setGroundSpeed(String groundSpeed)
    {
        GroundSpeed = groundSpeed;
    }

    public String getTable()
    {
        return "PlaneType ";
    }
}
