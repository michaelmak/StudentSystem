import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
//import java.util.Calendar;

/**
 * Write a description of class StudentRecordSystem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * +=================================== ATTNENTION ===================================+
 * |    YOU NEED TO ADD STUDENTS AND PROGRAMMES INTO THE SYSTEM MANUALLY              |
 * +==================================================================================+
 */

public class StudentRecordSystem
{
    private List<Student> students;
    private List<Programme> programmes;
    private List<Student> olderList;
    private List<Student> youngerList;
    private int currentYr;
    
    
    /**
     * Constructor for objects of class StudentRecordSystem
     */
    public StudentRecordSystem()
    {
        students = new ArrayList<Student>();
        programmes = new ArrayList<Programme>();
    }
    
//
// +=================================== ATTNENTION ===================================+
// |    YOU NEED TO ADD STUDENTS AND PROGRAMMES INTO THE SYSTEM MANUALLY              |
// +==================================================================================+
//
    public void addStudent(Student student)
    {
        // add student iff student not in list already
        if (students.contains(student) == false)
        {
            students.add(student);
        }
        else
            System.out.println("Student already added!");
    }
    
    public void addProgramme(Programme programme)
    {
        // add student iff student not in list already
        if (programmes.contains(programme) == false)
        {
            programmes.add(programme);
        }
        else
            System.out.println("programme already added!");
    }

//    /**
//     * Add a student to this LabClass.
//     */
//    public void enrollStudent(Student newStudent)
//  {
//        students.add(newStudent);
//   }
    
//    /**
//     * Return the number of students currently enrolled in this LabClass.
//     */
//    public int numberOfStudents()
//    {
//        return students.size();
//    }

    /**
     * Add a student to a module
     */    
    public void enrollStudent2Module(Student studentName, Module moduleName)
    {
        moduleName.addStudent(studentName);
    }
    
    /**
     * Remove a student from a module
     */    
    public void removeStudentFromModule(Student studentName, Module moduleName)
    {
        moduleName.removeStudent(studentName);
    }
    
    public void addModule2Programme(Module moduleName, Programme programmeName)
    {
        programmeName.addModule(moduleName);
    }
    
    /**
     * Remove a student from a module
     */    
    public void removeModuleFromProgramme(Module moduleName, Programme programmeName)
    {
        programmeName.removeModule(moduleName);
    }
   
    // A method to return the modules that are shared between two programmes.
    private List<Module> temp;
    public void returnSharesModules(Programme programme1, Programme programme2)
    {
        //temp = new ArrayList<Module>(); 
        temp = programme1.modules;
        temp.retainAll(programme2.modules);
        System.out.println("Programmes " + programme1.getName() + " and " 
                            + programme2.getName() + " shared the following modules: ");
                            
        for (int j = 0; j < temp.size(); j++)
        {
            System.out.println(temp.get(j).getName());
        }    
        
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
     * Return the current date
     */  
    public LocalDate getCurrentLocalDate()
    {
        LocalDate today = LocalDate.now();
        return today;
    }
    
    /**
     * Return a student's age based on current date
     */    
    public long getStudentAge(Student student)
    {
        LocalDate today = getCurrentLocalDate();
        LocalDate birthday = student.String2LocalDate();
        long age = ChronoUnit.YEARS.between(birthday, today);
        return age;
    }
    
    /**
     * Return names of students who are older than the given age
     */    
    public void getOlderStudents (long age)
    {
        olderList = new ArrayList<Student>();
        for (int i = 0; i < students.size(); i++)
        {
            if (getStudentAge(students.get(i)) >= age)
                olderList.add(students.get(i));     
        }
        
        System.out.println("+------older than input age--------");
        for (int j = 0; j < olderList.size(); j++)
        {
            System.out.println("|" + olderList.get(j).getName());
        }
        System.out.println("+----------------------------------");

    }
    
    /**
     * Return names of students who are younger than the given age
     */        
    public void getYoungerStudents (long age)
    {
        youngerList = new ArrayList<Student>();
        for (int i = 0; i < students.size(); i++)
        {
            if (getStudentAge(students.get(i)) < age)
                youngerList.add(students.get(i));     
        }
        
        System.out.println("+-----younger than input age-------");
        for (int j = 0; j < youngerList.size(); j++)
        {
            System.out.println("|" + youngerList.get(j).getName());
        }
        System.out.println("+----------------------------------");
      
    }  
    
    // A method to return all the male/female students living in a given postcode.
    public void getStudentsFromPostcode(String postcode)
    {
        System.out.println("+---- students in this postcode -----");
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getPostcode() == postcode)
                System.out.println(students.get(i).getName()); 
            else;
        }    
        System.out.println("+------------------------------------");
    }
    
    // A method to return a programme that has the highest number of modules on it.
    // programme.numberOfModules()
    private int largest = 0;
    private Programme result;
    public void programmeMostModules()
    {
        for (int i = 0; i < programmes.size(); i++)
        {
            if (largest == 0) 
            {
                largest = programmes.get(i).numberOfModules();
                result = programmes.get(i);
            }
           
            else if (largest < programmes.get(i).numberOfModules())
            {
                largest = programmes.get(i).numberOfModules();
                result = programmes.get(i);
            }                
            else;     
        }    
        System.out.println("The programme with the highest number of modules on it is: " 
                            + result.getName());
    }
       
//    /**
//     * Print out a class list with other LabClass details to the standard
//     * terminal.
//     */
//    public void printList()
//    {
//        for(Student student : students) {
//            student.print();
//        }
//        System.out.println("Number of students: " + numberOfStudents());
//    }
}
