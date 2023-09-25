# Simple Java 17 test for GitHub
This is a simple automated test script written in Java using Selenium WebDriver to log into GitHub, verify the username, and then log out.

## Prerequisites

- Java Development Kit (JDK) installed
- Selenium WebDriver and required dependencies added to your project
- Edge WebDriver executable placed in a suitable location (e.g., project directory or system PATH)

## Getting Started

1. Clone this repository to your local machine.
2. Open the project in your preferred Java IDE.

## Configuration

1. Open the `src/test/java/java/org/elarnn/AppTest.java` file.
2. Modify the `login` and `password` constants in conf.properties file with your GitHub login credentials.
3. Make sure the `edgedriver` path in conf.properties file to Edge WebDriver is correct.

## Running the Test

1. Open the `src/test/java/java/org/elarnn/AppTest.java` file.
2. Run the `setup` test method. This method will:
   - Launch the Chrome browser
   - Navigate to the GitHub login page
   - Enter the provided username and password
   - Log in
   - Verify that the logged-in username matches the expected username
   - Log out from the account
   - Close the browser

## Contributing

Contributions are welcome! If you find any issues or want to enhance the test, feel free to fork this repository and submit a pull request.

## Warning

Could be troubles with verification code (This is not provided in the code).

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
