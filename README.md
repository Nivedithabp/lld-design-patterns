## 1.Observer Pattern – Amazon "Notify Me" Clone

This project illustrates the **Observer Design Pattern** through a simulation of Amazon's "Notify Me" feature for out-of-stock products.


## 📘 Overview

The **Observer Pattern** establishes a one-to-many relationship where a subject notifies all registered observers of state changes.
![design](https://github.com/user-attachments/assets/3e0d0884-56f5-4e30-bde4-8c7649ee945f)

## 📦 Use Case

- Product (subject) tracks inventory
- Customers (observers) subscribe for notifications
- On restock, all observers are notified via email/SMS

## 🧩 Components

| Class / Interface              | Role                          |
|--------------------------------|-------------------------------|
| `ProductObservable`            | Observable interface          |
| `StockObserver`                | Observer interface            |
| `ProductStock`                 | Concrete Subject              |
| `EmailNotifier`, `SmsNotifier` | Concrete Observers            |
| `NotifyMeApp`                  | Simulation driver             |

## 🧪 Sample Output

Hi abc@gmail.com! Your item iphone is back in stock! (2 available)
SMS sent to +19876543210 about iphone restock.

## Folder Structure
design.pattern.observer/
├── observable/
│   ├── ProductObservable.java
│   └── ProductStock.java
├── observer/
│   ├── StockObserver.java
│   ├── EmailNotifier.java
│   └── SmsNotifier.java
└── NotifyMeApp.java
