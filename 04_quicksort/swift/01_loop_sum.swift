func sum(arr: [Int]) -> Int {
	var total = 0	
	for i in arr{
		total += i
	}	
	return total
}

print(sum(arr: [1, 2, 3, 4]))
