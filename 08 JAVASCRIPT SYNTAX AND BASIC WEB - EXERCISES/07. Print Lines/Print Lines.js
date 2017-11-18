function printLines(inputLines) {
    for (let i = 0; i < inputLines.length; i++) {
        if (inputLines[i] === 'Stop') {
            break;
        }
        console.log(inputLines[i]);
    }
}

printLines(['Line 1','Line 2','Line 3','Stop'])