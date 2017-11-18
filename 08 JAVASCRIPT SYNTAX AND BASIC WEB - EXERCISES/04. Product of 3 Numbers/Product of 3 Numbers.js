function productOf3Numbers(nums) {
    let count = 0;
    for (let i = 0; i < nums.length; i++){
        if (nums[i].startsWith('-')) {
            count++;
        }
        if(nums[i] === '0'){
            return 'Positive';
            break;
        }
    }
    if (count === 1 || count === 3){
        return 'Negative';
    } else {
        return 'Positive';
    }
}