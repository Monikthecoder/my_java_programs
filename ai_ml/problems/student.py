'''
Student Enrolments

Given a list of tuples with info(name, subject):

. list all unique course

. list students enrolled in English

· create dictionary (student, set of courses)
'''

info =[
("Alice", "Math"),
("Bob", "Science"),
("Alice", "Science"),
("Charlie", "Math"),
("Bob", "Math"),
("Alice", "English"),
("Charlie", "English")
]

# all unique courses

unique_courses = set()

# for i in range(len(info)):
    # unique_courses.add(info[i][1])
    
for tuple in info:
    unique_courses.add(tuple[1])
print(unique_courses)

# print students who have enrolled in the English

# for i in range(len(info)):
#     if info[i][1] == "English":
#         print(info[i][0])

for i in info:
    if i[1] == "English":
        print(i[0])

dict = {}

for name,courses in info:
    if dict.get(name) == None:
        dict.update({name:set()})
        dict[name].add(courses)
    else:
        dict[name].add(courses)
print(dict)


# do not forget in pyhon you have many types that works and then you can loop over it do not forget how to access and update them even think differently to update and add them by variables too