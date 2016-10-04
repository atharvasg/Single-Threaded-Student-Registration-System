import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

/**
 * @author Atharva
 *
 */
public class CourseAllocations 
{
	BufferedWriter writer;
	File file;
	FileWriter fwriter;
	Student student=new Student();	
  	ArrayList<Student> students;
  	ArrayList<String> participantA=new ArrayList<String>();
  	ArrayList<String> participantB=new ArrayList<String>();
  	ArrayList<String> participantC=new ArrayList<String>();
  	ArrayList<String> participantD=new ArrayList<String>();
  	Subjects subject;
  	String fileName;
  	StringBuilder output=new StringBuilder("");
  	int totalPreferenceScore=0;
  	float averagePreferenceScore=0;
  	public CourseAllocations(ArrayList<Student> students,String outputFileName)
  	{
	  this.students=students;
	  fileName=outputFileName;
  	}
  	/**
  	 * @return Nothing
  	 *
  	 */

  	public void allocatePreference()
  	{
  		try
  		{
		  	 for(int iterator=1;iterator<5;iterator++)
		  	 {
			  subject=new SubjectA();
			  participantA=subject.allocateCourse(iterator,students,participantA);
			  subject=new SubjectB();
			  participantB=subject.allocateCourse(iterator,students,participantB);
			  subject=new SubjectC();
			  participantC=subject.allocateCourse(iterator,students,participantC);
			  subject=new SubjectD();
			  participantD=subject.allocateCourse(iterator,students,participantD);
		  	 }
			  printResults();
  		}
  		catch(Exception e)
  		{
  			System.out.println("Problem while allocating preference. Program will terminate");
  			System.exit(0);
  		}
  	}
  	/**
  	 * @return Nothing
  	 *
  	 */

  	private void printResults()
  	{
  	  file=new File(fileName/*"Resources/output.txt"*/);
  	  
  	  try
  	  {
  		  if(!file.exists())
  		  {
  			  file.createNewFile();
  		  }
  		  fwriter=new FileWriter(file);
  		  writer=new BufferedWriter(fwriter);
		  for(int iterator=0;iterator<12;iterator++)
		  {
			  student=students.get(iterator);
			  output.append(student.getName()+" ");
			  if(participantA.contains(student.getName()))
			  {
				  output.append('A'+" ");
			  }
			  if(participantB.contains(student.getName()))
			  {
				  output.append('B'+" ");
			  }
			  if(participantC.contains(student.getName()))
			  {
				  output.append('C'+" ");
			  }
			  if(participantD.contains(student.getName()))
			  {
				  output.append('D'+" ");
			  }
			  output.append(Integer.toString(student.getPreferenceScore())+'\n');
			  totalPreferenceScore+=student.getPreferenceScore();
			  writer.write(output.toString());
			  output.setLength(0);
		  }
  	 
		  averagePreferenceScore=calculateAveragePreferenceScore(totalPreferenceScore);   
		  writer.write("Average preference score is:"+ averagePreferenceScore);
		  writer.close();
		  System.out.println("Successfully Allocated Subjects!");
  	  }
  	  catch(IOException e)
  	  {
  		  System.out.println("Error writing output file! program will terminate");
  		  System.exit(0);
  	  }
  	}
  	/**
  	 * @return float Average Preference Score.
  	 *
  	 */

  	private float calculateAveragePreferenceScore(int score)
  	{	
  		try
  		{
	  		float averageScore;
	  		averageScore=(float)score/students.size();
	  		return averageScore;
  		}
  		catch(Exception e)
  		{
  			System.out.println("Error while calculating the preference score! Program will terminate.");
  			System.exit(0);
  		}
  		return 0;
  	}
  	/**
  	 * @return String object in plain string.
  	 * 
  	 */
  	@Override
	public String toString()
	{
		return "Student Record: Name:"+student.getName()+"\nAllocated Courses:"+student.getNoOfAllocatedCourses()+"\nPreference A:"+student.getPreference_A()+"\nPreference B:"+student.getPreference_B()+"\nPreference C:"+student.getPreference_C()+"\nPreference D:"+student.getPreference_D()+"\nPreserence Score:"+student.getPreferenceScore();
	}

}
