package hwork3;

public class StudentManager extends UserManager {
	@Override
    public void add(User user) {
        System.out.println("Eklenen Student id: " + user.getId());
    }
}
