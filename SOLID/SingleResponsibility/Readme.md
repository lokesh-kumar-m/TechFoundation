# Single Responsibility Principle (SRP)

## Introduction

The **Single Responsibility Principle (SRP)** is the first principle in the SOLID design principles. It is defined as follows:

> **A class should have one and only one reason to change.**

This means that every class should have a **well-defined and single responsibility/behavior**. Change to a software is inevitable. When a class consists of multiple responsibilities, when any one of those responsibilities change the entire class gets changed. Hence Single responsibility principle states that a single class should have a single responsibility.

---

## Why SRP Matters

### The Nature of Software Changes
Software is constantly evolving to meet new requirements. If a class has multiple responsibilities, even small changes can:
- Break existing functionalities.
- Increase testing and debugging efforts.
- Lead to tightly coupled, less reusable code.

### 
- **Cohesion**: Refers to how closely related the attributes and methods of a class are. High cohesion means that a class has a single, focused purpose.
- **Coupling**: Refers to the interdependence between modules or classes. Loose coupling ensures minimal dependencies, making the system more modular.

By ensuring **loose coupling** and **high cohesion**, ensure that classes adhere to SRP.


## Benefits of SRP

**Reduced Impact of Changes**, **Ease of Maintenance**, **Improved Readability**, **Better Reusability**  
