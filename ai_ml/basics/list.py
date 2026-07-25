'''
lists are muttable and values can be accesed by indexes 
'''

list = [99,89,67,93,92]

for index in range(len(list)):
    print(list[index])


print(list[:1:-1])

#  methods 

list.insert(0,40)

list.sort(reverse=True)

print(list)

list.reverse()

print(list)


string = "thisisit"

char_list = [char for char in string]

print(char_list)
new_string = ""
for i in string:
    # new_string += string[i]
    if i == 't':
        new_string += i.upper()
    else:
        new_string += i

print(new_string)

def add_item(item, box=[]):
    box.append(item)
    return box

print(add_item(1))
print(add_item(2))


import copy
original = [[1, 2], [3, 4]]
shallow = original[:]      # or list(original)
deep = copy.deepcopy(original)

shallow[0][0] = 99
deep[0][0] = 100

print(original)


a = [1, 2, 3]
b = [1, 2, 3]
c = a

print(a == b)  # True
print(a is b)  # ???
print(a is c)  # ???

numbers = [1,4,10,23]

target = 10

def find_number(target,numbers):
    index = 0

    for i in numbers:
        
        if i == target:
            return index
        index+=1
    return -1

res = find_number(target,numbers)

print(res)