package week4.day3oops;

public class Students {
	public void getStudents(int id) {
		// TODO Auto-generated method stub
      System.out.println(id);
	}
	public void getStudents(int id,String name) {
		// TODO Auto-generated method stub
      System.out.println(id+"   "+name);
	}
	public void getStudents(String email,long mobileNumber) {
		// TODO Auto-generated method stub
       System.out.println(email+"   "+mobileNumber);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students get=new Students ();
		get.getStudents(101);
		get.getStudents(101,"Nagendran" );
        get.getStudents("ngn@gmail.com", 9994282053l);
	}

}
