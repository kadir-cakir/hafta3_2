package hwork3;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId(1);
		user1.setEmail("kadircakir541@gmail.com");

        User user2 = new User();
		user2.setId(2);
		user2.setEmail("kadircakir@gmail.com");
		
		StudentManager studentManager = new StudentManager();
        studentManager.add(user1);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(user2);
	}

}
