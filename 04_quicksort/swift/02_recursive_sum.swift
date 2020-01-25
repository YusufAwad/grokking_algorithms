// we read standard input line by line
func sum(arr: [Int]) -> Int {
	if arr.count == 0{
		return 0
	}
	let temp = arr[0]
	var newArr = arr
	newArr.removeFirst()
	return temp + sum(arr: newArr)
}

print(sum(arr: [1, 2, 3, 4]))
