// we read standard input line by line
func binary_search(list: [Int], item: Int) -> Int {
	var low = 0
	var high = list.count
	
	while low <= high {
		let mid = low + ((high - low) / 2)
		let guess = list[mid]
		
		if guess == item {
			return mid
		} else if guess > item {
			high = mid - 1
		} else {
			low = mid + 1
		}
	}
	return nil
}

var my_list = [1, 3, 5, 7, 9]
var ans = binary_search(list: my_list,item: 7)

if ans != nil {
	print(ans)
} else {
	print("None")
}