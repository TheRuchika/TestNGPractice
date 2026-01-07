# TestNG Practice – Core Concepts & Examples

This project contains **hands-on TestNG examples** written in **Java** to demonstrate core TestNG features and best practices.  
The main focus of this repository is **understanding TestNG annotations, execution flow, assertions, grouping, and dependencies** with clean and readable code.

---

## 🚀 Technologies Used
- Java
- TestNG
- Selenium WebDriver (for demo scenarios)
- Maven
- ChromeDriver

---

## 🧠 TestNG Concepts Covered

### 🔹 Test Execution Control
- Test priorities
- Enable / disable tests
- DependsOnMethods
- AlwaysRun

### 🔹 TestNG Annotations
- @BeforeSuite / @AfterSuite
- @BeforeTest
- @BeforeClass / @AfterClass
- @BeforeMethod / @AfterMethod
- @Test execution hierarchy

### 🔹 Assertions
- Hard Assertions
  - assertEquals
  - assertNotEquals
  - assertTrue
  - assertFalse
- Soft Assertions
  - SoftAssert with assertAll()

### 🔹 Grouping
- Smoke tests
- Regression tests
- Group-based execution

### 🔹 Parameter & Data Handling
- Shared test data usage
- Method chaining examples
- Reusable test utilities

---

## 🧪 Example Test Scenarios
- Test execution order using priority
- Skipping tests using `enabled = false`
- Handling dependent test failures
- Executing tests regardless of dependency using `alwaysRun = true`
- Group-based test execution (Smoke & Regression)

---

## ▶️ How to Run the Tests

1. Clone the repository
   ```bash
   git clone https://github.com/TheRuchika/TestNGPractice
