package OOP.SingleResponsibilityDemo.Solution;

import OOP.SingleResponsibilityDemo.Problem.Role;
import OOP.SingleResponsibilityDemo.Problem.User;

public class SecurityService {
    public boolean hasAccess(User user){
        if (user.getRole() == Role.ADMIN){
            return true;
        }else{
            return false;
        }
    }


}
