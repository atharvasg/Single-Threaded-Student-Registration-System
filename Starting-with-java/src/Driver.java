import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
/**
 * @author Atharva
 *
 */
public class Driver 
{
	/**
	 * @param args
	 * @return Nothing
	 */
	public static void main(String[] args) 
	{
		BufferedReader bufferedReader;
		String[] words=new String[4];
		Student student;
		ArrayList<Student> students;
		CourseAllocations allocations;
		String line=new String();
		try 
	    {
			if(args.length>2)
			{
				throw new InvalidParameterException(); 
			}
	       	bufferedReader = new BufferedReader(new FileReader(args[0]/*"Resources/Input.txt"*/));
	    	students=new ArrayList<Student>();
	    	line=bufferedReader.readLine();
	    	while(line!=null )
	    	{
	    		student=new Student();
	    		words=line.split(" ");
	    		student.Name=words[0];
	    		student.setPreference_A(Integer.parseInt(words[1]));
	    		student.setPreference_B(Integer.parseInt(words[2]));
	    		student.setPreference_C(Integer.parseInt(words[3]));
	    		student.setPreference_D(Integer.parseInt(words[4]));
	    		students.add(student);
	            line=bufferedReader.readLine(); 
	    	}
	      allocations=new CourseAllocations(students,args[1]);
	      allocations.allocatePreference();
	    } catch (IOException e) 
	    {
			System.out.println("File Not Found! Program will terminate.");
			System.exit(0);
	    }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error while reading input file or command line arguments! Program will terminate.");
			System.exit(0);
		}
		catch(InvalidParameterException r)
		{
			System.out.println("Number of parameters are less or more than expected value! Program will terminate.");
			System.exit(0);
		}
	}
	@Override
	public String toString()
	{
		return "";
	}
}
