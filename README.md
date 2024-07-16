
## Summary

This project automates the hotel booking process on the Adactin Hotel Booking Application using the TestNG framework. 

- **Developed and executed automated tests for the hotel booking functionality on the Adactin Hotel Booking Application using the TestNG Framework.**
- **Implemented the TestNG framework, incorporating a base class for reusable code.**
- **Created POJO classes to maintain locators for each webpage, ensuring efficient and organized code structure.**
- **Developed test runner classes for seamless execution of test cases.**
- **Utilized Excel for test data management through automation.**
- **Validated the entire process by capturing screenshots and storing them in a separate folder.**
- **Generated comprehensive reports to document test results and insights.**


The automation script covers the entire workflow from opening the application, logging in, searching for hotels, selecting a hotel, making a payment, and capturing the booking confirmation.The key actions in the script are:

1. **Initial Setup and Browser Configuration:**
   - Launch the browser and maximize the window.
   - Open the Adactin Hotel Booking Application webpage.
   - Capture and save screenshots of the homepage.

2. **User Authentication:**
   - Enter user credentials and log into the application.
   - Capture and save screenshots after providing credentials.

3. **Hotel Search:**
   - Select location, hotel, room type, number of rooms, adults per room, and children per room from the dropdowns.
   - Submit the search form.
   - Capture and save screenshots after providing search details.

4. **Hotel Selection:**
   - Select a hotel from the search results.
   - Capture and save screenshots of the hotel selection page.
   - Proceed to the booking page.

5. **Payment:**
   - Enter payment details including first name, last name, address, credit card number, credit card type, expiration date, and CVV.
   - Capture and save screenshots after entering payment details.
   - Submit the payment form.

6. **Booking Confirmation:**
   - Capture and save screenshots of the confirmation page.

## Additional Points for README


## Code Highlights

- **Base Class:**
  - Contains methods for launching the browser, maximizing the window, opening the webpage, and other reusable functions.

- **Login:**
  - `Loginpojo` class handles the login page locators.
  - Login method enters email and password, then logs in.

- **Search:**
  - `Searchpojo` class handles the search page locators.
  - Search method selects the required options from dropdowns and submits the form.

- **Hotel Selection:**
  - `Selecthotelpojo` class handles the hotel selection page locators.
  - Selection method selects a hotel and proceeds to the next step.

- **Payment:**
  - `PaymentPagepojo` class handles the payment page locators.
  - Payment method enters payment details and submits the form.

- **Confirmation:**
  - Captures the order number and confirmation details.

## How to Run

1. **Clone the Repository:**
   ```bash
   git clone <repository_url>
   cd <repository_directory>
   ```

2. **Setup:**
   - Ensure Java and Maven are installed.
   - Add necessary dependencies in the `pom.xml` file.
   - Update the WebDriver path in the Base class.

3. **Execution:**
   - Run the TestNG test suite:
     ```bash
     mvn test
     ```

4. **Reports and Screenshots:**
   - Check the `screenshots` folder for captured images.
   - View the TestNG reports for detailed test results.

## Dependencies

- **Java Development Kit (JDK)**
- **Apache Maven**
- **TestNG**
- **Selenium WebDriver**
- **Apache POI (for Excel data management)**

By following these instructions and understanding the summary, you should be able to set up and execute the automated tests for the Adactin Hotel Booking Application.
