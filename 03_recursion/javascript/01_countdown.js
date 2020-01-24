function countdown(i) {
	console.log(i);
	if (i <= 0){
		return i;
	}
	else {
		return countdown(i-1);
	}
}

countdown(5);