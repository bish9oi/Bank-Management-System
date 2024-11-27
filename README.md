# Bank Management System

A comprehensive banking application built using **Java**, **Swing**, and **MySQL**. The system offers functionalities like account creation, deposit, withdrawal, balance inquiry, mini-statement generation, and more. This project includes a graphical user interface (GUI) for seamless interaction and features an ATM-like experience.

---

## 📝 Project Overview

The Bank Management System simulates basic ATM operations, allowing users to:
- Open a new bank account.
- Generate and use a **Card Number** and **PIN** for secure transactions.
- Perform banking operations such as deposits, withdrawals, PIN changes, balance inquiries, and mini-statement generation.
- Access the system through a **login screen** with secure credential validation.

---

## 💡 Features

### 1. Account Management
- New users can register by creating an account.
- A unique **Card Number** and **PIN** are assigned upon successful registration.

### 2. Login System
- Secure login using **Card Number** and **PIN**.
- Input validation to ensure proper credentials.

### 3. ATM Functionalities
- **Deposit Money:** Add funds to the account.
- **Withdraw Money:** Securely withdraw funds.
- **Balance Inquiry:** Check the current account balance.
- **Mini-Statement:** View a summary of recent transactions.
- **PIN Change:** Update the account PIN.
- **Fast Cash:** Quick withdrawal options for preset amounts.

### 4. User-Friendly Interface
- Intuitive GUI using **Java Swing** for easy navigation.
- Real-time error messages for incorrect credentials or operations.

---

## 🛠 Technologies Used

### Frontend
- **Java Swing**: For designing the graphical user interface (GUI).

### Backend
- **Java**: Core programming language for application logic.
- **MySQL**: Database for storing user information, account details, and transactions.

### Development Tools
- **IDE**: IntelliJ IDEA, Eclipse, or NetBeans.
- **MySQL Workbench**: For database management.
- **JDBC**: Java Database Connectivity for connecting Java to MySQL.

---

## 📋 How It Works

### 1. Login
- Launch the application.
- Enter your **Card Number** and **PIN** to access your account.

### 2. Sign Up
- New users can register by providing their details.
- The system generates a unique **Card Number** and **PIN** for them.

### 3. ATM Operations
- Select from various options like Deposit, Withdrawal, Balance Inquiry, and more.
- Use your PIN for secure transactions.
 
## 🗂 Project Structure

bank.management.system/
├── src/                           # Source code files
│   ├── login.java                 # Login functionality and main entry point
│   ├── SignUp.java                # Account registration functionality
│   ├── main_class.java            # Main ATM interface
│   ├── cone.java                  # Database connection setup
│   └── other files...             # Additional classes for functionality
├── icon/                          # Image assets for the project
│   ├── bank.png                   # Bank logo
│   ├── card.png                   # Card icon for login interface
│   ├── backbg.png                 # Background image for GUI
├── README.md                      # Project documentation
└── SQL/                           # SQL scripts for database setup
    └── create_tables.sql          # Script to create required tables

