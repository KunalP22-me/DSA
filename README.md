# 📚 DSA – Daily Practice & Revision Repository

This repository contains my **daily Data Structures & Algorithms practice**, written mainly in **Java**, and organized topic-wise for **consistent learning, revision, and interview preparation**.

It is **not a theory-heavy repo** — the focus is on **problem-solving, patterns, and revision-ready notes** derived from actual practice files.

🔗 GitHub Repo: [https://github.com/KunalP22-me/DSA](https://github.com/KunalP22-me/DSA)

---

## 🎯 Purpose of This Repository

This repo is built to:

* Practice **DSA daily** in a structured way
* Maintain **clean topic-wise code**
* Enable **quick revision before interviews/exams**
* Track **consistency and progress** publicly on GitHub

---

## 📂 Repository Structure (Based on Actual Files)

```
DSA/
│
├── Arrays/
├── Strings/
├── TwoPointers/
├── BinarySearch/
├── LinkedList/
├── Stack/
├── Recursion/
├── DAY_29_REVISION_UPLOAD_READY.pdf
└── README.md
```

Each folder contains **solved problems + variations** written during daily practice.

---

## 🧠 DSA Patterns Used (Core of This Repo)

Rather than memorizing solutions, this repo focuses on **reusable patterns** 👇

| Pattern                 | Used In Folders | Typical Problems      |
| ----------------------- | --------------- | --------------------- |
| **Two Pointer**         | Arrays, Strings | Palindrome, Two Sum   |
| **Sliding Window**      | Arrays, Strings | Subarray / Substring  |
| **Binary Search**       | BinarySearch    | First–Last Position   |
| **Fast & Slow Pointer** | LinkedList      | Cycle Detection       |
| **Monotonic Stack**     | Stack           | Next Greater Element  |
| **Recursion Tree**      | Recursion       | Subsets, Permutations |

📌 Pattern references:

* [https://leetcode.com/tag/two-pointers/](https://leetcode.com/tag/two-pointers/)
* [https://leetcode.com/tag/sliding-window/](https://leetcode.com/tag/sliding-window/)
* [https://leetcode.com/tag/binary-search/](https://leetcode.com/tag/binary-search/)

---

## 📘 DAY 29 – Consolidated Revision Notes

The file **DAY_29_REVISION_UPLOAD_READY.pdf** is created directly from the code and concepts practiced in this repo.

### What it contains:

* ✔ Short & memorable revision points
* ✔ Tables for time complexity
* ✔ Common DSA templates
* ✔ List of **hard & frequently asked interview questions ⭐**

👉 Best suited for:

* Resume revision upload
* Last‑day interview prep
* Quick scanning (30–45 mins)

---

## 🧮 Common Templates Used

### Binary Search

```
mid = l + (r - l) / 2
```

### Two Pointer

```
l = 0; r = n - 1;
while (l < r) {
   // move pointers based on condition
}
```

### Kadane’s Algorithm

```
curr = Math.max(a[i], curr + a[i]);
ans  = Math.max(ans, curr);
```

---

## ⭐ Important Interview Problems Practiced

These problems (or variations) appear directly in this repo:

* ⭐ Longest Substring Without Repeating Characters
* ⭐ Search in Rotated Sorted Array
* ⭐ Merge Intervals
* ⭐ Reverse Linked List
* ⭐ Maximum Subarray (Kadane)

---

## 📊 Time Complexity Cheatsheet

| Operation      | Complexity |
| -------------- | ---------- |
| Array Access   | O(1)       |
| Binary Search  | O(log n)   |
| Sliding Window | O(n)       |
| Nested Loops   | O(n²)      |

---

## 🛠 How to Use This Repo (Recommended)

1. Pick one folder (e.g., `Arrays/`)
2. Solve + understand patterns
3. Revise using **DAY_29 PDF**
4. Revisit ⭐ hard problems regularly

---

## 👤 Author

**Kunal Kira**
Backend • Java • DSA • Interview Preparation

---

⭐ If you find this repository useful, consider starring it!
