# Overview
In this project three test case was implemented for https://www.ibar.az/ web application.
Here technologies such as Java, Selenium, TestNG, log4j were used. The project are built with Maven.
You can find all dependencies in pom.xml file.

# Structure of the project

``src\main\java\business_objects`` -- in this package there is enum with language properties

``src\main\java\logger`` -- in this package work with log4j was implemented

``src\main\java\page_objects`` -- here Page Object pattern was implemented for Home, Loan and Cards pages

``src\main\java\webdriver`` -- in this package work with Chrome WebDriver was implemented

``src\main\resources`` -- there are properties for log4j and chromedriver.exe
 
``src\test\java`` --  in this package all above test cases are implemented

``src\test\resources\tests.xml`` -- also tests could be run with this TestNG xml file 

## Test cases which are implemented

### Test 1: " User should not be able to submit loan form without completing it"

**Given:** Landing page is opened

**When:** User navigate to "Apply for a loan online" form by clicking "Apply online" button in "Loan calculator" section. User try to submit form with empty fields.

**Then:** All mandatory fields inline in red.

### Test 2: "User should be able to switch language from Azerbaijan to Russian or English"

**Given:** Landing page is opened in Azerbaijani 

**When:** User change language to EN (RU)

**Then:** Link is changed to https://www.ibar.az/en/ferdi (https://www.ibar.az/ru/ferdi) and "Haqqımızda" link text is changed to "About us"("О нас")

### Test 3: "User should be able to find three 'American Express' cards in 'Cards' page"

**Given:** Landing page is opened in Azerbaijani 

**When:** User navigate to "Cards" page

**Then:** In the list User can find three  'American Express' cards
