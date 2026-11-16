# Failed once. Succeeded once I declared the division as an int and did the math outside of the print statement.
# https://open.kattis.com/problems/fifa

num = int(input())
imp = int(input())

years = int(num / imp)

year = 2022 + years

print(year)
