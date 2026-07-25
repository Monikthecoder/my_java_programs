str = "This is it"

# str = str.lower()
count = 0

for i in str:
    if(i == 'i' or i == 'u' or i == 'e' or i == 'a' or i == 'o'):
        count+=1

print(f'the count of wovels in the string is {count}')