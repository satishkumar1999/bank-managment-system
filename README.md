# Bank Management System 🏦

This is a simple **Bank Management System** developed using **Java Swing** and AWT. It simulates basic ATM functionalities such as account creation, deposit, withdrawal, balance enquiry, and more.

## 🔧 Tech Stack

- Java (JDK 8 or above)
- Java Swing & AWT for GUI
- JDBC for database connectivity
- MySQL (backend database)
- JCalendar for date selection (`jcalendar-tz-1.3.3-4.jar`)

---

## 📁 Project Structure
```
BankManangementSystem/
├── src/
│ └── com/satish/banking/
│ ├── LoginForm.java
│ ├── SignUpForm.java
│ ├── AdditionalDetailsForm.java
│ ├── AccountDetailsForm.java
│ ├── TransactionDashboard.java
│ ├── DepositTransaction.java
│ ├── WithdrawTransaction.java
│ ├── BalanceEnquiry.java
│ └── ConnectToDb.java
├── Icon/
│ ├── atm2.png
│ ├── bank.png
│ └── backbg.png
├── jcalendar-tz-1.3.3-4.jar
└── README.md
```


---

## 🧾 Features

- 📝 User Signup (Multi-page form)
- 🔐 Login with PIN authentication
- 💰 Deposit Money
- 🏧 Withdraw Money (limit check)
- 📄 Balance Enquiry
- 📊 Transaction Dashboard (GUI-based)

---

## 💽 Database Schema (MySQL)

```
CREATE TABLE bank (
    Pin_No VARCHAR(20),
    Date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Type VARCHAR(20),
    Amount VARCHAR(20)
);
```




















