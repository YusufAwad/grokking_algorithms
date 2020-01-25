function max(arr){
	if (arr.length == 2){
		return arr[0] > arr[1] ? arr[0] : arr[1];
	}
	var temp = arr[0];
	arr.splice(0,1)
	var sub_max = max(arr)
	return temp > sub_max ? temp : sub_max;
} 

console.log(max([1, 2, 3, 4]));