/**
Class: CSE3320
Semester: Spring 2016
Student Name: Emmanuel Lennix
Student ID: 1001104990
Assignment: project #4

 */
public class Reservation
{
    private String PassID;
    private String FLNO;
    private String FDate;
    private String FromA;
    private String ToA;
    private String SeatClass;
    private String DateBooked;
    private String DateCancelled;

    public Reservation(){}

    public void makeDummy()
    {

        setPassID("PassID");
        setFLNO("FLNO");
        setFDate("FDate");
        setFromA("FromA");
        setToA("ToA");
        setSeatClass("SeatClass");
        setDateBooked("DateBooked");
        setDateCancelled("DateCancelled");

    }

    public String getPassID()
    {
        return PassID;
    }

    public void setPassID(String passID)
    {
        PassID = passID;
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

    public String getFromA()
    {
        return FromA;
    }

    public void setFromA(String fromA)
    {
        FromA = fromA;
    }

    public String getToA()
    {
        return ToA;
    }

    public void setToA(String toA)
    {
        ToA = toA;
    }

    public String getSeatClass()
    {
        return SeatClass;
    }

    public void setSeatClass(String seatClass)
    {
        SeatClass = seatClass;
    }

    public String getDateBooked()
    {
        return DateBooked;
    }

    public void setDateBooked(String dateBooked)
    {
        DateBooked = dateBooked;
    }

    public String getDateCancelled()
    {
        return DateCancelled;
    }

    public void setDateCancelled(String dateCancelled)
    {
        DateCancelled = dateCancelled;
    }

    public String getTable()
    {
        return "Reservation ";

    }

}
