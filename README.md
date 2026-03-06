<!-- ================================================= -->

<!-- =============== HERO SECTION ===================== -->

<!-- ================================================= -->

<h1 align="center">🚀 DSA System</h1>

<p align="center">
<b>Pattern Driven Data Structures & Algorithms Practice</b><br>
Java • Interview Preparation • Consistency Engine
</p>

<p align="center">

<img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java">
<img src="https://img.shields.io/badge/DSA-Practice-blue?style=for-the-badge">
<img src="https://img.shields.io/badge/Pattern-Based-success?style=for-the-badge">
<img src="https://img.shields.io/badge/Interview-Preparation-red?style=for-the-badge">
<img src="https://img.shields.io/badge/Consistency-50%2B%20Days-brightgreen?style=for-the-badge">

</p>

<p align="center">

🔗 <b>Repository</b> <a href="https://github.com/KunalP22-me/DSA">github.com/KunalP22-me/DSA</a>

</p>

---

# 🧠 System Description

```
DSA Learning Engine v1.0

Status        : Running
Language      : Java
Goal          : Interview Preparation
Architecture  : Pattern-Based Problem Solving
Tracking      : Daily Practice
```

This repository contains my **structured Data Structures & Algorithms learning system**.

Instead of random practice, problems are categorized into **core interview patterns** used in coding interviews.

This approach improves:

• Problem recognition
• Algorithm intuition
• Interview speed
• Revision efficiency

---

# 🎯 Learning Goals

| Goal                  | Description                 |
| --------------------- | --------------------------- |
| 🧠 Fundamentals       | Master core data structures |
| ⚡ Pattern Recognition | Identify algorithm patterns |
| 📅 Consistency        | Solve problems daily        |
| 📊 Progress Tracking  | Public growth tracking      |
| 🎯 Interview Prep     | Crack coding interviews     |

---

# 🏗 Repository Architecture

<table align="center">

<tr>
<th>Module</th>
<th>Concept</th>
<th>Purpose</th>
</tr>

<tr>
<td>📁 <b>Two Pointer</b></td>
<td>Dual traversal</td>
<td>Pair comparison & sorted arrays</td>
</tr>

<tr>
<td>📁 <b>Sliding Window</b></td>
<td>Dynamic window</td>
<td>Subarray / substring optimization</td>
</tr>

<tr>
<td>📁 <b>Fast & Slow Pointer</b></td>
<td>Cycle detection</td>
<td>Linked list problems</td>
</tr>

<tr>
<td>📁 <b>Kadane Algorithm</b></td>
<td>Maximum subarray</td>
<td>Optimal subarray problems</td>
</tr>

<tr>
<td>📁 <b>Prefix Sum</b></td>
<td>Cumulative sums</td>
<td>Range queries</td>
</tr>

<tr>
<td>📁 <b>Merge Interval</b></td>
<td>Interval merging</td>
<td>Overlapping ranges</td>
</tr>

<tr>
<td>📁 <b>Stack Pattern</b></td>
<td>LIFO structure</td>
<td>Next greater / parentheses</td>
</tr>

</table>

---

# 🧩 Core Interview Patterns

```
Two Pointer        → Pair & comparison problems
Sliding Window     → Continuous subarray optimization
Fast & Slow        → Cycle detection
Kadane             → Maximum subarray
Prefix Sum         → Range queries
Merge Interval     → Overlapping intervals
Stack              → Parentheses / next greater
Monotonic Stack    → Next greater / smaller
```

---

# ⚡ Algorithm Templates

## 👣 Two Pointer Template

```java
int left = 0;
int right = n - 1;

while(left < right){

    if(condition){
        left++;
    }else{
        right--;
    }

}
```

---

## ⚡ Kadane Algorithm

```java
int curr = arr[0];
int max = arr[0];

for(int i = 1; i < arr.length; i++){

    curr = Math.max(arr[i], curr + arr[i]);
    max = Math.max(max, curr);

}
```

---

## ➕ Prefix Sum

```java
int[] prefix = new int[n];

prefix[0] = arr[0];

for(int i = 1; i < n; i++){
    prefix[i] = prefix[i - 1] + arr[i];
}
```

Range Query

```java
int sum = prefix[r] - (l > 0 ? prefix[l-1] : 0);
```

---

## 📚 Stack Pattern

```java
Stack<Integer> st = new Stack<>();

for(int i = 0; i < n; i++){

    while(!st.isEmpty() && arr[st.peek()] < arr[i]){
        st.pop();
    }

    st.push(i);

}
```

Stack Problems:

```
Next Greater Element
Next Smaller Element
Valid Parentheses
Daily Temperatures
Largest Rectangle in Histogram
```

---

# ⭐ Must Solve Interview Problems

| Problem                                        | Pattern         |
| ---------------------------------------------- | --------------- |
| Longest Substring Without Repeating Characters | Sliding Window  |
| Search in Rotated Sorted Array                 | Binary Search   |
| Merge Intervals                                | Interval        |
| Reverse Linked List                            | Pointer         |
| Maximum Subarray                               | Kadane          |
| Subarray Sum Equals K                          | Prefix Sum      |
| Next Greater Element                           | Stack           |
| Daily Temperatures                             | Monotonic Stack |
| Valid Parentheses                              | Stack           |

---

# 📊 Complexity Cheatsheet

| Operation        | Complexity |
| ---------------- | ---------- |
| Array Access     | O(1)       |
| Binary Search    | O(log n)   |
| Sliding Window   | O(n)       |
| Prefix Sum Query | O(1)       |
| Stack Push/Pop   | O(1)       |
| Nested Loops     | O(n²)      |

---

# 📈 Progress Tracker

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

```
Name        : Kunal
Role        : Backend Developer
Language    : Java
Interest    : DSA / Problem Solving
Goal        : Top Tech Companies
```

---

# ⭐ Support

If this repository helps you:

```
⭐ Star the repository
📈 Follow the journey
🚀 Stay consistent
```

**Consistency > Motivation**
