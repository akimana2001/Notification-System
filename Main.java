public class Main {

    public static void main(String[] args) {

        // The email test
        NotificationService email = new EmailNotification();
        email.sendNotification("Welcome to our platform!");

        System.out.println("--------------------------------");

        // The SMS test
        NotificationService sms = new SMSNotification();
        sms.sendNotification("Your OTP is 1234");

        System.out.println("--------------------------------");

        // Pushing the test
        NotificationService push = new PushNotification();
        push.sendNotification("You have a new update!");
    }
}
