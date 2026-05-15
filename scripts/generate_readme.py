import os

TOTAL = {
    "2-pointer": 20,
    "Sliding Window": 20,
    "Binary Search": 20,
    "Backtracking": 20,
    "Merge Interval": 20,
    "Stack Pattern": 20,
    "Prefix Sum": 20,
    "Kadane's Algo": 20,
    "Slow & Fast Pointers": 20,
    "Recursion": 20
}

def progress_bar(percent):
    filled = int(percent / 10)
    empty = 10 - filled
    return "🟩" * filled + "⬜" * empty

content = """
<h1 align="center">🚀 DSA Progress Tracker</h1>

<p align="center">
<img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&duration=2000&pause=1000&color=00F700&center=true&vCenter=true&width=500&lines=Solving+DSA+Daily;Consistency+Matters;LeetCode+Journey" />
</p>

---

| Topic | Progress |
|-------|----------|
"""

totalSolved = 0

for topic, total in TOTAL.items():

    if os.path.exists(topic):

        solved = len([
            f for f in os.listdir(topic)
            if f.endswith(".java")
        ])

        totalSolved += solved

        percent = int((solved / total) * 100)

        bar = progress_bar(percent)

        topicName = topic.replace("Pointer", " Pointer")

        content += f"| {topicName} | {bar} {percent}% |\n"

content += f"\n## Total Problems Solved: {totalSolved}\n"

with open("README.md", "w", encoding="utf-8") as file:
    file.write(content)

print("README updated!")
