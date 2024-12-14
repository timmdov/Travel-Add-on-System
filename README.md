# Ozu Lounge Manager

## Overview

The **Ozu Lounge Manager** is a backend system designed to provide a seamless and luxurious experience for Ozu Airlines' passengers in their premium lounges. This system is built to manage the following functionalities:

1. **Ticket Upgrades**:
    - Passengers can upgrade their economy tickets with additional packages like:
        - **Extra Leg Room**: More space for comfort.
        - **Emergency Exit**: Seating near the emergency exit for convenience.
        - **The Ozu Experience**: A premium package including lounge access and priority boarding.
    - These upgrades are dynamically added to tickets, allowing flexible customization based on passenger preferences.

2. **Food and Drink Orders**:
    - The lounge includes services like SCOLA Ice Cream Palace, FEAS Pizzeria, and EF-Coffee, offering customizable food and beverages.
    - Customers can order items with optional add-ons (e.g., toppings for pizzas, extra espresso shots for coffee).
    - The price is calculated dynamically based on the chosen base product and add-ons.

3. **Unified Interface**:
    - All functionalities are accessible through a common interface, ensuring a consistent customer experience.

4. **Dynamic Pricing**:
    - Ticket upgrades and lounge orders are priced dynamically based on configurations selected by the customer. Customizations like toppings or extras are seamlessly added without modifying base classes.

This system leverages key software design patterns to provide a flexible, scalable, and maintainable solution, ensuring easy integration with a UI or additional features in the future.

---

## Project Structure

The system is organized into the following packages for clarity and maintainability:

### **1. `interfaces` Package**
- **Purpose**: Defines the core interfaces for the project.
- **Classes**:
    - `Ticket`: Represents the base functionality for tickets.
    - `Product`: Represents the base functionality for all lounge products (food and beverages).

---

### **2. `models` Package**
- **Purpose**: Contains the core implementations of tickets and products.
- **Classes**:
    - `EconomyTicket`: Represents the base ticket.
    - `Pizza`, `Coffee`, `IceCream`: Represent base food and beverage products.

---

### **3. `decorators` Package**
- **Purpose**: Dynamically adds features or customizations to tickets and products.
- **Classes**:
    - **For Tickets**:
        - `TicketDecorator`: Abstract class for ticket upgrades.
        - `ExtraLegRoom`, `EmergencyExit`, `TheOzuExperience`: Specific upgrades for tickets.
    - **For Products**:
        - `IceCreamDecorator`, `PizzaDecorator`, `CoffeeDecorator`: Abstract decorators for product customizations.
        - `VanillaScoop`, `Salami`, `ExtraEspressoShot`: Specific customizations for food and drinks.

---

### **4. `factories` Package**
- **Purpose**: Centralizes the creation of products (food and beverages).
- **Classes**:
    - `ProductFactory`: Abstract factory interface for products.
    - `PizzaFactory`, `CoffeeFactory`, `IceCreamFactory`: Create base instances of respective products.

---

### **5. `services` Package**
- **Purpose**: Manages workflows, orders, and centralized operations.
- **Classes**:
    - `OrderProcess`: Abstract class for standardizing the ordering workflow. This feature is currently optional and can be extended for more advanced scenarios.
    - `PizzaOrder`, `CoffeeOrder`, `IceCreamOrder`: Concrete classes implementing specific workflows.
    - `LoungeService`: **Singleton** class managing all lounge operations, including ticket upgrades, orders, and pricing.

---

## Design Patterns Used

### **1. Decorator Pattern**
**Purpose**:
- Dynamically adds features (like "Extra Leg Room" or "Unlimited Beverages") to tickets and products without modifying the base class.

---

### **2. Factory Pattern**
**Purpose**:
- Simplifies the creation of products (e.g., pizzas, coffees).
- Centralizes object creation logic, making the system extensible.

---

### **3. Template Method Pattern**
**Purpose**:
- Standardizes workflows for ordering items.
- Used in `OrderProcess` for potential future workflows.

---

### **4. Singleton Pattern**
**Purpose**:
- Ensures a single instance of `LoungeService` manages all operations.

---

## Requirements

- Java 11 or higher
- No external UI is required; this project focuses on backend functionality.

---

## Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/timmdov/ozu-lounge-manager.git