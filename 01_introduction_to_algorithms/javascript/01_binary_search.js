function binary_search(list, item){
    // low and high keep track of which part of the list you'll search in.
    let low = 0;
    let high = list.length;
    
    // While you haven't narrowed it down to one element ...
    while(low <= high){
        // ... check the middle element
        let mid = Math.floor(low + ((high - low) / 2));
        let guess = list[mid];
        // Found the item.
        if(guess == item){
            return mid;
        } else if (guess > item) { // The guess was too high.
            high = mid - 1;
        } else { // The guess was too low.
            low = mid + 1;
        }
    }
    // Item doesn't exist
    return null;
}

var my_list = [1, 3, 5, 7, 9];
console.log(binary_search(my_list,3));
