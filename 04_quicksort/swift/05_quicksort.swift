func quicksort(newArray: [Int])->Array<Int> {
	
	var less = [Int]()
	var equal = [Int]()
	var greater = [Int]()

	if newArray.count > 1{
		let pivot = newArray[0]
		
		for x in newArray {
			if x < pivot{
				less.append(x)
			}
			if x == pivot {
				equal.append(x)
			}
			if x > pivot {
				greater.append(x)
			}
		}
		return (quicksort(newArray:less)+equal+quicksort(newArray:greater))
		
	}
		
	else {
		return newArray
	}
	
}

print(quicksort(newArray: [10, 5, 2, 3]))