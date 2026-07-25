''' 
dictionary -> key= vlaue (pair)
'''

dict = {
    "name" : "makvana monik",
    "marks" : [100,99,98,97],
    3.14 : "PI"
}

# print(dict['marks']/len(dict['marks']))

print(f"total marks of student are : {dict['marks']}")
print(dict[3.14])
def calculate_percentage(dict):
    marks = dict['marks']
    sum=0
    for i in marks:
        sum +=i
    return sum / len(marks)

print(calculate_percentage(dict))



'''
METHODS OD DICTIONARY STARTS FROM HERE 
'''

# print(dict.keys())

keys = dict.keys() # you can change them to the list and then iterate through it to search a key

keys = list(keys)

for i in keys:
    if i == 'name' :
        print("key found")
        break


# how to print the whole dictionary with the all values here's how

dict_values = dict.values()

print(dict_values)
print(type(dict_values))  # checking the type



# return (key,val) pairs

dict_items = dict.items()

print(f"this is {type(dict_items)} and {dict_items}")