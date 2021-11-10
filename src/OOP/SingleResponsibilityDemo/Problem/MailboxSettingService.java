package OOP.SingleResponsibilityDemo.Problem;

public class MailboxSettingService {
    public void changeSecondaryEmail(User user, String newSecondayEmail){
        if(hasAccess(user)){
            user.setSecondaryEmail(newSecondayEmail);
        }
    }
    public boolean hasAccess(User user){
        if (user.getRole() == Role.ADMIN){
            return true;
        }else{
            return false;
        }
    }
}
