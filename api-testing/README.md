# 🧪 API Testing – Platzi Fake Store API

This folder contains a complete Postman API Testing project using the public **Platzi Fake Store API**.

The tests validate multiple API endpoints with different HTTP methods, including:
- ✔️ GET – List All Products  
- ✔️ GET – Single Product by ID  
- ✔️ POST – Create Product  
- ✔️ PUT – Update Product  
- ✔️ DELETE – Remove Product  
- ✔️ Login  
- ✔️ Invalid Login  
- ✔️ Categories  
- ✔️ File Upload  
- ✔️ Pagination  
- ✔️ Users  

---

## 📁 Included Files

### `Platzi Fake Store API.postman_collection.json`
The full Postman Collection exported directly from Postman.  
It contains:
- Request URLs  
- Body data  
- Automated Tests using `pm.test()`  
- Scripts for validating responses  

### `platzi-fakestore-environment.postman_environment.json`
Environment file containing required variables:

| Variable      | Value                                      |
|---------------|--------------------------------------------|
| Platzi_URL    | https://api.escuelajs.co/api/v1/           |
| Products_ID   | 1                                          |
| Category_ID   | 1                                          |
| validEmail    | john@mail.com                              |
| validPassword | changeme                                   |

---

## ▶️ How to Use

1. Import the **collection** into Postman  
2. Import the **environment**  
3. From the top-right corner, select:  
   **Environment → Platzi FakeStore API**
4. Run any request  
5. View tests under the **Tests** tab

---

## ▶️ Run API Tests using Newman (Optional)

If you install newman globally:

```bash
npm install -g newman


Run the collection:
newman run "Platzi Fake Store API.postman_collection.json" \
  -e "platzi-fakestore-environment.postman_environment.json" \
  -r cli,html
  

```
markdown

## 👨‍💻 Author

Mohammad Al-Hassan – Quality Assurance Engineer\
GitHub: [@mohammad-alhassan](https://github.com/mohammad-alhassan)  
LinkedIn: [LinkedIn – Mohammad Alqadomi](https://www.linkedin.com/in/mohammad-alqadomi)