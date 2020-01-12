func selectionSort(arr: [Int]) -> [Int] {
	let n = arr.count
	var newarr = arr
	
	for i in 0..<n-1 {
		var min_idx = i
		for j in i+1..<n { 
			if newarr[j] < newarr[min_idx] {
				min_idx = j
			}
		}
		let temp = newarr[min_idx] 
		newarr[min_idx] = newarr[i]
		newarr[i] = temp
	}
	return newarr
}

var myarr = [5, 3, 6, 2, 10]
print(selectionSort(arr: myarr))

