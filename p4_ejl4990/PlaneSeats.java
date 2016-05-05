/**
Class: CSE3320
Semester: Spring 2016
Student Name: Emmanuel Lennix
Student ID: 1001104990
Assignment: project #4

 */
public class PlaneSeats
{
    private String Make;
    private String Model;
    private String SeatType;
    private String NoOfSeats;

    public PlaneSeats(){}

    public void makeDummy()
    {

        setMake("Make");
        setModel("Model");
        setSeatType("SeatType");
        setNoOfSeats("NoOfSeats");

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

    public String getSeatType()
    {
        return SeatType;
    }

    public void setSeatType(String seatType)
    {
        SeatType = seatType;
    }

    public String getNoOfSeats()
    {
        return NoOfSeats;
    }

    public void setNoOfSeats(String noOfSeats)
    {
        NoOfSeats = noOfSeats;
    }

    public String getTable()
    {
        return "PlaneSeats ";
    }
}
