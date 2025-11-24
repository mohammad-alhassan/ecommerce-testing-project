# Ecommerce Testing Project – Demoblaze

This repository contains a full QA project for the demo e-commerce website:
https://www.demoblaze.com/

It includes:
- Manual Testing (Test Plan & Test Cases)
- UI Automation Testing (Selenium + TestNG)
- API & Performance testing folders (placeholders for future work)

---

## 📂 Project Structure

```text
ecommerce-testing-project/
├─ 01-manual-testing/
│  ├─ test-plan.md
│  └─ test-cases.xlsx
├─ 02-api-testing/
│  └─ (Postman collections – TODO)
├─ 03-automation-ui/
│  └─ ecommerce-automation/
│     ├─ pom.xml
│     ├─ testng.xml
│     └─ src/test/java/
│         ├─ base/BaseTest.java
│         ├─ pages/HomePage.java
│         ├─ pages/ProductPage.java
│         ├─ pages/CartPage.java
│         └─ tests/
│             ├─ AddToCartTest.java
│             └─ PlaceOrderTest.java
└─ 04-performance-testing/
   └─ (JMeter scripts – TODO)
