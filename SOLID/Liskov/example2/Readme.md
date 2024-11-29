# Liskov Substitution Principle (LSP)

## Introduction

The **Liskov Substitution Principle (LSP)** is the third principle in the SOLID design principles. It is defined as follows:

> **Objects of a superclass should be replaceable with objects of its subclasses without breaking of application.**

This means that if a class `B` is a subclass of class `A`, you should be able to use an object of class `B` wherever an object of class `A` is expected. The behaviour of parent class and child class should be similar. LSP implicity also follows OCP. 

- Duck is a Interface, implemented by mountainDuck, wildDuck, rubberDuck. RubberDuck cannot be replaced for General Duck.

- Does not behave in any kind of unexpected way