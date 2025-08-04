# Janitri Login Page Automation

This project automates the login functionality of the [Janitri Dashboard](https://dev-dash.janitri.in) using Selenium WebDriver, Java, Maven, and TestNG following the Page Object Model (POM) design pattern.


## Project Objective

To test and validate the login page of the Janitri Dashboard through:
- Manual test cases
- Automated UI tests for positive and negative scenarios


## Tech Stack

- **Language**: Java  
- **Automation Tool**: Selenium WebDriver  
- **Build Tool**: Maven  
- **Testing Framework**: TestNG  
- **Design Pattern**: Page Object Model (POM)  
- **IDE**: IntelliJ IDEA / Eclipse  
- **Version Control**: Git & GitHub


## Project Structure

janitri-login-automation/
│
├── src/
│ ├── main/
│ │ └── java/
│ │ └── pages/ # Page Object classes
│ └── test/
│ └── java/
│ └── tests/ # TestNG test classes
│
├── testng.xml # TestNG configuration file
├── pom.xml # Maven dependencies
└── README.md # Project documentation
---

## Test Scenarios Covered

### Positive Scenarios
- Successful login with valid credentials
- Password visibility toggle (eye icon)

###  Negative Scenarios
- Blank username and password
- Invalid username or password
- Login button disabled/enabled logic
- Error messages display

## 🛠 How to Run

1. Clone the repository:
 git clone https://github.com/<Krupaavula>/janitri-login-feature.git  
2.Navigate to the project directory:
cd janitri-login-feature
3.Run tests using TestNG:
mvn clean test
Make sure ChromeDriver version matches your Chrome browser version.
##Author##
Krupa avula
Automation Tester [krupaavula7@gmail.com]

