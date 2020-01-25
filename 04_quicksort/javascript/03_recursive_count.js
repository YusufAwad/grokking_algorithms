function count(arr){
	if (arr.length == 0){
		return 0;
	}
	arr.splice(0,1)
	return 1 + sum(arr);
} 

console.log(count([1, 2, 3, 4]));