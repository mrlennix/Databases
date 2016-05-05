/*
Class: CSE3320
Semester: Spring 2016
Student Name: Emmanuel Lennix
Student ID: 1001104990
Assignment: project #4

*/
public class FlightLeg
{
    private String FLNO;
    private String Seq;
    private String FromA;
    private String ToA;
    private String DeptTime;
    private String Plane;

    public FlightLeg(){}

    public void makeDummy()
    {

        setFLNO("FLNO");
        setSeq("Seq");
        setFromA("FromA");

    }

    public String getFLNO()
    {
        return FLNO;
    }

    public void setFLNO(String FLNO)
    {
        this.FLNO = FLNO;
    }

    public String getSeq()
    {
        return Seq;
    }

    public void setSeq(String seq)
    {
        Seq = seq;
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

    public String getDeptTime()
    {
        return DeptTime;
    }

    public void setDeptTime(String deptTime)
    {
        DeptTime = deptTime;
    }

    public String getPlane()
    {
        return Plane;
    }

    public void setPlane(String plane)
    {
        Plane = plane;
    }

    public String getTable()
    {
        return "FlightLeg ";
    }
}

