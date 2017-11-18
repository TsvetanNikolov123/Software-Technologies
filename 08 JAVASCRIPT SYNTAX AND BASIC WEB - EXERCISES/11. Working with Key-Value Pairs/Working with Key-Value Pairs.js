function keyValuePairs(arr) {
    let input = [];
    for (let i = 0; i < arr.length - 1; i++) {
        let tokens = arr[i].split(' ');
        let key = tokens[0];
        let value = tokens[1];

        input[key] = value;
    }

    let matchKey = arr[arr.length - 1];

    if (input[matchKey] === undefined) {
        console.log("None")
    } else {
        console.log(input[matchKey])
    }
}

keyValuePairs([
    '3 test',
    '3 test1',
    '4 test2',
    '4 test3',
    '4 test5',
    '4'
]);
