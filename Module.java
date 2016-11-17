import java.util.*;
/**
 * Write a description of class Module here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Module
{
    // instance variables - replace the example below with your own
    public String moduleName;
    public List<Student> students;

    /**
     * Constructor for objects of class Module
     * Create a new Module with a module name
     */
    public Module(String name)
    {
        moduleName = name;
        students = new ArrayList<Student>();
    }
    
    public void setModuleName (String newName)
    {
        moduleName = newName;
    }
    
    public String getName()
    {
        return moduleName;
    }
    
        public int numberOfStudents()
    {
        return students.size();
    }
    
    public void addStudent(Student student)
    {
        // add student iff student not in list already
        if (students.contains(student) == false)
        {
            students.add(student);
            student.modules.add(moduleName);
        }
        else
            System.out.println("Student already added!");
    }
    
    public void removeStudent(Student student)
    {
        if (students.contains(student) == true)
        {
            students.remove(student);
            student.modules.remove(moduleName);
        }
        else
            System.out.println("Student not found!");
    }
    
    public void printStudens()
    {
        for (int j = 0; j < students.size(); j++)
        {
            System.out.println(students.get(j).getName());
        }
    }
    
//    public int numberOfStudents()
//    {
//        return students.size();
//    }

}
