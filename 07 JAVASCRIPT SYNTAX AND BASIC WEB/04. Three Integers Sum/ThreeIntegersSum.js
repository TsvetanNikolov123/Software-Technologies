function solution([arr]) {
    let array = arr.split(' ');
    let num1 = Number(array[0]);
    let num2 = Number(array[1]);
    let num3 = Number(array[2]);

    if (num1 + num2 === num3) {
        console.log(`${Math.min(num1, num2)} + ${Math.max(num1, num2)} = ${num3}`);
    } else if (num1 + num3 === num2){
        console.log(`${Math.min(num1, num3)} + ${Math.max(num1, num3)} = ${num2}`);
    } else if (num2+ num3 === num1){
        console.log(`${Math.min(num2, num3)} + ${Math.max(num2, num3)} = ${num1}`);
    } else {
        console.log('No');
    }
}

solution(['8 15 7']);
