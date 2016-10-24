import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.util.Calendar;

/**
 * Write a description of class StudentRecordSystem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentRecordSystem
{
    private List<Student> students;
    private int currentYr;
    
    /**
     * Constructor for objects of class StudentRecordSystem
     */
    public StudentRecordSystem(int currentYear)
    {
        currentYr = currentYear;
        students = new ArrayList<Student>();
    }

    /**
     * Add a student to this LabClass.
     */
    public void enrollStudent(Student newStudent)
    {
            students.add(newStudent);
    }
    
    /**
     * Return the number of students currently enrolled in this LabClass.
     */
    public int numberOfStudents()
    {
        return students.size();
    }
    
    /**
     * Return the current date 
     */
    public void getCurrentDate()
    {
	   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	   //get current date time with Date()
	   Date date = new Date();
	   System.out.println(dateFormat.format(date));

	   //get current date time with Calendar()
	   //Calendar cal = Calendar.getInstance();
	   //System.out.println(dateFormat.format(cal.getTime()));     
    }
   
    
    /**
     * Print out a class list with other LabClass details to the standard
     * terminal.
     */
    public void printList()
    {

        for(Student student : students) {
            student.print();
        }
        System.out.println("Number of students: " + numberOfStudents());
    }
}
