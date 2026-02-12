# 🚀 DSA – Daily Practice & Smart Revision Repository

Welcome to my **Data Structures & Algorithms (DSA)** journey 📈  
This repository documents my **daily problem-solving practice**, primarily in **Java**, organized for **clarity, consistency, and interview-ready revision**.

This is **not a theory dump** ❌ — it’s a **hands-on, pattern-driven DSA repo** built from real practice problems and revisions.

🔗 **GitHub Repository:** [DSA by Kunal](https://github.com/KunalP22-me/DSA)

---

## 🎯 Why This Repository Exists

I built this repository to:

* 🧠 Practice **DSA daily** with discipline  
* 🗂 Keep **clean, topic-wise solutions**  
* ⚡ Enable **fast revision before interviews & exams**  
* 📊 Publicly track **consistency and growth** on GitHub  

If you’re preparing for **internships, placements, or interviews**, this repo is meant to be **skimmed, revised, and reused**.

---

## 📂 Repository Structure (Current Focus)

This repository currently focuses on **high-frequency interview patterns** 👇

| Folder | Focus Area |
|---|---|
| 📁 TwoPointers | Pair problems, palindrome, optimizations |
| 📁 SlidingWindow | Subarray & substring based problems |
| 📁 Slow & Fast Pointer | Cycle detection, loops, repeated behavior |
| 📁 Kadane’s Algorithm | Maximum / minimum subarray, product, frequency |
| 📁 Prefix Sum | Range sum queries, cumulative arrays, subarray sums |

> 📌 These patterns solve a **large percentage of interview DSA questions**. The repository will expand gradually.

---

## 🧠 Core DSA Patterns Used (Interview-Centric)

Instead of memorizing hundreds of questions, this repo focuses on **reusable patterns** that repeatedly appear in interviews.

| Pattern | Where Used | Typical Problems |
|---|---|---|
| **Two Pointer** | Arrays, Strings | Palindrome, Two Sum |
| **Sliding Window** | Arrays, Strings | Longest Substring |
| **Binary Search** | Sorted Arrays | First–Last Position |
| **Fast & Slow Pointer** | Linked List | Cycle Detection |
| **Monotonic Stack** | Stack | Next Greater Element |
| **Kadane’s Algorithm** | Arrays | Maximum Subarray |
| **Prefix Sum** | Arrays | Range Sum, Subarray Sum = K |
| **Recursion Tree** | Recursion | Subsets, Permutations |

🔗 Learn patterns here:

* https://leetcode.com/tag/two-pointers/  
* https://leetcode.com/tag/sliding-window/  
* https://leetcode.com/tag/binary-search/  

---

## 🧮 Common DSA Templates (Quick Recall)

### 🔎 Binary Search
```java
mid = l + (r - l) / 2;
```

---

### 👣 Two Pointer
```java
int l = 0, r = n - 1;

while (l < r) {
   // move pointers based on condition
}
```

---

### ⚡ Kadane’s Algorithm (Maximum Subarray)
```java
int curr = arr[0];
int ans = arr[0];

for (int i = 1; i < arr.length; i++) {
    curr = Math.max(arr[i], curr + arr[i]);
    ans = Math.max(ans, curr);
}
```

**Used for:**
* Maximum subarray sum
* Minimum subarray (variation)
* Maximum product subarray (variation)

---

### ➕ Prefix Sum (Range Sum Optimization)
```java
int[] prefix = new int[n];

prefix[0] = arr[0];

for (int i = 1; i < n; i++) {
    prefix[i] = prefix[i - 1] + arr[i];
}
```

**Range sum query (L to R):**
```java
int sum = prefix[R] - (L > 0 ? prefix[L - 1] : 0);
```

**Used for:**
* Range sum queries
* Subarray sum = K
* Cumulative frequency
* Difference arrays

---

## ⭐ Must-Do Interview Problems

These problems (or their variations) are **practiced directly in this repo** and are commonly asked:

* ⭐ Longest Substring Without Repeating Characters  
* ⭐ Search in Rotated Sorted Array  
* ⭐ Merge Intervals  
* ⭐ Reverse Linked List  
* ⭐ Maximum Subarray (Kadane)  
* ⭐ Subarray Sum Equals K (Prefix Sum)  

---

## 📊 Time & Space Complexity Cheatsheet

| Operation | Complexity |
|---|---|
| Array Access | O(1) |
| Binary Search | O(log n) |
| Sliding Window | O(n) |
| Prefix Sum Query | O(1) |
| Nested Loops | O(n²) |

---

## 🛠 How to Use This Repository (Recommended Flow)

1. 📂 Open a topic folder (example: TwoPointers / Prefix Sum)  
2. 🧠 Understand the **pattern**, not just the solution  
3. 📘 Revise using notes or practice PDFs  
4. ⭐ Re-practice hard problems regularly  

---

## 👤 Author

**Kunal**  
Backend • Java • DSA • Interview Preparation

---

⭐ If this repository helped you, consider **starring ⭐ the repo** — it motivates consistent learning!
