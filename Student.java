package week4.day3oops;

public class Student extends Department {
	public void StudentName() {
		// TODO Auto-generated method stub
      System.out.println("Nagendran");
	}
   public void StudentDept() {
	// TODO Auto-generated method stub
      System.out.println("b.com");
}
   public void StudentId() {
	// TODO Auto-generated method stub
     System.out.println("1183078");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud=new Student();
		stud.CollegeName();
		stud.CollegeCode();
		stud.CollegeRank();
		stud.DepartmentName();
		stud.StudentName();
		stud.StudentDept();
		stud.StudentId();

	}

}
