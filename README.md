<!-- ================= HEADER ================= -->

<h1 align="center">🚀 DSA – Daily Practice & Smart Revision</h1>

<p align="center">
<b>Pattern-Driven Data Structures & Algorithms Practice in Java</b><br>
Built for Interviews • Placements • Consistent Growth
</p>

<p align="center">

<img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java">
<img src="https://img.shields.io/badge/Focus-DSA-blue?style=for-the-badge">
<img src="https://img.shields.io/badge/Practice-Pattern%20Based-success?style=for-the-badge">
<img src="https://img.shields.io/badge/Interview-Preparation-red?style=for-the-badge">
<img src="https://img.shields.io/badge/Consistency-50%2B%20Days-brightgreen?style=for-the-badge">

</p>

<p align="center">
🔗 <b>Repository:</b> <a href="https://github.com/KunalP22-me/DSA">DSA by Kunal</a>
</p>

---

# 📌 About This Repository

This repository is my **structured DSA execution system** focused on **real implementation and pattern recognition**.

Instead of randomly solving questions, problems are organized by **core algorithmic patterns** used in technical interviews.

✔ Pattern-based problem solving  
✔ Clean & optimized Java implementations  
✔ Interview-focused questions  
✔ Quick revision friendly structure  
✔ Consistency-driven learning system  

This repository is built to improve **problem-solving intuition**, not memorization.

---

# 🎯 Goals

🧠 Strengthen DSA fundamentals  
📅 Maintain long-term consistency  
⚡ Fast revision before interviews  
📊 Public progress tracking  
🎯 Master high-frequency interview patterns  

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
<td>Dual traversal</td>
<td>Pair problems & array optimization</td>
</tr>

<tr>
<td>📁 <a href="https://github.com/KunalP22-me/DSA/tree/main/Sliding%20Window">SlidingWindow</a></td>
<td>Dynamic window</td>
<td>Substring & subarray problems</td>
</tr>

<tr>
<td>📁 <a href="https://github.com/KunalP22-me/DSA/tree/main/Slow%20%26%20Fast%20Pointers">Slow & Fast Pointer</a></td>
<td>Cycle detection</td>
<td>Linked list traversal problems</td>
</tr>

<tr>
<td>📁 <a href="https://github.com/KunalP22-me/DSA/tree/main/Kadane's%20Algo">Kadane’s Algorithm</a></td>
<td>Maximum subarray</td>
<td>Optimization pattern</td>
</tr>

<tr>
<td>📁 <a href="https://github.com/KunalP22-me/DSA/tree/main/Prefix%20Sum">Prefix Sum</a></td>
<td>Cumulative sums</td>
<td>Range & subarray queries</td>
</tr>

<tr>
<td>📁 <a href="https://github.com/KunalP22-me/DSA/tree/main/Merge%20Interval">Merge Interval</a></td>
<td>Overlapping intervals</td>
<td>2D range merging problems</td>
</tr>

<tr>
<td>📁 <a href="https://github.com/KunalP22-me/DSA/tree/main/Stack%20Pattern">Stack Pattern</a></td>
<td>LIFO structure</td>
<td>Next greater element, parentheses, monotonic stack</td>
</tr>

</table>

---

# 🧠 Core Interview Patterns

| Pattern | Use Case |
|------|------|
| Two Pointer | Pair comparison & sorted arrays |
| Sliding Window | Continuous subarrays / substrings |
| Fast & Slow Pointer | Cycle detection in linked lists |
| Kadane | Maximum sum subarray |
| Prefix Sum | Range queries |
| Merge Interval | Overlapping ranges |
| Stack | LIFO problems |
| Monotonic Stack | Next greater/smaller element |

---

# ⚡ Quick Algorithm Templates

---

## 👣 Two Pointer

```java
int l = 0, r = n - 1;

while (l < r) {
    if(condition) {
        l++;
    } else {
        r--;
    }
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

Range Query

```java
int sum = prefix[R] - (L > 0 ? prefix[L - 1] : 0);
```

---

## 📚 Stack Template

```java
Stack<Integer> stack = new Stack<>();

for(int i = 0; i < n; i++){

    while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
        stack.pop();
    }

    stack.push(i);
}
```

Used for:

- Next Greater Element
- Next Smaller Element
- Monotonic Stack problems
- Histogram problems

---

## 📈 Monotonic Stack Pattern

```java
Stack<Integer> stack = new Stack<>();

for(int i = 0; i < n; i++){

    while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
        stack.pop();
    }

    stack.push(i);
}
```

---

# ⭐ Must-Do Interview Problems

✔ Longest Substring Without Repeating Characters  
✔ Search in Rotated Sorted Array  
✔ Merge Intervals  
✔ Reverse Linked List  
✔ Maximum Subarray  
✔ Subarray Sum Equals K  
✔ Next Greater Element  
✔ Daily Temperatures  
✔ Valid Parentheses  

---

# 📊 Complexity Cheatsheet

| Operation | Time Complexity |
|------|------|
| Array Access | O(1) |
| Binary Search | O(log n) |
| Sliding Window | O(n) |
| Prefix Sum Query | O(1) |
| Stack Push/Pop | O(1) |
| Nested Loops | O(n²) |

---

# 📈 Learning Progress

Two Pointer  
███████████████░ 90%

Sliding Window  
████████████░░░░ 75%

Kadane  
████████████████ 100%

Prefix Sum  
█████████████░░░ 80%

Merge Interval  
████████████░░░░ 70%

Stack Pattern  
██████████░░░░░░ 60%

---

# 👨‍💻 Author

**Kunal**

Backend Developer • Java • DSA Enthusiast

Focused on mastering **problem-solving patterns for top tech interviews**.

---

# ⭐ Support

If this repository helps you:

⭐ Star the repository  
👨‍💻 Follow the journey  
📈 Stay consistent

**Consistency > Motivation**
