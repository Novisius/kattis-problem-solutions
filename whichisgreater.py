# https://open.kattis.com/problems/whichisgreater
# I learned how to parse a single line of input if they are ints in python on this problem.

int1, int2 = map(int, input().split())

if int1>int2:
    print("1")
else:
    print("0")
