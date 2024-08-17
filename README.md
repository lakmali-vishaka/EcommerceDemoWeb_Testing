<h2>E-Commerce Web Testing Project</h2>

<h3>Overview</h3>
This project is dedicated to testing the key functionalities of an e-commerce platform. The focus is on ensuring that the platform performs reliably under various scenarios, with an emphasis on Quality Assurance (QA).

<h3>Features Tested</h3><br>
User Authentication: Testing the login process.<br>
Shopping Cart: Ensuring that products can be added, and removed from the cart smoothly.<br>
Checkout Process: Testing the complete checkout process.<br>

<h3>Technologies Used</h3><br>

TestNG: For organizing and running test cases.<br>
Selenium WebDriver: For automating browser interactions.<br>
Java: The primary programming language used in the test scripts.<br>
Maven: For project management and build automation.<br>

<h3>Getting Started</h3>
<h3>Prerequisites</h3><br>
Java JDK 8 or above<br>
Maven<br>
TestNG<br>
Selenium WebDriver<br>

<h3>Test Cases Location</h3>
EcommerceDemoWeb_Testing/src/main/java/Swag_labs

<h3>Known Issues</h3>

Incorrect Behavior After Removing Items from Cart</<br>
During testing, an issue was identified where, after removing an item from the cart, the "Continue" button still appears. Clicking this button allows the user to proceed through the checkout process, and the system incorrectly displays a "You ordered successfully" message, even though no items are present in the cart.

Steps to Reproduce:<br>

Add an item to the cart.<br>
Remove the item from the cart.<br>
Observe that the "Continue" button is still displayed.<br>
Click "Continue" and proceed through the checkout process.<br>
Note that the system displays a "You ordered successfully" message.<br>

Expected Behavior:<br>

After removing all items from the cart, the "Continue" button should not be displayed, and the user should not be able to proceed with the checkout process.<br>

<h3>demo</h3>

https://github.com/user-attachments/assets/fe79e4c5-152e-4193-9b50-4bc15271a6bc



