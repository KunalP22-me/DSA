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

<p align="center">

This repository is my **structured DSA execution system** built for mastering
**interview-level problem solving using pattern recognition**.

</p>

✔ Pattern-based problem solving
✔ Clean & optimized Java implementations
✔ Interview-focused questions
✔ Fast revision structure
✔ Consistency-driven learning system

Instead of solving random problems, this repo organizes questions based on **core interview patterns**.

---

# 🎯 Learning Goals

| Goal                   | Purpose                                |
| ---------------------- | -------------------------------------- |
| 🧠 Strong Fundamentals | Build deep understanding of DSA        |
| 📅 Consistency         | Solve problems daily                   |
| ⚡ Quick Revision       | Easy revision before interviews        |
| 📊 Public Tracking     | Measure progress                       |
| 🎯 Pattern Mastery     | Recognize interview patterns instantly |

---

# 🗂 Repository Structure

<table align="center">
<tr>
<th>📁 Folder</th>
<th>🧠 Concept</th>
<th>🎯 Purpose</th>
</tr>

<tr>
<td>🔗 <a href="https://github.com/KunalP22-me/DSA/tree/main/2-pointer">Two Pointers</a></td>
<td>Dual traversal</td>
<td>Pair problems & array optimization</td>
</tr>

<tr>
<td>🔗 <a href="https://github.com/KunalP22-me/DSA/tree/main/Sliding%20Window">Sliding Window</a></td>
<td>Dynamic window</td>
<td>Substring & subarray problems</td>
</tr>

<tr>
<td>🔗 <a href="https://github.com/KunalP22-me/DSA/tree/main/Slow%20%26%20Fast%20Pointers">Slow & Fast Pointer</a></td>
<td>Cycle detection</td>
<td>Linked list traversal</td>
</tr>

<tr>
<td>🔗 <a href="https://github.com/KunalP22-me/DSA/tree/main/Kadane's%20Algo">Kadane’s Algorithm</a></td>
<td>Maximum subarray</td>
<td>Optimization pattern</td>
</tr>

<tr>
<td>🔗 <a href="https://github.com/KunalP22-me/DSA/tree/main/Prefix%20Sum">Prefix Sum</a></td>
<td>Cumulative sums</td>
<td>Range queries</td>
</tr>

<tr>
<td>🔗 <a href="https://github.com/KunalP22-me/DSA/tree/main/Merge%20Interval">Merge Interval</a></td>
<td>Overlapping intervals</td>
<td>Interval merging</td>
</tr>

<tr>
<td>🔗 <a href="https://github.com/KunalP22-me/DSA/tree/main/Stack%20Pattern">Stack Pattern</a></td>
<td>LIFO structure</td>
<td>Next greater element & parentheses</td>
</tr>

</table>

---

# 🧠 Core Interview Patterns

| Pattern             | Used For                          |
| ------------------- | --------------------------------- |
| Two Pointer         | Pair problems, sorted arrays      |
| Sliding Window      | Subarray / substring optimization |
| Fast & Slow Pointer | Linked list cycles                |
| Kadane              | Maximum subarray                  |
| Prefix Sum          | Range queries                     |
| Merge Interval      | Overlapping intervals             |
| Stack               | Parentheses, next greater         |
| Monotonic Stack     | Next greater / smaller element    |

---

# ⚡ Algorithm Templates

## 👣 Two Pointer

```java
int l = 0;
int r = n - 1;

while (l < r) {

    if(condition){
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

for(int i = 1; i < arr.length; i++){

    curr = Math.max(arr[i], curr + arr[i]);
    ans = Math.max(ans, curr);

}
```

---

## ➕ Prefix Sum

```java
int[] prefix = new int[n];

prefix[0] = arr[0];

for(int i = 1; i < n; i++){
    prefix[i] = prefix[i-1] + arr[i];
}
```

Range Query

```java
int sum = prefix[R] - (L > 0 ? prefix[L-1] : 0);
```

---

## 📚 Stack Pattern

```java
Stack<Integer> stack = new Stack<>();

for(int i = 0; i < n; i++){

    while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
        stack.pop();
    }

    stack.push(i);

}
```

Common Uses

• Next Greater Element
• Next Smaller Element
• Valid Parentheses
• Daily Temperatures
• Histogram Problems

---

# ⭐ Must-Do Interview Problems

| Problem                                        | Pattern              |
| ---------------------------------------------- | -------------------- |
| Longest Substring Without Repeating Characters | Sliding Window       |
| Search in Rotated Sorted Array                 | Binary Search        |
| Merge Intervals                                | Interval Pattern     |
| Reverse Linked List                            | Pointer Manipulation |
| Maximum Subarray                               | Kadane               |
| Subarray Sum Equals K                          | Prefix Sum           |
| Next Greater Element                           | Stack                |
| Daily Temperatures                             | Monotonic Stack      |
| Valid Parentheses                              | Stack                |

---

# 📊 Complexity Cheatsheet

| Operation        | Complexity |
| ---------------- | ---------- |
| Array Access     | O(1)       |
| Binary Search    | O(log n)   |
| Sliding Window   | O(n)       |
| Prefix Sum Query | O(1)       |
| Stack Push / Pop | O(1)       |
| Nested Loops     | O(n²)      |

---

# 📈 Learning Progress

```
Two Pointer        ███████████████░ 90%
Sliding Window     ████████████░░░░ 75%
Kadane             ████████████████ 100%
Prefix Sum         █████████████░░░ 80%
Merge Interval     ████████████░░░░ 70%
Stack Pattern      ██████████░░░░░░ 60%
```

---

# 👨‍💻 Author

**Kunal**

Backend Developer • Java • DSA Enthusiast

Focused on mastering **problem-solving patterns for top tech interviews.**

---

# ⭐ Support

If this repository helps you:

⭐ Star the repo
📈 Follow the journey
🚀 Stay consistent

**Consistency > Motivation**
