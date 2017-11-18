function multipleValuesForKey(arr) {
    let input = [];
    let duplicateEntry = arr[arr.length-1];

    for (let i = 0; i < arr.length - 1; i++) {
        let token = arr[i].split(' ');
        let command = token[0];
        input[command] = token[1];

        if (duplicateEntry === command) {
            console.log(input[command]);
        }
    }

    if(duplicateEntry in input){

    }
    else{
        console.log("None")
    }
}

let input = ('3 bla', '3 alb', '2');
/*
let input = ('key value\n' +
    'key eulav\n' +
    'test tset\n' +
    'key').split('\n');
*/
multipleValuesForKey(input);

// Или тези два елемента извън скоупа на фукшъна са еквивалентни на
// multipleValuesForKey([ 'key value', 'key eulav', 'test tset', 'key' ]);
// като това ни е входа на задачата!!!



