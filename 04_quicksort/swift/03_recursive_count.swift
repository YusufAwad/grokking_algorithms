func count(arr: [Int]) -> Int {
	if arr.count == 0 {
		return 0
	}
	var newArr = arr
	newArr.removeFirst()
	return 1 + count(arr: newArr)
}

print(count(arr: [1, 2, 3, 4]))
