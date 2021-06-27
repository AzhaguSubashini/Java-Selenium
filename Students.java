package week3.assignment;

public class Students {
	public void getStudentInfo(int id) {
System.out.println("Student ID" + id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student details" + id + ","+ name);
			}
	public void getStudentInfo(String email, int phonenum) {
		System.out.println("Student " + email + ","+ phonenum);
			}

	public static void main(String[] args) {
		Students stu2 = new Students();
		stu2.getStudentInfo(5);
		stu2.getStudentInfo(5, "Azhagu Subashini");
stu2.getStudentInfo("azhagucse", 91);
	}

}
