import java.util.Date;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.lang.Exception;
import java.text.ParseException;
import java.time.*;

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
    // the postcode of the student;
    private String postcode;
    
    public List<String> modules;
    public List<String> programme;
    
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
        modules = new ArrayList<String>();
        
    }

    // add the email for the student
    public void addEmail(String emailAddr)
    {
        
        //if (isValidEmailAddress(emailAddr) == true)
            email = emailAddr;
        //else;
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
    // add postcode for the student 
    public void addPostcode(String addr)
    {
        postcode = addr;
    }  
    
    public String getPostcode()
    {
        return postcode;
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
    public void setName(String newName)
    {
        name = newName;
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
    
    public LocalDate String2LocalDate()
    {
        String dd;
        String mm;
        String yyyy;
        String delims = "/";
        String[] tokens = DOB.split(delims);
        dd = tokens[0];
        mm = tokens[1];
        yyyy = tokens[2];
        //System.out.println(dd + mm + yyyy);
        LocalDate birthday = LocalDate.of(Integer.parseInt(yyyy), 
                                          Integer.parseInt(mm), Integer.parseInt(dd));
        return birthday;
    }
    
    /*    
    public Date String2Date()
    {
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy"); 
        Date startDate = null;
        try {
            startDate = df.parse(DOB);
            //String newDateString = df.format(startDate); 
            
            
        } 
        catch (ParseException e) {
            e.printStackTrace();
        }

        return startDate;


    }
    */   
   
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
    
    public void modulesEnrolled()
    {
        if (modules.size() <= 0)
            System.out.println("No module enrolled!");
        else
        {
            for (int j = 0; j < modules.size(); j++)
            {
                System.out.println(modules.get(j));
            }    
        }

    }
    
    /**
     * Print the student's info to the output terminal.
     */
    public void printBasicInfo()
    {
        //System.out.println(name + " (" + id + ")");
        System.out.println("Basic Info: " + name + " (" + id + "), " + gender + ", " + DOB);
        
    }
}
