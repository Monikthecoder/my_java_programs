# number = 5
# sum = 0
# for i in range(number):
#     sum+= i

# print(sum)


# def printsum(number):
#     sum =0
#     for i in range(number):
#         sum+=i
#     return "okay done this is string"

# print(printsum(5))

def printreverse(number):
    if(number < 2):
        return 1
    print(number)
    return printreverse(number-1)

def version2(number):
    if number < 1:
        return
    print(number)
    version2(number - 1)

version2(5)

def average(a,b,c):
    return (a+b+c) / 3

res = average(1,2,3)
# p = print(())

print(type(res))