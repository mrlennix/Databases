
import java.sql.*;
import java.util.ArrayList;

/**
 Class: CSE3320
Semester: Spring 2016
Student Name: Emmanuel Lennix
Student ID: 1001104990
Assignment: project #4

 */
public class DBmanager
{
    private Connection connection;
    private Statement statement;

    private static final String url = "jdbc:mysql://localhost:3306/ejl4990";
    private static final String select = "SELECT ";
    private static final String from = "FROM ";
    private static final String value = "VALUES (";
    private static final String endpar = ");";
    private static final String colon = ";";
    private static final String all = "* ";
    private static final String comma = ", ";
    private static final String insert = "INSERT INTO ";
    private static final String delete = "DELETE ";
    private static final String where = "WHERE ";
    private static final String update = "UPDATE ";
    private static final String set = "SET ";

    public DBmanager() {}


    public Connection getConnection()
    {
        return connection;
    }

    public void setConnection(String pass)
    {

        if(connection!=null)return;

        Connection con=null;

        try
        {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,"ejl4990",pass);
            statement =con.createStatement();
        }

        catch (SQLException e)
        {
            System.err.println("Database Connection is not set because of password!");
        }

        catch (ClassNotFoundException e)
        {
            System.err.println("Database driver cannot connect!" );
        }

        this.connection = con;
    }
    //checks to see if FlightLegInstance exist in flightLeg
    public boolean FlightLegExists(FlightLegInstance leg)
    {
        FlightLeg dummy = new FlightLeg();
        dummy.makeDummy();
        boolean state = false;
        String query = select + all + from +dummy.getTable()+colon;

        try
        {
            ResultSet result = statement.executeQuery(query);

            while(result.next())
            {

                if ( leg.getFLNO().equals( result.getObject( dummy.getFLNO() ).toString() ) && leg.getSeq().equals( result.getObject( dummy.getSeq() ).toString() ) )
                {
                    state= true;
                    break;
                }

            }


        } catch (SQLException e) {System.err.println("Query didn't work!");}

    return state;
    }
    /*
        This method only puts food into the database
     */
    public void putFlightLegInstance(FlightLegInstance leg)
    {
        FlightLegInstance dummy = new FlightLegInstance();
        dummy.makeDummy();
        if(leg.getActArr()!=null)leg.setActArr("'"+leg.getActArr()+"'");
        if(leg.getActDept()!=null)leg.setActDept("'"+leg.getActDept()+"'");
        //puts the data in the database
        String query = insert+dummy.getTable()+value+leg.getFLNO()+comma+leg.getSeq()+comma+"'"+leg.getFDate()+"'"+
                comma+leg.getActDept()+comma+leg.getActArr()+comma+leg.getPilot()+endpar;
        System.out.println(query);
        try {
            statement.executeUpdate(query);
            System.err.println("The data was placed inside the table!");
        } catch (SQLException e) {
            System.err.println("Data not in the correct format! Data was not inserted!");
        }


    }

    //put FlightLegInstance inside FlightInstance
    public void putFlightInstance(FlightLegInstance leg)
    {
        FlightInstance dummy = new FlightInstance();
        dummy.makeDummy();

        String query = insert+ dummy.getTable()+value+leg.getFLNO()+comma+"'"+leg.getFDate()+"'"+endpar;

        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.err.println("Didn't put FLNO and FDate into FlightInstance");
        }


    }

    /*
        This method only checks to see if the pilot exists.if it does then it returns true
     */
    public boolean PilotExists(FlightLegInstance leg)

    {

        boolean state = false;
        if(leg.getPilot() == null)return state;
        Pilot dummy = new Pilot();
        dummy.makeDummy();
        //query
        String query = select+all+from+dummy.getTable()+colon;
        try
        {
            ResultSet result = statement.executeQuery(query);

            while(result.next())
            {
                //if data is the id is equal then it returns true
                if( leg.getPilot().equals( result.getObject( dummy.getID() ).toString() )  )
                {

                    state = true;
                    break;
                }
            }

        } catch (SQLException e)
        {
            System.out.println("Invalid pilot ID");
        }

        return state;
    }
    //prints all the pilots in pilot
    public void printAllpilots()
    {
        Pilot dummy = new Pilot();
        dummy.makeDummy();
        String query = select+all+from+dummy.getTable()+colon;

        try
        {
            ResultSet result = statement.executeQuery(query);
            System.out.println("ID: "+"Name:");
            while(result.next())
            {
                System.out.println(result.getObject(dummy.getID())+" "+result.getObject(dummy.getName()));
            }
        } catch (SQLException e) {}
    }


    //checks to see if date and flight number exists in the flight leg
    public boolean FlightInstanceExists(FlightLegInstance leg)
    {
        boolean state = false;
        if(leg == null) return state;

        FlightInstance dummy = new FlightInstance();
        dummy.makeDummy();
        String query = select+all+from+dummy.getTable()+colon;
        try {
            ResultSet result = statement.executeQuery(query);

            while (result.next())
            {
                if( leg.getFLNO().equals( result.getObject(dummy.getFLNO() ) ) && leg.getFDate().equals( dummy.getFDate() ) )return true;
            }

        } catch (SQLException e) {}


        return state;
    }

    public boolean actualTime(FlightLegInstance leg)
    {
        FlightLegInstance dummy = new FlightLegInstance();
        dummy.makeDummy();
        String time=null;
        boolean state = false;
        String query = select + all + from +dummy.getTable()+where+dummy.getFLNO()+"= "+leg.getFLNO()+" AND Seq=1"+colon;
        System.out.println(query);



        try {
            ResultSet result = statement.executeQuery(query);



            while (result.next())
            {
                String id = result.getObject( dummy.getPilot() ).toString();
                if(id == null)continue;
                if( leg.getPilot().equals( id ) )
                {
                    leg.setActDept(result.getObject(dummy.getActDept()).toString());
                    return true;
                }
            }

        } catch (SQLException e) {
            System.err.println("No previous sequence!");
        }
        System.err.println("No previous sequence!");


        return state;
    }

    public void updateFlightLegInstance(FlightLegInstance leg)
    {
        if(leg.getActArr()==null)return;
        leg.setActArr( "'"+leg.getActArr()+"'" );
        leg.setFDate("'"+leg.getFDate()+"'");
        FlightLegInstance dummy = new FlightLegInstance();
        dummy.makeDummy();

        String query =
                update + dummy.getTable()+
                set+dummy.getActArr()+"="+leg.getActArr()+" "+
                where+ dummy.getFLNO()+"="+leg.getFLNO()+" AND "+dummy.getSeq()+"="+leg.getSeq()+" AND "+dummy.getFDate()+"="+leg.getFDate()+ colon;

        try
        {
            System.err.println(query);
            statement.executeUpdate(query);
            System.out.println("UPDATED THE TUPLE!");
        } catch (SQLException e) {
            System.out.println("Didn't update the time!");
        }


    }

    public void getDeptTime(FlightLegInstance leg)
    {
        FlightLegInstance dummy = new FlightLegInstance();
        dummy.makeDummy();
        String query = "SELECT "  + dummy.getActDept() +" "+from+dummy.getTable()+where +dummy.getFLNO()+"="+leg.getFLNO()+" AND "+dummy.getSeq()+"="+leg.getSeq()+" AND "+dummy.getFDate()+"='"+leg.getFDate()+"'"+ colon;

        try {
            ResultSet result = statement.executeQuery(query);
            while(result.next())
            {
                leg.setActDept( result.getObject(dummy.getActDept()).toString() );
                break;
            }
        } catch (SQLException e)
        {
        }

    }



}
