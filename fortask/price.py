my_dict={'Dave' : '001' , 'Ava': '002' , 'Joe': '003'}
print("All keys")
for x in my_dict:
    print(x)       #prints the keys
print("All values")
for x in my_dict.values():
    print(x)       #prints values
print("All keys and values")
for x,y in my_dict.items():
    print(x, ":" , y)    


new_list = []

while my_dict:
    minimum = my_dict[0]  # arbitrary number in list 
    for x in my_dict: 
        if x < minimum:
            minimum = x
    new_list.append(minimum)
    my_dict.remove(minimum)    

print new_list