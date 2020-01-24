func fact(x: Int) -> Int {
	if x == 0 {
		return 1
	}

	else {
		return x * fact(x:x-1)
	}
}

print(fact(x:5))
