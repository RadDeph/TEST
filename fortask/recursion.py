def rec(i):
  if(i>0):
    result = i+rec(i-1)
    print(result)
  else:
    result = 0
  return result
print("\n\nResult is")
rec(5)