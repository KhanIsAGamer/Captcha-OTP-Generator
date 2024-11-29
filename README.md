# Captcha-OTP-Generator

Captcha and OTP Generator
A simple Java-based console application that generates Captchas and OTPs for user validation. The program allows users to choose between generating a Captcha or OTP and validates their input.

Features
Captcha Generation:

Generates a 6-character Captcha containing a mix of:
Digits (0–9)
Uppercase letters (A–Z)
Lowercase letters (a–z)
Validates the Captcha entered by the user.
OTP Generation:

Generates a 6-digit numeric OTP.
Validates the OTP entered by the user.
Menu-Driven Interface:

Allows users to choose between Captcha or OTP generation.
Validation:

Ensures the user input matches the generated Captcha or OTP.
Getting Started
Prerequisites
Java Development Kit (JDK) installed on your system.
A code editor or IDE such as IntelliJ IDEA, Eclipse, or Visual Studio Code.
How to Run
Clone or download the project files to your local machine.
Open a terminal or command prompt.
Navigate to the folder containing the .java file.
Compile the code using:
javac MidProjectPF.java
Run the program:
java MidProjectPF
Usage
Program Menu
When the program runs, it prompts the user to choose an option:

Captcha Generation:

Select option 1 to generate a Captcha.
Enter the displayed Captcha to validate.
Output indicates whether the Captcha is correct or incorrect.
OTP Generation:

Select option 2 to generate an OTP.
Enter the displayed OTP to validate.
Output indicates whether the OTP is correct or incorrect.
Invalid Input Handling:

If an invalid input is entered, the program prompts the user to choose again.
Example Interaction
Captcha Generation
Choose (1) for Captcha and (2) for OTP: 1
The generated Captcha is: Xb7Z1a
Enter the generated Captcha: Xb7Z1a
Captcha is correct.
OTP Generation
Choose (1) for Captcha and (2) for OTP: 2
The generated OTP is: 435267
Enter the generated OTP code: 123456
OTP is incorrect.
Invalid Input
Choose (1) for Captcha and (2) for OTP: 3
Either choose 1 or 2
Code Overview
Functions
generateOTP(int length)

Generates a random numeric OTP of specified length.
generateCaptcha(int length)

Generates a random Captcha of specified length, mixing digits, uppercase, and lowercase letters.
main()

Provides the menu-driven interface for Captcha and OTP generation.
Handles user input and validation.
Built With
Java SE
Contributors
Mahmood Ashraf
