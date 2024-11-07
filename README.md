# 🏎️ Race (Inheritance and Polymorphism) #
 
## 📋 Project Overview ##
This project simulates a race between different types of vehicles using Object-Oriented Programming (OOP) principles in Java. We focus on inheritance and polymorphism to allow each vehicle type—like Car, Motorbike, and Truck—to share core characteristics while having unique behaviors. 
This project is part of the Factoría F5 Programming and Cloud Computing Bootcamp (AWS/re-start), focusing on Java development.

## 🔑Key Concepts Learned ##
Inheritance 🧬
The Vehicle class includes shared properties (like brand, velocity, and wheels) and methods (like accelerate and brake). Through inheritance, Car, Motorbike, and Truck can reuse these elements and keep our code consistent across vehicle types.
![Inheritance structure](/src/images/kata_Race.png)

## Polymorphism 🌐 ##
With polymorphism, we can treat each vehicle subclass as a Vehicle. Each subclass customizes accelerate and brake, allowing different behaviors based on the vehicle type, even when using the same methods.

## Overriding Methods🔄 ##
Overriding accelerate and brake in each subclass gives each vehicle type unique acceleration and braking behaviors, highlighting the power of polymorphism in making code adaptable.

