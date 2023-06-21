# fizzbuzz

## Table of Contents

- [Overview](#overview)
- [Built With](#built-with)
- [Features](#features)
- [Contact](#contact)
<!-- [Acknowledgements](#acknowledgements) -->

## Overview
1. [Live demo](https://fizzbuzz.pelaghisoftware.com)
   - To use:
     - git clone https://github.com/pelaghisoftware/fizzbuzz.git
     - cd fizzbuzz
     - docker build . -t fizzbuzz
     - docker run -d -p 8080:8080 --restart always fizzbuzz
2. Used Springboot to create a simple Rest API while exploring the use of the Chain of Responsibility Pattern.
3. In this project, I improved on the following.
    - Modern Spring Boot annotations, patterns, and testing.
    - Using newer Java features such as records.
    - Implementing a usable Chain of Responsibility Pattern.
4. Some simple tips:
    - Use a Chain of Responsiblity pattern when you have a lengthy if/if else/else or when there is a set of steps that must happen in order to allow for easy addition and removal.
    - Use dependency injection through the constructors instead of field injection. This allows your code to require less changes if you want to move away from Spring.

## Built With
1. [OpenJDK 17](https://jdk.java.net/java-se-ri/17)
2. [SpringBoot](https://spring.io/projects/spring-boot)

## Features

This project serves as a simple example of how to structure a SpringBoot project and how to use an extremely useful pattern.

## Contact
### Email
[jon.ross@pelaghisofware.com](mailto:jon.ross@pelaghisoftware.com)

### Blog
[www.pelaghisoftware.com](https://www.pelaghisoftware.com)

<!-- ## Acknowledgements ->

