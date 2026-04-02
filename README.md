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

# 💻 System Overview

```bash
> Initializing DSA learning engine...

✔ Pattern Recognition System Loaded
✔ Interview Question Dataset Connected
✔ Java Implementation Module Ready
✔ Progress Tracking Enabled

System Status: ACTIVE
```

This repository is my **structured execution system for mastering Data Structures & Algorithms**.

Instead of solving random problems, questions are organized by **core interview patterns used by top tech companies.**

---

# 🧠 Learning Objectives

| Module                 | Purpose                          |
| ---------------------- | -------------------------------- |
| 🧠 Fundamentals        | Strengthen DSA foundations       |
| ⚡ Pattern Recognition  | Identify problem types instantly |
| 📅 Consistency Engine  | Daily problem solving            |
| 📊 Progress Tracking   | Measure growth                   |
| 🎯 Interview Readiness | Prepare for coding interviews    |

---

# 🗂 Repository Architecture

<table align="center">

<tr>
<th>📁 Module</th>
<th>⚙ Pattern</th>
<th>💡 Usage</th>
</tr>

<tr>
<td>🔗 <a href="https://github.com/KunalP22-me/DSA/tree/main/2-pointer">Two Pointers</a></td>
<td>Dual traversal</td>
<td>Pair problems, array optimization</td>
</tr>

<tr>
<td>🔗 <a href="https://github.com/KunalP22-me/DSA/tree/main/Sliding%20Window">Sliding Window</a></td>
<td>Dynamic window</td>
<td>Substring & subarray problems</td>
</tr>

<tr>
<td>🔗 <a href="https://github.com/KunalP22-me/DSA/tree/main/Slow%20%26%20Fast%20Pointers">Fast & Slow Pointer</a></td>
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
<td>Overlapping ranges</td>
<td>Interval merging problems</td>
</tr>

<tr>
<td>🔗 <a href="https://github.com/KunalP22-me/DSA/tree/main/Stack%20Pattern">Stack Pattern</a></td>
<td>LIFO</td>
<td>Next greater, parentheses</td>
</tr>

<tr>
<td>🔗 <a href="https://github.com/KunalP22-me/DSA/tree/main/Binary%20Search">Binary Search</a></td>
<td>Divide & conquer</td>
<td>Search in sorted arrays</td>
</tr>

</table>

---

# 🧩 Core Interview Patterns

```
Two Pointer         → Pair comparison
Sliding Window      → Continuous subarray problems
Fast & Slow Pointer → Cycle detection
Kadane Algorithm    → Maximum subarray
Prefix Sum          → Range queries
Merge Interval      → Overlapping intervals
Stack               → Parentheses / next greater
Monotonic Stack     → Next greater / smaller element
Binary Search      → Search in sorted space
```

---

# ⚡ Algorithm Templates

### 👣 Two Pointer

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

### ⚡ Kadane Algorithm

```java
int curr = arr[0];
int ans = arr[0];

for(int i = 1; i < arr.length; i++){

    curr = Math.max(arr[i], curr + arr[i]);
    ans = Math.max(ans, curr);

}
```

---

### ➕ Prefix Sum

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

### 📚 Stack Pattern

```java
Stack<Integer> stack = new Stack<>();

for(int i = 0; i < n; i++){

    while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
        stack.pop();
    }

    stack.push(i);

}

```

---

### 🔍 Binary Search

```java
int l = 0;
int h = n - 1;

while(l <= h){

    int m = l + (h - l) / 2;

    if(arr[m] == target){
        return m;
    }
    else if(arr[m] < target){
        l = m + 1;
    }
    else{
        h = m - 1;
    }
}
return -1;

```



Common Uses

```
Next Greater Element
Next Smaller Element
Valid Parentheses
Daily Temperatures
Largest Rectangle in Histogram
```

---

# ⭐ Must-Solve Interview Problems

| Problem                                        | Pattern          |
| ---------------------------------------------- | ---------------- |
| Longest Substring Without Repeating Characters | Sliding Window   |
| Search in Rotated Sorted Array                 | Binary Search    |
| Merge Intervals                                | Interval Pattern |
| Reverse Linked List                            | Pointer          |
| Maximum Subarray                               | Kadane           |
| Subarray Sum Equals K                          | Prefix Sum       |
| Next Greater Element                           | Stack            |
| Daily Temperatures                             | Monotonic Stack  |
| Valid Parentheses                              | Stack            |

---

# 📊 Complexity Cheatsheet

| Operation        | Time Complexity |
| ---------------- | --------------- |
| Array Access     | O(1)            |
| Binary Search    | O(log n)        |
| Sliding Window   | O(n)            |
| Prefix Sum Query | O(1)            |
| Stack Push / Pop | O(1)            |
| Nested Loops     | O(n²)           |

---

# 📈 Progress Tracker

```bash
Two Pointer        ███████████████░ 90%
Sliding Window     ████████████░░░░ 75%
Kadane             ████████████████ 100%
Prefix Sum         █████████████░░░ 80%
Merge Interval     ████████████░░░░ 70%
Stack Pattern      ██████████░░░░░░ 60%
Binary Search      ████████░░░░░░░░ 50%
```

---

# 🧑‍💻 Author

```
Name        : Kunal
Role        : Backend Developer
Language    : Java
Focus       : Data Structures & Algorithms
Goal        : Crack top tech interviews
```

---

# ⭐ Support

If this repository helps you:

```
⭐ Star the repository
📈 Follow the journey
🚀 Stay consistent
```

> **Consistency > Motivation**
