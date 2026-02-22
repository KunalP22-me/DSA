<!-- ================= HEADER ================= -->

<h1 align="center">🚀 DSA – Daily Practice & Smart Revision</h1>

<p align="center">
<b>Pattern-Driven Data Structures & Algorithms Practice in Java</b><br>
Built for Interviews • Placements • Consistent Growth
</p>

<p align="center">

<img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java">
<img src="https://img.shields.io/badge/Focus-DSA-blue?style=for-the-badge">
<img src="https://img.shields.io/badge/Practice-Daily-success?style=for-the-badge">
<img src="https://img.shields.io/badge/Interview-Ready-red?style=for-the-badge">

</p>

<p align="center">
🔗 <b>Repository:</b> <a href="https://github.com/KunalP22-me/DSA">DSA by Kunal</a>
</p>

---

# 📌 About This Repository

This is my **structured DSA learning system** — not theory dumping.

✔ Real practice problems  
✔ Pattern-based solutions  
✔ Clean Java implementations  
✔ Fast revision structure  
✔ Interview-focused topics  

Built to train **problem-solving thinking**, not memorization.

---

# 🎯 Goals

🧠 Build strong DSA intuition  
📅 Maintain daily consistency  
⚡ Revise quickly before interviews  
📊 Track progress publicly  
🎯 Master high-frequency patterns  

---

# 🗂 Repository Structure (Clickable Navigation)

<table>
<tr>
<th>Folder</th>
<th>Concept</th>
<th>Purpose</th>
</tr>

<tr>
<td>📁 <a href="https://github.com/KunalP22-me/DSA/tree/main/2-pointer">TwoPointers</a></td>
<td>Dual traversal logic</td>
<td>Pair search, palindrome, optimization</td>
</tr>

<tr>
<td>📁 <a href="https://github.com/KunalP22-me/DSA/tree/main/Sliding%20Window">SlidingWindow</a></td>
<td>Dynamic subarray control</td>
<td>Substring & range problems</td>
</tr>

<tr>
<td>📁 <a href="https://github.com/KunalP22-me/DSA/tree/main/Slow%20%26%20Fast%20Pointers">Slow & Fast Pointer</a></td>
<td>Cycle detection</td>
<td>Linked list loops</td>
</tr>

<tr>
<td>📁 <a href="https://github.com/KunalP22-me/DSA/tree/main/Kadane's%20Algo">Kadane’s Algorithm</a></td>
<td>Max / Min subarray</td>
<td>Optimization problems</td>
</tr>

<tr>
<td>📁 <a href="https://github.com/KunalP22-me/DSA/tree/main/Prefix%20Sum">Prefix Sum</a></td>
<td>Cumulative sums</td>
<td>Range queries & subarray sums</td>
</tr>

<tr>
<td>📁 <a href="https://github.com/KunalP22-me/DSA/tree/main/Merge%20Interval">Merge Interval</a></td>
<td>Overlapping Array</td>
<td>Range, 2D array</td>
</tr>

</table>

---

# 🧠 Core Interview Patterns

| Pattern | Use Case |
|---|---|
| Two Pointer | Pair relationships |
| Sliding Window | Continuous ranges |
| Binary Search | Sorted search space |
| Fast & Slow Pointer | Cycles |
| Kadane | Optimal subarray |
| Prefix Sum | Range queries |
| Monotonic Stack | Next greater element |
| Recursion Tree | Combinatorics |

---

# ⚡ Quick Algorithm Templates

## 🔎 Binary Search
```java
int mid = l + (r - l) / 2;
```

---

## 👣 Two Pointer
```java
int l = 0, r = n - 1;
while (l < r) {
    // move pointers
}
```

---

## ⚡ Kadane’s Algorithm
```java
int curr = arr[0];
int ans = arr[0];

for (int i = 1; i < arr.length; i++) {
    curr = Math.max(arr[i], curr + arr[i]);
    ans = Math.max(ans, curr);
}
```

---

## ➕ Prefix Sum
```java
int[] prefix = new int[n];

prefix[0] = arr[0];

for (int i = 1; i < n; i++) {
    prefix[i] = prefix[i - 1] + arr[i];
}
```

Range Sum:
```java
int sum = prefix[R] - (L > 0 ? prefix[L - 1] : 0);
```

---

# ⭐ Must-Do Interview Problems

✔ Longest Substring Without Repeating Characters  
✔ Search in Rotated Sorted Array  
✔ Merge Intervals  
✔ Reverse Linked List  
✔ Maximum Subarray  
✔ Subarray Sum Equals K  

---

# 📊 Complexity Cheatsheet

| Operation | Time |
|---|---|
| Array Access | O(1) |
| Binary Search | O(log n) |
| Sliding Window | O(n) |
| Prefix Sum Query | O(1) |
| Nested Loops | O(n²) |

---

# 📈 Learning Progress

Two Pointer  
██████████████░░ 85%

Sliding Window  
████████████░░░░ 70%

Kadane  
████████████████ 100%

Prefix Sum  
████████████░░░░ 75%

Binary Search  
██████████░░░░░░ 60%

---

# 👨‍💻 Author

**Kunal**  
Backend Developer • Java • DSA  

---

# ⭐ Support

If this repository helps you:

👉 Star the repo  
👉 Follow the journey  
👉 Stay consistent  

Consistency beats intensity.
