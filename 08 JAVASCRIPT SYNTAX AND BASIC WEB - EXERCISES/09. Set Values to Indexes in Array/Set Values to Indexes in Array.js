function valuesToIndexInArray(arr) {
    let count = Number(arr[0]);
    let resultArr = [];

    for (let i = 1; i < arr.length; i++) {
        let tokens = arr[i].split(' - ');
        let index = Number(tokens[0]);
        let values = Number(tokens[1]);

        resultArr[index] = values;
    }

    for (let i = 0; i < count; i++) {
        if (resultArr[i] === undefined) {
            console.log(0);
        } else {
          console.log(resultArr[i]);
        }
    }
}

valuesToIndexInArray(['3', '0 - 5', '1 - 6', '2 - 7']);