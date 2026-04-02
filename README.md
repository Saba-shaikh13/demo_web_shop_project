Application: Demo Web Shop

Website: https://demowebshop.tricentis.com/

#Objectivies : To design and implement an automation testing framework for the Demo Web
Shop e-commerce application using Selenium WebDriver, TestNG, Cucumber (BDD), and the Page Object Model
design pattern.

#2. Tools and Technologies

• Selenium WebDriver

• TestNG

• Cucumber (BDD)

• Page Object Model (POM)

• Java

• Maven

#Framework Requirements

• Use Page Object Model to separate page locators and actions.
• Write Cucumber feature files for scenarios.
• Implement Step Definitions for automation logic.
• Use TestNG runner for execution.
• Include reusable utility classes (DriverFactory, ConfigReader, ScreenshotHelper)

#project setup

1.create maven project 
2.add selenium dependency 
3.add chrome driver or edge driver
4.install testng and cucumber
5.add their dependency 

#Scenarios:

Verify Home Page: Launch browser, navigate to the website, verify homepage title, and verify main categories
(Books, Electronics, Apparel).

• User Registration: Click Register, enter user details, enter email and password, submit the form, verify
successful registration message.

• Login Functionality: Click Login, enter valid email and password, click login button, verify successful login.

• Invalid Login: Enter incorrect email or password, click login, verify error message.

• Search Product: Enter product name in search box, click search, verify relevant results appear

#Run test script using TrstRunner with Testng
