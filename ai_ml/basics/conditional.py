age = -1

if age > 18 : 
    print("you can vote")
elif age < 18 and age > 0 :
    print("things needed to change")
else:
    print("enter the age")


number = 2

if number % 2 == 0 :
    print("number is even")
else:
    print("this is odd number")

# color= input("enter the color : ")

# color = color.lower()

# match color:
#     case "green" :
#         print("go green")
#     case "Green":
#         print("go Green")


# i  = 10

# while i > 0 :
#     print("the ith is" , i)
#     i = i-1

str = "acca"
newstr = ""

for i in str[::-1]:
    newstr += newstr.join(i)

if newstr == str:
    print('this is palindrome')
else:
    print("this is not palindrome")

numbers = [1,2,4,4,4]

print(numbers)

numbers = set(numbers)

print(numbers)
