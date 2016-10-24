import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kolling and David Barnes
 * @version 2008.03.30
 */
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    //private int credits;
    // the gender of the student 
    private String gender;
    // the date of birth of the student, in the format of ddmmyyyy
    private String DOB;
    // the email of the student
    private String email;
    // the start year of the student;
    private String startYr;
    // the finish year of the student;
    private String finishYr;
    
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID, String studentGender, String birthday)
    {
        name = fullName;
        id = studentID;
        gender = studentGender; // needs handling
        DOB = birthday;
        //credits = 0;
    }

    // add the email for the student
    public void addEmail(String emailAddr)
    {
        email = emailAddr;
    }
    // add the start year for the student
    public void addStartYr(String year)
    {
        startYr = year;
    }    
    // add the finish year for the student 
    public void addFinishYr(String year)
    {
        finishYr = year;
    }        
    
    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }
    
    /**
     * Return the gender of this student.
     */
    public String getStudentGender()
    {
        return gender;
    }
    
    /**
     * Return the DOB of this student.
     */
    public String getStudentDOB()
    {
        return DOB;
    }
    
    /**
     * Return the email of this student.
     */
    public String getStudentEmail()
    {
        return email;
    }

    /**
     * Return the start year of this student.
     */
    public String getStudentStartYr()
    {
        return startYr;
    }
    
    /**
     * Return the end year of this student.
     */
    public String getStudentEndYr()
    {
        return finishYr;
    }
    
    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Print the student's info to the output terminal.
     */
    public void print()
    {
        //System.out.println(name + " (" + id + ")");
        System.out.println("Basic Info: " + name + " (" + id + "), " + gender + ", " + DOB);
        
    }
}
