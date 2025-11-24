# 🧪 E-Commerce Testing Project

Full end-to-end QA portfolio project for an e-commerce application, covering:

- ✅ Manual Testing  
- ✅ API Testing (Postman + Newman)  
- ✅ UI Automation (Selenium + TestNG)  
- ✅ Performance Testing (Apache JMeter)  

This repository is designed to demonstrate a practical, real-world QA workflow: from reading requirements and designing test cases, to automating scenarios and analysing performance under load.

---

## 👤 Author

**Mohammad Al-Hassan – Quality Assurance Engineer**  
- GitHub: [@mohammad-alhassan](https://github.com/mohammad-alhassan)  
- LinkedIn: [Mohammad Alqadomi](https://www.linkedin.com/in/mohammad-alqadomi)

---

## 🏗 Project Structure

```text
ecommerce-testing-project/
├─ manual-testing/            # Test cases, bug reports, test design docs
├─ api-testing/               # Postman collection + environment + API README
├─ automation-ui/             # Selenium + TestNG UI automation (Maven project)
│   └─ ecommerce-automation/  # src/test/java/... etc.
├─ performance-testing-web/   # JMeter tests + HTML performance report (Demoblaze)
└─ README.md                  # This main documentation
```

> Each folder focuses on a different testing layer and can be reviewed/run independently.

---

## 🔧 Tech Stack

**Manual Testing**

- Test design techniques (Equivalence Partitioning, Boundary Value Analysis, etc.)
- Test cases, bug reports, simple RTM (Requirements Traceability Mapping)

**API Testing**

- Postman Collections & Environments  
- REST API testing for a demo Fake Store API  
- `pm.test()` assertions and scripts  
- Optional CLI execution with **Newman**

**UI Automation**

- Java + Maven  
- Selenium WebDriver  
- TestNG  
- WebDriverManager  
- Basic Page-oriented test classes for e-commerce flows

**Performance Testing**

- Apache JMeter  
- Thread Groups / HTTP Samplers / Listeners  
- HTML Dashboard report (response times, throughput, errors)

---

## 📁 1. Manual Testing

Folder: `manual-testing/`

Typical contents (may vary):

- Test Plan / Scope
- Test Scenarios & Test Cases
- Bug Reports / Defect Log
- Notes or diagrams for the e-commerce flows

**Goal:** Show understanding of test design and documentation quality.  
You can open the files directly (Excel, Word, PDF, or Markdown) to review the manual testing artefacts.

---

## 🌐 2. API Testing (Postman)

Folder: `api-testing/`

Key artefacts:

- **Postman Collection** – endpoints for a Fake Store API  
- **Environment File** – base URL, product IDs, credentials  
- **README** – how to import and run tests (including Newman)

Typical usage:

1. Import the collection into **Postman**  
2. Import the environment file  
3. Select the environment (e.g. `Platzi FakeStore API`)  
4. Run requests or use the Collection Runner  
5. (Optional) Run from CLI using **Newman**:
   ```bash
   newman run "Platzi Fake Store API.postman_collection.json" \
     -e "platzi-fakestore-environment.postman_environment.json" \
     -r cli,html
   ```

This part demonstrates API validation, assertions, and basic automation around REST APIs.

---

## 🖥 3. UI Automation (Selenium + TestNG)

Folder: `automation-ui/ecommerce-automation/`

Typical structure (Maven):

```text
ecommerce-automation/
├─ src/
│  └─ test/
│     └─ java/
│         └─ tests/        # Test classes (e.g., open site, add product, etc.)
├─ pom.xml                 # Maven dependencies (Selenium, TestNG, WebDriverManager)
└─ testng.xml              # Test suite configuration
```

Example tools used:

- `org.seleniumhq.selenium:selenium-java`
- `io.github.bonigarcia:webdrivermanager`
- `org.testng:testng`

Basic run commands:

```bash
# From inside ecommerce-automation/
mvn clean test
```

This part shows browser-based functional tests for an e-commerce UI (opening site, validating elements, simple flows, etc.).

---

## ⚡ 4. Web Performance Testing (JMeter – Demoblaze)

Folder: `performance-testing-web/`

Contents:

- `Demoblaze_Web_LoadTest.jmx` – JMeter Test Plan
- `results.jtl` – captured execution results
- `report/` – generated HTML dashboard (`index.html`)
- `README.md` – detailed instructions

Scenario example:

- Target site: `https://www.demoblaze.com`
- Thread Group: 20 users, ramp-up 10s, loop 5
- Requests:
  - Home page `/`
  - Laptops category `/index.html#Laptops`
  - Product details `/prod.html?idp_=8`

Running the test:

1. Open JMeter  
2. Load `Demoblaze_Web_LoadTest.jmx`  
3. Run the Thread Group  
4. Save results to `results.jtl`  
5. Generate HTML report and open `report/index.html`

This demonstrates how the site behaves under concurrent virtual users, showcasing response times, throughput, and errors.

---

## 🚀 How to Use This Repository

1. **Clone the repo**
   ```bash
   git clone https://github.com/mohammad-alhassan/ecommerce-testing-project.git
   cd ecommerce-testing-project
   ```

2. **Explore per layer**
   - `manual-testing/` → documentation & test cases  
   - `api-testing/` → open in Postman  
   - `automation-ui/` → open in IntelliJ/IDEA or run with Maven  
   - `performance-testing-web/` → open `.jmx` in JMeter

3. **Run what you need**
   - For interviews: show structure + walk through each type of testing  
   - For practice: extend scenarios, add more tests, or plug into CI/CD.

---

## 💡 Possible Improvements (Future Work)

- Convert UI tests to full Page Object Model (POM)  
- Integrate Allure / Extent Reports for UI Automation  
- Add CI workflows (GitHub Actions) to run API/UI tests automatically  
- Add more performance scenarios (spike/load/soak)  
- Add Security Testing checklist for login & APIs  

---

If you’re reviewing this repo and want more details about any part (manual, API, UI, or performance), feel free to reach out on LinkedIn.  
This project is actively evolving as part of continuous learning in QA & Test Automation.
