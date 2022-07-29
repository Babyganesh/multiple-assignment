package students.assignment4;

public class Student {
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println( id);

	}
	public void getStudentInfo( String name) {
		// TODO Auto-generated method stub
		System.out.println(name);

	}
	public void getStudentInfo(String email, long phonenumber) {
		// TODO Auto-generated method stub
		System.out.println(email);
		System.out.println(phonenumber);

	}
	public static void main(String[] args) {
		Student obj =new Student();
		obj.getStudentInfo(7237);
		obj.getStudentInfo("baby");
		obj.getStudentInfo("babyganeshece@gmail.com,9488732119");
		
		


	}

}
