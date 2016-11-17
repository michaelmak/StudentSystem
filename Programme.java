import java.util.*;
/**
 * Write a description of class Programme here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Programme
{
    public List<Module> modules;
    
    public String programmeName;
    private int tuitionFee;

    /**
     * Constructor for objects of class Programme
     */
    public Programme(String name)
    {
        programmeName = name; 
        modules = new ArrayList<Module>();
    }
    
    public void setProgrammeName(String newName)
    {
        programmeName = newName;
    }
    
    public String getName()
    {
        return programmeName;
    }    
    
    public void setTuitionFee(int fee)
    {
        tuitionFee = fee;
    }    
    
    public int returnTuitionFee()
    {
        return tuitionFee;
    }

    public void addModule(Module module)
    {
        // add student iff student not in list already
        if (modules.contains(module) == false)
        {
            modules.add(module);
            //student.programmes.add(programmeName);
        }
        else
            System.out.println("Module already added!");
    }
    
    public void removeModule(Module module)
    {
        if (modules.contains(module) == true)
        {
            modules.remove(module);
            //student.programmes.remove(programmeName);
        }
        
        else
            System.out.println("Module not found!");
    }
    
    public int numberOfModules()
    {
        return modules.size();
    }
    
    // A method to show all the modules with the number of students studying each module.
    public void printModules()
    {
        for (int j = 0; j < modules.size(); j++)
        {
            System.out.println("The number of students for module " + 
                                modules.get(j).getName() + " is: " +
                                modules.get(j).numberOfStudents());
        }
    }
    
    //A method to return a list of modules with all students added to each module.
    public void printModulesStudents()
    {
        for (int j = 0; j < modules.size(); j++)
        {
            System.out.println(modules.get(j).getName() + ": ");
            for (int i = 0; i < modules.get(j).students.size(); i++)
            {
                System.out.println(modules.get(j).students.get(i).getName());    
            }
        }
    }    

}
