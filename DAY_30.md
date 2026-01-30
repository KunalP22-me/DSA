# 📘 DSA Daily Study Log  
## Topic: Linked List (Java)

**📅 Date:** 30 January 2026  
**👨‍💻 Language:** Java  
**📚 Subject:** Data Structures & Algorithms  

---

## ✅ What I Studied Today

Today I studied **Linked Lists**, a fundamental data structure in DSA.  
I focused mainly on **Singly Linked Lists** and learned how nodes are connected using references instead of contiguous memory like arrays.

---

## 🧩 Concepts Covered

### 🔹 What is a Linked List?
- A linear data structure made up of **nodes**
- Each node contains:
  - **Data**
  - **Reference (pointer)** to the next node

### 🔹 Why Linked List?
- Dynamic size (no fixed length)
- Efficient insertion and deletion
- Better memory utilization compared to arrays

---

## 🏗️ Node Structure (Java)

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

---

## ⚙️ Operations Studied

### 1️⃣ Insertion
- Insert at beginning
- Insert at end
- Insert at specific position

### 2️⃣ Deletion
- Delete from beginning
- Delete from end
- Delete by value

### 3️⃣ Traversal
- Print all elements using a loop

### 4️⃣ Searching
- Linear search in linked list

### 5️⃣ Length of Linked List
- Counting total number of nodes

### 6️⃣ Reverse Linked List ⭐
- Iterative approach using three pointers:
  - `prev`
  - `curr`
  - `next`

### 7️⃣ Find Middle Node ⭐
- Slow & Fast pointer technique

### 8️⃣ Cycle Detection
- Floyd’s Cycle Detection Algorithm

---

## ⏱️ Time Complexity Overview

| Operation | Time Complexity |
|---------|----------------|
| Insert at Head | O(1) |
| Insert at End | O(n) |
| Delete | O(n) |
| Search | O(n) |
| Reverse | O(n) |

---

## 🧠 Key Learnings

- Linked Lists do **not** support random access
- Pointer manipulation is the core concept
- Two-pointer technique is extremely useful
- Very common in interviews and coding rounds

---

## 🚀 Next Plan

- Practice Linked List problems on LeetCode
- Learn Doubly & Circular Linked List
- Solve problems like:
  - Reverse linked list in groups
  - Merge two sorted linked lists
  - Detect & remove cycle

---

📌 *This file is part of my daily DSA learning journey and will be updated regularly.*

**— Kunal**
