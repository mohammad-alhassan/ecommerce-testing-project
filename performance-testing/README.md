# ⚡ Performance Testing – Demoblaze E-Commerce Website (Apache JMeter)

This folder contains a basic web performance test for the public demo e-commerce site **Demoblaze**:

> https://www.demoblaze.com

---

## 📂 Folder Structure

performance-testing-web/
├─ Demoblaze_Web_LoadTest.jmx
├─ results.jtl
├─ report/
│ └─ index.html
└─ README.md

---

## 🧪 Test Scenario

**Thread Group Configuration:**
- **Users (Threads):** 20  
- **Ramp-up:** 10 seconds  
- **Loop Count:** 5  

**HTTP Requests Included:**
1. **Home Page** – `/`
2. **Laptops Category** – `/index.html#Laptops`
3. **Product Details** – `/prod.html?idp_=8`

---

## ▶️ How to Run the Test

1. Open **Apache JMeter**
2. File → **Open** → Load:
Demoblaze_Web_LoadTest.jmx
3. Adjust the Thread Group if needed
4. Click **Start (▶)** to run the test
5. Save execution results to:
performance-testing-web/results.jtl

---

## 📊 Generate HTML Performance Report

To generate the HTML dashboard:

1. Go to **Tools → Generate HTML report**
2. Fill in the following fields:
3. JMeter will generate the dashboard inside:

**Results file (csv or jtl):**
performance-testing-web/results.jtl

**user.properties file:**
<JMeter>/bin/user.properties

**Output directory:**
performance-testing-web/report


---

## 🛠 Tools Used
- Apache **JMeter 5.6.3**
- **Java JDK21**
- **Demoblaze** Demo Website

---

## 👤 Author
**Mohammad Al-Hassan – Quality Assurance Engineer**  
GitHub: https://github.com/mohammad-alhassan  
LinkedIn: https://www.linkedin.com/in/mohammad-alqadomi


