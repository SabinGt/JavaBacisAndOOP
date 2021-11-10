package OOP.SingleResponsibilityDemo.Problem;

public class SingleResponsibilityDemo {
    public static void main(String[] args) {
        MailboxSettingService settingService = new MailboxSettingService();
        User user = new User();
        //responsibility #1 of MailboxSettingService- to change the secondary email
        settingService.changeSecondaryEmail(user, "newemail@gmail.com");
        //responsibility #2 f MailboxSettingService- verify access
        if (settingService.hasAccess(user)) {
            user.sendMoney(new User(), 1000);
        }


    }
}
