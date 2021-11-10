package OOP.SingleResponsibilityDemo.Solution;

import OOP.SingleResponsibilityDemo.Problem.User;

public class MailboxSettingService {
    private SecurityService securityService;
    {
        securityService = new SecurityService();

    }
    public void changeSecondaryEmail(User user, String newSecondayEmail){
        if(securityService.hasAccess(user)){
            user.setSecondaryEmail(newSecondayEmail);
        }
    }
}
