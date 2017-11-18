function solve(arr) {
    function parseStudent(str) {
        let tokens = str.split(' -> ');

        // let name = tokens[0];
        // let age = tokens[1];
        // let grade = tokens[2];

        //-> това е вариант на горните три реда като ако е число го парсва ако ли не - Не го !!!
        let [name, age, grade] = tokens.map(a => !isNaN(a) ? Number(a) : a);

        let obj = {name: name, age: age, grade: grade};
        return obj;
    }

    let students = arr.map(parseStudent);

    students.forEach(student => {
        let studentStr =
            `Name: ${student.name}\n` +
            `Age: ${student.age}\n` +
            `Grade: ${student.grade.toFixed(2)}`;

        console.log(studentStr);
    })
}


let input = (['Pesho -> 13 -> 6.00',
    'Ivan -> 12 -> 5.57',
    'Toni -> 13 -> 4.90']);

solve(input);