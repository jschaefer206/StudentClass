
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private String firstName;
	private String lastName;
	private int studentID;
	
	public Student()
	{
		
	}
	
	public Student(String firstName, String lastName, int studentID)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public int getStudentID()
	{
		return studentID;
	}
	public void setStudentID(int studentID)
	{
		this.studentID = studentID;
	}

}
