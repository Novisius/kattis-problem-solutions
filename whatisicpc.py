# https://open.kattis.com/problems/whatisicpc

word1, word2, word3, word4 = map(str, input().split())

if word1[0]+word2[0]+word3[0]+word4[0] == "ICPC":
    print("1")
else:
    print("0")
