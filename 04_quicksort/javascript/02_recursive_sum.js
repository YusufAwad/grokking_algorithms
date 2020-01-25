function sum(arr){
	if (arr.length == 0){
		return 0;
	}
	let temp = arr[0];
	arr.splice(0,1)
	return temp + sum(arr);
} 

console.log(sum([1, 2, 3, 4]));