## 2. Decorator Pattern – Pizza Toppings and Car Feature Builder

This project demonstrates the **Decorator Design Pattern** using two real-world analogies:
- Pizza billing system with dynamic toppings
- Car builder configurator with feature stacking

---

## Pizza Toppings – Dynamic Billing Use Case

The **Decorator Pattern** allows objects to be wrapped with additional behavior dynamically. In this case, pizza toppings like cheese, jalapeños, and discounts are added at runtime without modifying the base class.

![pizza-uml](https://github.com/user-attachments/assets/pizza-uml-diagram.png)

### Use Case

- Base Pizza (e.g., Margherita or Farmhouse)
- Dynamically added toppings (e.g., Cheese, Jalapeño)
- Supports conditional discounts like “Double Cheese”

### Components

| Class / Interface         | Role                       |
|---------------------------|----------------------------|
| `Pizza`                  | Base Interface             |
| `Margherita`, `Farmhouse`| Concrete Pizza Types       |
| `ToppingDecorator`       | Abstract Wrapper           |
| `Cheese`, `Jalapeno`     | Concrete Toppings          |
| `OrderPizza`             | Simulation Driver          |

### Sample Output

```bash
Margherita - A classic pizza with tomato sauce and mozzarella, Cheese, Jalapeno, Double Cheese has 10% discount  
Total: $8.25

```

## 🚗 Car Feature Builder – Configurable Features with Discounts

This project demonstrates the **Decorator Design Pattern** through a **car configurator system** that allows dynamic feature additions such as **Sunroof**, **Sports Package**, and **Premium Interior**.

The design avoids the need for creating a new class for every combination like:
- `BasicCarWithSunroofAndSports`
- `LuxuryCarWithPremiumInteriorAndGPS`

Instead, features are wrapped at runtime — making the solution clean, scalable, and aligned with SOLID principles.

---

### 🧩 Use Case

- Start with a `BasicCar` object
- Dynamically add features (wrappers) at runtime
- Apply combo discounts (e.g., Sports + Premium Interior)

---

### 🏗️ Components

| **Class / Interface**       | **Role**                     |
|----------------------------|------------------------------|
| `Car`                      | Base interface               |
| `BasicCar`                 | Concrete base implementation |
| `CarDecorator`             | Abstract decorator wrapper   |
| `Sunroof`                  | Concrete decorator           |
| `SportsPackage`            | Concrete decorator           |
| `PremiumInterior`          | Concrete decorator           |
| `BillingApp`               | Driver class (main method)   |

---

### 🖥️ Sample Output

```bash
Basic Car, Sunroof, Premium Interior, Sports Package + Combo Discount  
Total Price: $18,900.00
```
Full article: https://medium.com/@bpniveditha/real-world-analogy-car-feature-builder-using-decorator-pattern-b806530530f7

