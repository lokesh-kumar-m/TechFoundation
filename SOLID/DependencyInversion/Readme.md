# Dependency Inversion Principle (DIP)

## Introduction

The **Dependency Inversion Principle (DIP)** is the fifth principle in the SOLID design principles. It states that:

> **High-level modules should not depend on low-level modules. Both should depend on abstractions.**  
> **Abstractions should not depend on details. Details should depend on abstractions.**

This principle is focused on reducing the coupling between different modules in a system, ensuring that high-level logic is not tightly bound to low-level implementation details. By introducing abstractions, we can make the system more flexible and easier to maintain.


## Why DIP Matters

### Key Benefits
- **Reduced Coupling**: High-level modules become independent of low-level implementation details.
- **Improved Testability**: Mocking dependencies becomes easier, which simplifies unit testing.
- **Flexibility**: Systems are more adaptable to changes in low-level modules or dependencies.
- **Extensibility**: Adding new behaviors or replacing existing ones requires minimal changes.

### Common Violation
High-level modules directly depend on low-level implementations, which leads to tight coupling and makes the system rigid and harder to test.
