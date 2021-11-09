package OOP.Polymorphism;

public class AdminUser extends User {
    @Override
    public void validateAccessRight() {
        System.out.println("I am admin User. I have all the rights ");
    }
}
