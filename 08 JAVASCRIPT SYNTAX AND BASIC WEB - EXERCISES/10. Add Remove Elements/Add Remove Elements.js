function addRemoveElement(arr) {

    let array = [];

    for (let i = 0; i < arr.length; i++) {
        let tokens = arr[i].split(' ');
        let command = tokens[0];
        let num = Number(tokens[1]);

        if (command === 'add'){
            array.push(num);
        } else {
            array.splice(num, 1);
        }
    }
    for (let i = 0; i < array.length; i++) {
        console.log(array[i]);
    }
}


addRemoveElement(['add 3', 'add 5', 'remove 1', 'add 2']);