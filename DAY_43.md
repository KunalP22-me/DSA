Here is your **cleaned + corrected Markdown (.md) version** of the notes.
You can copy this into a file named **`prefix-sum-notes.md`** and use it for revision.

---

# 📘 Prefix Sum — Complete Notes

## 🔹 What is Prefix Sum?

**Prefix Sum = Running Sum (Previous Sum stored).**

It is a technique where we precompute cumulative sums so that any **subarray sum can be calculated in O(1)** time.

---

## 🔹 Example

Given an array:

```
arr = [a, b, c, d]
```

Prefix sum at index `i` = sum of all elements **before it**.

```
prefix[0] = 0
prefix[1] = a
prefix[2] = a + b
prefix[3] = a + b + c
prefix[4] = a + b + c + d
```

---

## 🔹 Why Do We Add Extra `0` at Start?

This helps simplify formulas and avoid edge cases.

```
prefix[0] = 0   ← very important
```

---

## 🔹 Prefix Sum Formula (Correct One ✅)

Your note had a small mistake — this is the **correct formula**:

```
prefix[i] = prefix[i - 1] + arr[i - 1]
```

**NOT**

```
prefix[i] = prefix[i-1] + arr[i]   ❌ (Wrong)
```

Because prefix is shifted by one index.

---

## 🔹 How to Find Subarray Sum Using Prefix

To find sum from index `L` to `R`:

```
Sum(L, R) = prefix[R + 1] - prefix[L]
```

✅ This works in **O(1)** time.

---

## 🔹 Where Prefix Sum is Used

### 1️⃣ Subarray Sum Problems

Find:

* Sum of any subarray
* Number of subarrays with sum = K

Technique:

```
Prefix Sum + HashMap
```

Example condition:

```
prefix[j] - prefix[i] = K
```

---

### 2️⃣ Subarray Sum Divisible by K

Condition:

```
(prefix[j] - prefix[i]) % K == 0
```

Used with:

```
Prefix Sum + HashMap (store remainders)
```

---

### 3️⃣ Pivot / Equilibrium Index

Find index where:

```
Left Sum == Right Sum
```

Using prefix:

```
left  = prefix[i]
right = prefix[n] - prefix[i+1]
```

---

### 4️⃣ Shortest Subarray with Sum ≥ K (Hard)

Used in advanced problems like Leetcode 862.

Technique:

```
Prefix Sum + Monotonic Deque
```

---

### 5️⃣ Range Sum Queries (Very Important)

When many queries ask:

```
What is sum from L to R ?
```

Prefix makes each query:

```
O(1) instead of O(N)
```

---

### 6️⃣ Count of Range Sum (Hard Problems)

Used in:

* Advanced interview questions

Technique:

```
Prefix Sum + Merge Sort (on prefix array)
```

---

## 🔹 When NOT to Use Sliding Window

Your note said:

> "Negative No → Prefix Sum"

✔ Correct idea, but clarified:

| Case                 | Use Sliding Window?   |
| -------------------- | --------------------- |
| All Positive Numbers | ✅ Yes                 |
| Contains Negatives   | ❌ No → Use Prefix Sum |

Sliding window **fails with negative values**.

---

## 🔹 Suffix Sum (Reverse Version)

Suffix sum stores sum from right side.

```
suffix[i] = suffix[i + 1] + arr[i]
```

Used less often but helpful in:

* Right-side calculations
* Some DP problems

---

## 🔹 Time Complexity

| Operation    | Time |
| ------------ | ---- |
| Build Prefix | O(N) |
| Each Query   | O(1) |

---

## 🔹 Space Complexity

```
O(N) extra space
```

---

## 🔹 Quick Example

```
arr = [2, 4, 1, 3]
```

Build prefix:

```
prefix = [0, 2, 6, 7, 10]
```

Find sum from index `1` to `3` → `[4,1,3]`

```
Sum = prefix[4] - prefix[1]
     = 10 - 2
     = 8
```

---

## 🔹 Key Interview Insight ⭐

Prefix Sum converts:

```
Repeated SUM calculation → Constant time lookup
```

That is why it is used in:

* Subarrays
* Range queries
* Hashing problems
* Advanced optimizations
