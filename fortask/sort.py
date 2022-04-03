def part(arr, low, high):
    i = (low-1)         
    pivot = arr[high]     
 
    for j in range(low, high):
 
        if arr[j] <= pivot:
 
            i = i+1
            arr[i], arr[j] = arr[j], arr[i]
 
    arr[i+1], arr[high] = arr[high], arr[i+1]
    return (i+1)
 
def sorting(arr, low, high):
    if len(arr) == 1:
        return arr
    if low < high:
 
        pi = part(arr, low, high)
 
        sorting(arr, low, pi-1)
        sorting(arr, pi+1, high)
 
arr = [15, 2, 9, 9, 3, 5]
n = len(arr)
sorting(arr, 0, n-1)
print("Sorting:")
for i in range(n):
    print("%d" % arr[i])