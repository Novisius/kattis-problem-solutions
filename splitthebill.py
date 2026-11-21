# https://open.kattis.com/problems/splitthebill

int1, int2 = map(int, input().split())
num = 0

for i in range(0,int2):
    num += int(input())

if num%int1 == 0:
    print("1")
else:
    print("0")
