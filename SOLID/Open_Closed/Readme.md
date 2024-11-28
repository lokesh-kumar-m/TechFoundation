# Open/Closed Principle (OCP)

## Introduction

The **Open/Closed Principle (OCP)** is the second principle in the SOLID design principles. It is defined as follows:

> **Software entities should be open for extension but closed for modification.**

This means that a class should allow its behavior to be extended without modifying its existing code. Instead of changing the core functionality, new behavior should be added by creating new classes or methods that extend the existing ones. This encourages  in your code.


## Why OCP Matters

- **Easier to Add New Features**: Instead of modifying existing classes, you can simply create new subclasses or modules, making your system more flexible.
- **Avoids Breaking Changes**: By following OCP, changes are isolated in new classes, and existing functionality remains intact, thus avoiding the breaking of existing features, reducing risk.


## Benefits of OCP

**maintainability**, **scalability**, and **flexibility** 

---