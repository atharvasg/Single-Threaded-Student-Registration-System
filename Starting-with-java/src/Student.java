/**
 * @author Atharva
 *
 */
public class Student 
{
	int preference_A;
	int preference_B;
	int preference_C;
	int preference_D;
	int noOfAllocatedCourses;
	int preferenceScore;
	
	String Name;
	public Student()
	{
		preference_A=0;
		preference_B=0;
		preference_C=0;
		preference_D=0;
		preferenceScore=0;
		noOfAllocatedCourses=0;
	}
	public int getPreference_A() {
		return preference_A;
	}
	public void setPreference_A(int preference_A) {
		this.preference_A = preference_A;
	}
	public int getPreference_B() {
		return preference_B;
	}
	public void setPreference_B(int preference_B) {
		this.preference_B = preference_B;
	}
	public int getPreference_C() {
		return preference_C;
	}
	public void setPreference_C(int preference_C) {
		this.preference_C = preference_C;
	}
	public int getPreference_D() {
		return preference_D;
	}
	public void setPreference_D(int preference_D) {
		this.preference_D = preference_D;
	}
	public int getPreferenceScore() {
		return preferenceScore;
	}
	public void setPreferenceScore(int preferenceScore) {
		this.preferenceScore = preferenceScore;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNoOfAllocatedCourses() {
		return noOfAllocatedCourses;
	}
	public void setNoOfAllocatedCourses(int noOfAllocatedCourses) {
		this.noOfAllocatedCourses = noOfAllocatedCourses;
	}
}
