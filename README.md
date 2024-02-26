# Flipkart Selenium Automation Project with TestNG and Extent Report

## Overview
This repository contains a Selenium automation project for testing the Flipkart e-commerce website. The project is implemented using the TestNG framework for organized test execution and includes Extent Reports for detailed and interactive test reporting.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#Prerequisites)
- [Setup](#setup)
- [Project Structure](#project-structure)
- [Test Execution](#test-execution)
- [Reporting](#reporting)
- [Contributing](#contributing)
- [License](#license)
- [Authors](#authors)
- [Acknowledgments](#acknowledgments)

## Introduction

This automation project is designed to thoroughly test various functionalities of the Flipkart e-commerce website. Selenium WebDriver is employed for web interactions, TestNG for structured test case management, and Extent Reports for comprehensive test reporting.

## Prerequisites
- Java JDK (version 8 or higher)
- Maven (version 3.6.0 or higher)
- Web browsers (e.g., Chrome, Firefox) with their respective WebDriver executables

## Setup
1. Clone the repository: `git clone  https://github.com/redJavaMan/flipkart-ui-e2e-test.git`
2. Navigate to the project directory: `cd flipkart-ui-e2e-test`
3. Install dependencies: `mvn install`


## Configuration
- Update `src/test/resources/config.properties` file to set browser preferences and other configurations.

## Running Tests
To execute the test suite, run: `mvn test`

## Structure
- **src/main/java**: Contains the Page Object Model and Utiliies.
  -**com.flipkart.main.pages**: Page object Model Classes.
  -**com.flipkart.main.utils**: Utility classes for common functions.
- **src/test/java**: Contains the test code with testComponents and Base Class
  - **com.flipkart.test.base**: TestNG Base Class.
  - **com.flipkart.test.testComponents**: Test Components.
  - **com.flipkart.test.tests**: All Tests.
- **src/test/resources**: Contains TestNG configuration file.
  -**testng.xml:** TestNG configuration file for test execution.

## Reports
After test execution, reports are generated in `reports`. This includes HTML, JSON, and XML reports.

## Contributing
Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## License
This project is licensed under the [LICENSE.md](LICENSE.md).

## Authors
- **Lukmanudhin M**  - [redJavaMan](https://github.com/redJavaMan)

## Acknowledgments
- [nerdishShah](https://github.com/nerdishShah)
