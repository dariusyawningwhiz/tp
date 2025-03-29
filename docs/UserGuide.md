# BudgetFlow User Guide

### Welcome to Budgetflow! 

Managing finances as a student can be overwhelming—keeping track of expenses, ensuring savings goals are met, and
understanding spending habits all require time and effort. **Budgetflow** is here to simplify this process for you!

Designed with students in mind, Budgetflow helps you **effortlessly track income and expenses, set savings goals, and 
gain insights into your financial habits.** Whether you're saving for your next trip, managing your daily coffee budget,
or planning your monthly expenses, Budgetflow ensures you stay in control.

With a **simple, command-based interface**, Budgetflow is lightweight, efficient, and fast—perfect for students who 
prefer typing over navigating complex apps. You can log your transactions, filter them based on category or date, and 
even compare monthly expenses at

---

### 1. Adding Income
**Description:** Adds a new income entry with a specified category, amount, and date.  
**Command:**
```plaintext
add category/<CATEGORY> amt/<AMOUNT> d/<DATE>
```
**Example:**
```plaintext
add category/Salary amt/1000.00 d/06-03-2025
```
**Output:**
```plaintext
Saving goal retrieved: 0.0
Income added: Salary, Amount: $1000.00, Date: 06-03-2025
```

---

### 2. Logging an Expense
**Description:** Logs a new expense with a category, description, amount, and date.  
**Command:**
```plaintext
log-expense category/<CATEGORY> desc/<DESCRIPTION> amt/<AMOUNT> d/<DATE>
```
**Example:**
```plaintext
log-expense category/Coffee desc/Coffee amt/3.50 d/06-03-2025
```
**Output:**
```plaintext
Saving goal retrieved: 0.0
Expense logged: Coffee | Coffee | $3.50 | 06-03-2025
```

---

### 3. Viewing All Expenses
**Description:** Displays a list of all logged expenses.  
**Command:**
```plaintext
view-all-expense
```
**Output:**
```plaintext
Expenses log:
1 | Coffee | Coffee | $3.50 | 06-03-2025
Total Expenses: $3.50
```

---

### 4. Listing All Income
**Description:** Shows all recorded income entries.  
**Command:**
```plaintext
list income
```
**Output:**
```plaintext
Income Log:
Salary | $1000.00 | 06-03-2025
Total Income: $1000.00
```

---

### 5. Filtering Income by Date
**Description:** Filters income entries within a specific date range.  
**Command:**
```plaintext
filter-income date from/<START_DATE> to/<END_DATE>
```
**Example:**
```plaintext
filter-income date from/01-03-2025 to/31-03-2025
```
**Output:**
```plaintext
Filtered Incomes by Date (01-03-2025 to 31-03-2025):
Salary | $1000.00 | 06-03-2025
```

---

### 6. Filtering Income by Amount
**Description:** Filters income entries within a specified amount range.  
**Command:**
```plaintext
filter-income amount from/<MIN_AMOUNT> to/<MAX_AMOUNT>
```
**Example:**
```plaintext
filter-income amount from/500 to/1500
```
**Output:**
```plaintext
Filtered Incomes by Amount (500.0 to 1500.0):
Salary | $1000.00 | 06-03-2025
```

---

### 7. Filtering Income by Category
**Description:** Filters income entries based on their category.  
**Command:**
```plaintext
filter-income category/<CATEGORY>
```
**Example:**
```plaintext
filter-income category/Salary
```
**Output:**
```plaintext
Filtered Incomes by Category (Salary):
Salary | $1000.00 | 06-03-2025
```

---

### 8. Deleting an Income Entry
**Description:** Removes an income entry from the record.  
**Command:**
```plaintext
delete-income <CATEGORY>
```
**Example:**
```plaintext
delete-income Salary
```
**Output:**
```plaintext
Saving goal retrieved: 0.0
Income deleted: Salary
```

---

### 9. Updating an Expense Entry
**Description:** Modifies an existing expense entry.  
**Command:**
```plaintext
update-expense index/<INDEX> category/<NEW_CATEGORY> desc/<NEW_DESCRIPTION> amt/<NEW_AMOUNT> d/<NEW_DATE>
```
**Example:**
```plaintext
update-expense index/1 category/drink desc/Coffee amt/4.00 d/06-04-2025
```
**Output:**
```plaintext
Expense updated at index 1: drink | Coffee | $4.00 | 06-04-2025. Total Expenses: $4.00
```

---

### 10. Comparing Expenses Between Two Months
**Description:** Compares total expenses between two specified months.  
**Command:**
```plaintext
compare <MONTH-YEAR> <MONTH-YEAR>
```
**Example:**
```plaintext
compare 03-2025 04-2025
```
**Output:**
```plaintext
Total expenses for 03-2025: $0.00
Total expenses for 04-2025: $4.00
```

---

### 11. Deleting an Expense Entry
**Description:** Removes an expense entry from the record.  
**Command:**
```plaintext
delete-expense <CATEGORY>
```
**Example:**
```plaintext
delete-expense Coffee
```
**Output:**
```plaintext
Saving goal retrieved: 0.0
Expense deleted: Coffee
```

---

### 12. Exiting the Application
**Description:** Safely exits the BudgetFlow application.  
**Command:**
```plaintext
exit
```
**Output:**
```plaintext
Goodbye!
```

## FAQ

**Q: Does BudgetFlow support multiple currencies?**  
A: Currently, BudgetFlow only supports tracking in one currency at a time.

**Q: Can I edit or delete an entry after logging it?**  
A: Yes! You can use the `update-expense` or `delete-expense` commands to modify or remove an expense entry. Similarly, you can use `delete-income` to remove an income entry.

---

## Command Summary

| **Command** | **Description** |
|------------|---------------|
| `add category/Salary amt/1000.00 d/06-03-2025` | Adds an income entry with the specified category, amount, and date. |
| `log-expense category/Coffee desc/Coffee amt/3.50 d/06-03-2025` | Logs an expense entry with details. |
| `view-all-expense` | Displays all logged expenses. |
| `list income` | Shows all recorded incomes. |
| `filter-income date from/01-03-2025 to/31-03-2025` | Filters income entries within a specific date range. |
| `filter-income amount from/500 to/1500` | Filters income entries within a specified amount range. |
| `filter-income category/Salary` | Filters income by category. |
| `delete-income Salary` | Deletes an income entry with the category *Salary*. |
| `update-expense index/1 category/drink desc/Coffee amt/4.00 d/06-04-2025` | Updates an expense entry at index 1. |
| `compare 03-2025 04-2025` | Compares total expenses between March and April 2025. |
| `delete-expense Coffee` | Deletes an expense entry with the description *Coffee*. |
| `exit` | Exits the application safely. |
