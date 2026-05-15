import os

TOTAL = {
"2-Pointer": 20,
"Merge Interval": 20,
"Prefix Sum": 20,
"Recursion": 20,
"Sliding Window": 20,
"Binary Search": 20,
"Slow & Fast Pointers": 20,
"Stack Pattern": 20,
"Backtracking": 20
}

content = """

<div align="center">

# 🚀 DSA Progress Tracker

<img src="https://readme-typing-svg.herokuapp.com?font=Orbitron&size=28&duration=3000&color=00F7FF&center=true&vCenter=true&width=700&height=100&lines=Solving+DSA+Everyday;Consistency+%3D+Success;LeetCode+Journey" />

<br>

<img src="https://img.shields.io/badge/Problems_Solved-AUTO_UPDATE-blueviolet?style=for-the-badge&logo=github" />

<br><br>

<img src="https://github-readme-stats.vercel.app/api?username=KunalP22-me&show_icons=true&theme=tokyonight" />

<br>

<img src="https://streak-stats.demolab.com?user=KunalP22-me&theme=tokyonight" />

</div>

---

<div align="center">

<table>
<tr>
<th>🔥 Topic</th>
<th>📈 Progress</th>
<th>🎯 Status</th>
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

    if percent >= 80:
        status = "🔥 Mastered"
    elif percent >= 50:
        status = "⚡ Learning"
    else:
        status = "🚀 Starting"

    content += f"""

<tr>
<td><b>{topic}</b></td>

<td>

<img src="https://progress-bar.xyz/{percent}/?title=Progress&width=250" />

</td>

<td>{status}</td>

</tr>
"""

content += f"""

</table>

<br>

# 🧠 Total Problems Solved: {totalSolved}

<br>

<img src="https://github-profile-trophy.vercel.app/?username=KunalP22-me&theme=algolia&no-frame=true&row=1&column=6" />

</div>
"""

with open("README.md", "w", encoding="utf-8") as file:
file.write(content)

print("README updated successfully!")
