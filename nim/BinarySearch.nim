type
    arr = array[5,int]
let arr1 : arr = [1,2,3,4,5]

proc BinarySearch(arr1:arr,k:int): bool =
    var L = 0
    var r = 4
    while L < r:
        let tmp = (L+r) div 2
        if arr1[tmp] == k:
            return true
        if arr1[tmp] > k:
            r = tmp - 1
        else:
            L = tmp + 1 
    return false
var r = BinarySearch(arr1,10)
echo r