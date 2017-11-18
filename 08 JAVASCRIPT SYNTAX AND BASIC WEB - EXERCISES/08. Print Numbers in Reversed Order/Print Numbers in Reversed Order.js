function reversedOrder(arr) {
    for (let i = arr.length - 1; i >= 0; i--) {
        console.log(arr[i]);
    }
    /*
    other way to do it is:
    console.log(arr.reverse().join('\n'));
    */
}

reversedOrder(['5','5.5','24','-3'])