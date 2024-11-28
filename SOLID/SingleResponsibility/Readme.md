# Single Responsibility Principle (SRP)

## Introduction

The **Single Responsibility Principle (SRP)** is the first principle in the SOLID design principles. It is defined as follows:

> **A class should have one and only one reason to change.**

This means that every class should have a **well-defined and single responsibility/behavior**. Change to a software is inevitable. When a class consists of multiple responsibilities, when any one of those responsibilities change the entire class gets changed. Hence Single Responsibility Principle states that a single class should have a single responsibility.

## Why SRP Matters

### The Nature of Software Changes
Software is constantly subjected new requirements. If a class has multiple responsibilities, even small changes can:
- Disturb existing functionalities.
- Hard to debug.

### Cohesion And Coupling
Cohesion is essential in creating SRP. Both of them go in contrast. 
- **Cohesion**: Refers to how closely related the attributes and methods of a class are. The good design is to always bind related elemets close to each other in a single class. High cohesion of a class suggests that the class has a singluar purpose. 
- **Coupling**: Refers to the interdependence between modules or classes. High coupling refers that changes in one class will change other classes that are dependent on it, hence we sohuld try to make classes less independent, which is low coupling

By ensuring **tight cohesion** and **loose coupling**, ensure that classes adhere to SRP.


## Benefits of SRP

**Reduced Impact of Changes**, **Ease of Maintenance**, **Improved Readability**, **Better Reusability**  
