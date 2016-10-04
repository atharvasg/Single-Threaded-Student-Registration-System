import java.util.ArrayList;

/**
 * @author Atharva
 *
 */
public class SubjectD implements Subjects//extends Subjects 
{
	public static int AllocatedSeats=0;
	//public ArrayList<String> courseParticipants=new ArrayList<String>();
	Student student=new Student();
	/**
  	 * @return {@link ArrayList} list of students allocated this course.
  	 * 
  	 */
	public ArrayList<String> allocateCourse(int priority,ArrayList<Student> students,ArrayList<String> courseParticipants)
	{
		try
		{
			for(int counter=0;counter<students.size();counter++)
			{
				   student=students.get(counter);
				   if(student.getPreference_D()==priority && AllocatedSeats<10 && student.getNoOfAllocatedCourses()<3)
				   {
					   courseParticipants.add(student.getName());
					   AllocatedSeats++;
					   student.setPreferenceScore(student.getPreferenceScore()+student.getPreference_D());
					   student.setNoOfAllocatedCourses(student.getNoOfAllocatedCourses()+1);
				   }
				   if(AllocatedSeats>=10)
				   {
					   break;
				   }
			}		
			return courseParticipants;
		}
		catch(Exception e)
		{
			System.out.println("Problem while Allocating Subject D! Program will terminate");
			courseParticipants.clear();
			System.exit(0);	
		}
		return courseParticipants;
	}
	/**
  	 * @return String object in plain string.
  	 * 
  	 */
	@Override
	public String toString()
	{
		return "FilledSeats:"+AllocatedSeats;
	}
}
