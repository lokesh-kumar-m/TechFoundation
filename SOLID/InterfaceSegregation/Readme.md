# Interface Segregation Principle (ISP)

## Introduction

The **Interface Segregation Principle (ISP)** is the fourth principle in the SOLID design principles. It is defined as follows:

> **Clients should not be forced to depend on interfaces they do not use.**

This means that a class should not implement an interface if it requires it to provide implementations for methods that it doesn't need. In such cases the large interface should be broken down into smaller interfaces that are more relevant, this ensure that a class will always implement the interfaces that are relevant to it.

## Benifits of ISP

- Better maintainability
- Resistance to changes.

Class red uses method1 from  Interface A, class Green uses method2 from interface A. If red need to modify the method1 signature, the change will extend to class Green as well even though it doesn't need that method. 