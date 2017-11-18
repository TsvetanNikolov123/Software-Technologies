function multiplyOrDivideNumber(nums) {
    let firstNum = Number(nums[0]);
    let secondNum = Number(nums[1]);

    if (firstNum === secondNum || firstNum < secondNum) {
        let sum = firstNum * secondNum;
        return sum;
    } else {
        let sum = firstNum / secondNum;
        return sum;
    }
}