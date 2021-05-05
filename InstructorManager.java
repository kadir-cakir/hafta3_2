package hwork3;

public class InstructorManager extends UserManager {
	@Override
    public void add(User user) {
        System.out.println("Eklenen Instructor id: " + user.getId());
    }
}
