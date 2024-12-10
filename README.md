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
   - Ticket upgrades and lounge orders are priced dynamically based on configurations selected by the customer.

This system leverages key software design patterns to provide a flexible, scalable, and maintainable solution, ensuring easy integration with a UI or additional features in the future.

---

## Project Structure

The system is organized into the following packages for clarity and maintainability:

### **1. `interfaces` Package**
- **Purpose**: Defines the core interfaces for the project.
- **Classes**:
    - `Ticket`: Represents the base functionality for tickets.
    - `Product`: Represents the base functionality for all lounge products (food and beverages).
    - `PricingStrategy`: Defines the interface for dynamic pricing strategies.

---

### **2. `models` Package**
- **Purpose**: Contains the core implementations of tickets, products, and composites.
- **Classes**:
    - `EconomyTicket`: Represents the base ticket.
    - `Pizza`, `Coffee`, `IceCream`: Represent base food and beverage products.
    - `CompositeProduct`: Groups multiple products (e.g., meal packages) into a single entity.

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
    - `OrderProcess`: Abstract class for standardizing the ordering workflow.
    - `PizzaOrder`, `CoffeeOrder`, `IceCreamOrder`: Concrete classes implementing specific workflows.
    - `LoungeService`: **Singleton** class managing all lounge operations, including ticket upgrades, orders, and pricing.

---

### **6. `utils` Package**
- **Purpose**: Contains utility classes for dynamic pricing strategies.
- **Classes**:
    - `PricingStrategy`: Interface for pricing strategies.
    - `RegularPricing`: Charges regular prices with no discounts.
    - `DiscountPricing`: Applies percentage discounts to base prices.

---

### **7. `controllers` Package**
- **Purpose**: (Currently Empty) Reserved for future additions, such as user input processing or integration logic.

---
---
## Design Patterns Used

### **1. Decorator Pattern**
**Purpose**:
- To dynamically add features (like "Extra Leg Room" or "Unlimited Beverages") to a ticket without modifying the base class.
- To avoid creating multiple subclasses for every combination of ticket upgrades.
- To enable flexible and dynamic composition of features.

---

### **2. Factory Pattern**
**Purpose**:
- To simplify the creation of products like pizzas, coffees, and other lounge services.
- To centralize object creation logic, making the system extensible for new product types.
- To separate product instantiation from business logic.

---

### **3. Template Method Pattern**
**Purpose**:
- To standardize the workflow for ordering items (e.g., food, drinks, ticket upgrades).
- To ensure consistency in processes like "ask preferences → prepare → deliver → accept payment."
- To allow specific steps of the workflow to be customized for different product types.

---

### **4. Composite Pattern**
**Purpose**:
- To allow grouping multiple products (e.g., meal packages with pizza, coffee, and dessert) as a single object.
- To treat individual products and groups of products uniformly.
- To simplify operations like calculating total price and providing descriptions for grouped items.

---

### **5. Singleton Pattern**
**Purpose**:
- To ensure only one instance of the lounge system exists and provides a centralized interface for customers.
- To manage global access to shared resources like order services and pricing calculations.

---

### **6. Strategy Pattern**
**Purpose**:
- To allow dynamic selection of pricing algorithms (e.g., regular pricing, discount pricing).
- To encapsulate pricing rules and make them interchangeable at runtime.
- To provide flexibility in applying different pricing strategies based on customer or order type.

---

## Requirements

- Java 11 or higher
- No external UI is required; this project focuses on backend functionality.

---

## Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/timmdov/ozu-lounge-manager.git