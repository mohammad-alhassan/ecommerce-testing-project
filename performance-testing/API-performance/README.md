# ⚡ Performance Testing – FakeStore API (Apache JMeter)

This folder contains a simple performance testing scenario for the public **Platzi Fake Store API** using **Apache JMeter**.

The goal is to simulate multiple virtual users calling the API endpoints and then generate an **HTML performance report**.

---

## 📂 Files in this folder

- **FakeStore_API_LoadTest.jmx**  
  JMeter Test Plan file that contains:
  - Thread Group: `FakeStore API Load Test`
  - 3 HTTP Samplers:
    - `GET All Products` → `/products`
    - `GET Single Product` → `/products/{id}`
    - `POST Login` → `/auth/login`

- **results.jtl**  
  Raw JMeter results file (execution metrics: response times, errors, throughput, etc.)

- **report/**  
  Auto-generated JMeter HTML dashboard:
  - `index.html` is the main entry point
  - Contains APDEX, response time graphs, requests summary, and error statistics.

---

## ▶️ How to Run the Test (Locally)

1. Install **Java JDK** and **Apache JMeter** (5.6.x or higher).
2. Open JMeter and load the Test Plan:
   - `File → Open → FakeStore_API_LoadTest.jmx`
3. (Optional) Adjust Thread Group:
   - **Number of Threads (users):** 10  
   - **Ramp-up Period:** 5 seconds  
   - **Loop Count:** 5
4. Run the test:
   - Click the green ▶ (Start) button.
5. JMeter will write results to `results.jtl`.

---

## 📊 Generate HTML Report

To regenerate the HTML dashboard:

1. Go to: **Tools → Generate HTML report** in JMeter.
2. Set the following paths:

   - **Results file (csv or jtl):**  
     `performance-testing/results.jtl`

   - **user.properties file:**  
     JMeter default: `apache-jmeter-5.6.3/bin/user.properties`

   - **Output directory:**  
     `performance-testing/report`

3. Click **Generate report**.  
   JMeter will create/update the dashboard in the `report/` folder  
   (open `report/index.html` in a browser).

---

## ❗ Notes About Failures

This test targets a **public demo API**:

`https://api.escuelajs.co/api/v1/`

Under load, the API may return:
- `429 Too Many Requests`
- timeouts
- or other server-side errors.

Therefore, in the HTML report you may see **100% failed samples**.  
This is expected for a public, non-production-performance API and is useful to show:

- how JMeter reports failures  
- how error rate affects APDEX and statistics.

---

## 🛠 Tools Used

- **Apache JMeter 5.6.x**
- **Java JDK**
- **HTTP(S) Test Script Recorder (optional)**
- **Fake Store API (EscuelaJS)** – demo API for testing

---

## 👤 Author

GitHub : [@mohammad-alhassan](https://github.com/mohammad-alhassan)  
LinkedIn : [LinkedIn – Mohammad Alqadomi](https://www.linkedin.com/in/mohammad-alqadomi)
