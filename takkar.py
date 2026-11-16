# Difficulty at date of completion: 1.0 (easy)
# https://open.kattis.com/problems/takkar

trump = int(input())
kim = int(input())

if trump < kim:
    print("FAKE NEWS!")
elif trump > kim:
    print("MAGA!")
else:
    print("WORLD WAR 3!")
