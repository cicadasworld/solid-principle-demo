# solid-principle-demo

## SRP - SINGLE RESPONSIBILITY PRINCIPLE
- Each class have single responsibility and single purpose
- A class should have only one reason to change
- A class should have only one responsibility
- Makes your software easier to implement and avoid unexpected future
- Much easier to understand and explain

## OCP - OPEN CLOSE PRINCIPLE
- Functionality or classes should be open extendable but closed for modification
- Existing functionality cannot be modified, if there is a new change it has to extend the functionality not to impact the existing code
- Classes, functions and module are open for extension
- Basically we are going to use abstract class to extent its functionality
- One way is to make use of polymorphism to invoke extended behaviours of an object at run time

## LSP - LISKOV SUBSTITUION PRINCIPLE
- The principle defines that objects of a superclass shall be replaceable with objects of its subclasses without breaking the application
- Functions that use references to base classes must be able to use objects of the derived class without knowing it.
- [Class A extends Class B] = [Class B extends Class A]
- Objects of your subclasses to behave in the same way as the objects of your superclass
- An overridden method of a subclass needs to accept the same input parameter values as the method of the superclass

## ISP - INTERFACE SEGREGATION PRINCIPLE
- Clients should not be foreced to depend upon interfaces that they do not use
- Reduce the side effects of using larger interfaces by breaking application interfaces into smaller ones
- It's pretty much similar to single responsibility principle
- It might takes time in the design phase, but much efficent in implementation phase

## DIP - DEPENDENCY INVERSION PRINCIPLE
- High-level modules should not depend on low-level modules. Both should depend on abstractions
- Abstractions should not depend on details. Details should depend on abstractions
- High level and Low level both has to depend on abstraction. That's the perfect design