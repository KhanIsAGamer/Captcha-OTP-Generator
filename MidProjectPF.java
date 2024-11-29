    import java.util.Scanner;
public class MidProjectPF {

    static String generateOTP(int length) {
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomDigit = (int) (Math.random() * 10); 
            otp.append(randomDigit); 
        }

        return otp.toString();
    }

    static String generateCaptcha(int length) {
        StringBuilder captcha = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int type = (int) (Math.random() * 3); 

            if (type == 0) {

                int randomDigit = (int) (Math.random() * 10);
                captcha.append(randomDigit); } 

            else if (type == 1) {
                char randomUppercase = (char) ('A' + (int) (Math.random() * 26));
                captcha.append(randomUppercase); } 

            else {
                char randomLowercase = (char) ('a' + (int) (Math.random() * 26));
                captcha.append(randomLowercase);
            }
        }

        return captcha.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose (1) for Captcha and (2) for the OTP: ");
        int choice = input.nextInt();

        switch (choice) {

            case 1:

            String captcha = generateCaptcha(6);
            System.out.println("The generated Captcha is: " + captcha);

            System.out.print("Enter the generated Captcha: ");
            String UserCaptcha = input.next();

            if(captcha.equals(UserCaptcha)){
                System.out.println("Captcha is correct");
            }

            else {
                System.out.println("Captcha is incorrect");
            }

            break;

            case 2:
            
            String otp = generateOTP(6);
            System.out.println("The generated OTP is: " + otp);

            System.out.print("Enter the generated OTP code: ");
            String userOTP = input.next();
           
            if(otp.equals(userOTP)){
                System.out.println("OTP is correct");
            }

            else {
                System.out.println("OTP is incorrect");
            }
            
            break;

            default:
            System.out.println("Either choose 1 or 2");

            input.close();
        }

     }
}
