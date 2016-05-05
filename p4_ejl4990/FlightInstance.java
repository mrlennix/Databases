/**
 Class: CSE3320
Semester: Spring 2016
Student Name: Emmanuel Lennix
Student ID: 1001104990
Assignment: project #4

 */
public class FlightInstance
{
    private String FLNO;
    private String FDate;

    public FlightInstance(){}

    public void makeDummy()
    {
        setFLNO("FLNO");
        setFDate("FDate");
    }

    public String getFLNO()
    {
        return FLNO;
    }

    public void setFLNO(String FLNO)
    {
        this.FLNO = FLNO;
    }

    public String getFDate()
    {
        return FDate;
    }

    public void setFDate(String FDate)
    {
        this.FDate = FDate;
    }

    public String getTable()
    {
        return "FlightInstance ";
    }
}
