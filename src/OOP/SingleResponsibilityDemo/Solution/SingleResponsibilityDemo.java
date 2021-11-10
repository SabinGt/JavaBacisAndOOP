package OOP.SingleResponsibilityDemo.Solution;

import OOP.SingleResponsibilityDemo.Problem.MailboxSettingService;
import OOP.SingleResponsibilityDemo.Problem.User;

public class SingleResponsibilityDemo {
    public static void main(String[] args) {
        OOP.SingleResponsibilityDemo.Problem.MailboxSettingService settingService = new MailboxSettingService();
        OOP.SingleResponsibilityDemo.Problem.User user = new User();
        //responsibility #1 of MailboxSettingService- to change the secondary email
        settingService.changeSecondaryEmail(user, "newemail@gmail.com");

        //// responsibility #1 of the SecurityService - verify access
        SecurityService securityService = new SecurityService();
        if (securityService.hasAccess(user)) {
            user.sendMoney(new User(), 1000);
        }

    }
}
