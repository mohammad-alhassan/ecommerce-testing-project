# Test Plan – Demo E-commerce Website (Demoblaze)

## 1. Introduction
This test plan describes the testing approach for the Demo E-commerce Website:
https://www.demoblaze.com/

The objective is to verify core functionalities such as:
- Browsing products
- Viewing product details
- Adding products to cart
- Placing an order (checkout)
- Contact form

## 2. Scope

### In Scope
- Home page products listing
- Product details page
- Add to cart
- Place order (checkout using demo popup form)
- Contact form (Send message)
- Basic UI validation (labels, buttons, messages)

### Out of Scope
- Real payment gateway
- Email delivery validation
- Mobile responsiveness testing

## 3. Test Types
- Functional Testing
- UI/UX Validation
- Smoke Testing
- Regression Testing (on main flows)
- Basic Negative Testing (invalid inputs, empty fields)

## 4. Test Environment
- URL: https://www.demoblaze.com/
- Browser: Google Chrome (latest)
- OS: Windows 11
- Screen Resolution: 1920x1080 (or default)

## 5. Entry Criteria
- Website is accessible.
- Main pages (Home, Product, Cart) are loading without errors.

## 6. Exit Criteria
- All Critical and High priority test cases are passed.
- No open Critical or High severity defects.
- Medium/Low severity defects documented and accepted.

## 7. Risks & Assumptions
- Demo site may be slow or down sometimes.
- Test data (cart, orders) may be reset at any time.
- No control over backend or database.
