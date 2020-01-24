func countdown(i: Int) -> Int{
	if i > 0 {
		print(i)
	}
	if i <= 0 {
		return i
	}
	else {
		return countdown(i: i-1)
	}
}

print(countdown(i: 5))