package OOP.Polymorphism;

public class Demo {
    public static void main(String[] args) {
        User user = new User();
        ContentUser contentuser = new ContentUser();
        AdminUser admin = new AdminUser();
        user.validateAccessRight();
        contentuser.validateAccessRight();
        admin.validateAccessRight();
    }




}
