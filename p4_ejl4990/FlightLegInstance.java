/*
Class: CSE3320
Semester: Spring 2016
Student Name: Emmanuel Lennix
Student ID: 1001104990
Assignment: project #4
*/
public class FlightLegInstance
{
    private String Seq;
    private String FLNO;
    private String FDate;
    private String ActDept;
    private String ActArr;
    private String Pilot;

    public FlightLegInstance(){}

    public void makeDummy()
    {

        setSeq("Seq");
        setFLNO("FLNO");
        setFDate("FDate");
        setActDept("ActDept");
        setActArr("ActArr");
        setPilot("Pilot");

    }

    public String getSeq()
    {
        return Seq;
    }

    public void setSeq(String seq)
    {
        Seq = seq;
    }

    public String getFLNO() {
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

    public String getActDept()
    {
        return ActDept;
    }

    public void setActDept(String actDept)
    {
        ActDept = actDept;
    }

    public String getActArr()
    {
        return ActArr;
    }

    public void setActArr(String actArr)
    {
        ActArr = actArr;
    }

    public String getPilot()
    {
        return Pilot;
    }

    public void setPilot(String pilot)
    {
        Pilot = pilot;
    }


    public String getTable()
    {
        return "FlightLegInstance ";
    }

}
