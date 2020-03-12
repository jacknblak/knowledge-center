"""
Type error python doesn't recognizes when you mix other types
with string so specifically you nee to typeCast it to string
"""
age = 30
message = "Happy "+str(age)+"rd Birthday"
print(message)