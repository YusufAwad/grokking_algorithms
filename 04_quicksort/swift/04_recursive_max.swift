func max(list: [Int]) -> Int {
	if list.count == 2 {
		return list[0] > list[1] ? list[0] : list[1]
	}
	var newlist = list
	let temp = list[0]
	newlist.removeFirst()
	let sub_max = max(list: newlist)
	return temp > sub_max ? temp : sub_max
}

print(max(list: [1, 2, 3, 4]))
