import os
import re

TOTAL = {
    "2-pointer": 20,
    "Sliding Window": 20,
    "Slow & Fast Pointers": 15,
    "Kadane's Algo": 10,
    "Merge Interval": 13,
    "Prefix Sum": 20,
    "Binary Search": 20,
    "Stack Pattern": 20,
    "Backtracking": 20,
    "Recursion": 20,
    "Math (Common sense logic)": 10
}

tracker = """
<div align="center">

# 🚀 DSA Progress Tracker

<img src="https://readme-typing-svg.herokuapp.com?font=Orbitron&size=28&duration=3000&color=00F7FF&center=true&vCenter=true&width=700&height=100&lines=Solving+DSA+Everyday;Consistency+%3D+Success;LeetCode+Journey" />

<br>

<img src="https://img.shields.io/badge/Problems_Solved-AUTO_UPDATE-blueviolet?style=for-the-badge&logo=github" />

</div>

---

<div align="center">

<table>
<tr>
<th>🔥 Topic</th>
<th>📈 Progress</th>
</tr>
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

        tracker += f"""
<tr>
<td><b>{topic}</b></td>

<td>
<img src="https://progress-bar.xyz/{percent}/?title=Progress&width=250" />
</td>

</tr>
"""

tracker += f"""
</table>


</div>
"""

with open("README.md", "r", encoding="utf-8") as file:
    readme = file.read()

new_readme = re.sub(
    r'<!-- TRACKER_START -->(.*?)<!-- TRACKER_END -->',
    f'<!-- TRACKER_START -->\n{tracker}\n<!-- TRACKER_END -->',
    readme,
    flags=re.DOTALL
)

with open("README.md", "w", encoding="utf-8") as file:
    file.write(new_readme)

print("README updated successfully!")
