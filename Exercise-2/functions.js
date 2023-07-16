// 1. Calculate the sum of two numbers
const sum = (num1, num2) => {
  return num1 + num2;
};

// 2. Check if a number is prime
const isPrime = (num) => {
  if (num < 2) {
    return false;
  }
  if (num == 2) {
    return true;
  }
  for (let i = 2; i <= num; i++) {
    if (num % i == 0) {
      return false;
    }
  }
  return true;
};

console.log(isPrime(2));

// 3. Find max number of a number array
const arrayQuestion3 = [5, 4, 300, 7, 9, 10];
const maxOfNumberArray = () => {
  var max = arrayQuestion3[0];
  for (let i = 1; i < arrayQuestion3.length; i++) {
    if (arrayQuestion3[i] > max) {
      max = arrayQuestion3[i];
    }
  }
  return max;
};

console.log(maxOfNumberArray());

// 4. Reverse an array
const arrayQuestion4 = [1, 4, 5, 3, 12, "saaa"];
const arrayQuestion4Size = arrayQuestion4.length;
const arrayQuestion4Reverse = [];
for (let i = 0; i < arrayQuestion4Size; i++) {
  arrayQuestion4Reverse.push(arrayQuestion4.pop());
}

console.log(arrayQuestion4Reverse);

// 5. Check if an array is a palindrome array
// Palindrome number: 11, 131, 1331, 75357. Palindrome number is number when we reverse it, it will be the same
const arrayQuestion5 = [11, 131, 1331, 75357, 12];
const isPalindromeArray = () => {
  for (let i = 0; i < arrayQuestion5.length; i++) {
    for (let j = 0; j < String(arrayQuestion5[i]).length; j++) {
      if (
        String(arrayQuestion5[i]).charAt(j) !=
        String(arrayQuestion5[i]).charAt(
          String(arrayQuestion5[i]).length - 1 - j
        )
      ) {
        return false;
      }
    }
  }
  return true;
};

console.log(isPalindromeArray());

// 6. Count of a char in string
const stringQuestion6 = "This is the string of question number 6";
console.log(stringQuestion6.length);
const question6 = (char) => {
  var count = 0;
  for (let i = 0; i < stringQuestion6.length; i++) {
    if (char == stringQuestion6.charAt(i).toLowerCase()) {
      count++;
    }
  }
  console.log(count);
};
question6("t");

// 7. Create an random string with given string length
const stringLength = 7;
const uppercaseCharArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
const lowercaseCharArray = uppercaseCharArray.toLowerCase();
const numberArray = "0123456789";
const stringForRandom = uppercaseCharArray + lowercaseCharArray + numberArray;
let randomString = "";
for (let i = 0; i < stringLength; i++) {
  randomString += stringForRandom.charAt(
    Math.floor(Math.random() * stringForRandom.length)
  );
}
console.log(randomString);

// 8. Calculate the factorial of a number
// const calFactorialOfNumber = (num) => {
//     if (num < 0) {
//         console.log("Not available the factorial of this number!")
//         return
//     }
//     if (num = 0) {
//         console.log(1)
//         return
//     }
//     let factorialNumber = 1
//     for (let i = 1; i <= num; i++) {

//     }
//  }

// 17.
const string = "This         is a random string";
let stringReverse = "";
const array = string.split(/\s+/);
console.log(array);
for (let index = array.length - 1; index >= 0; index--) {
  stringReverse = stringReverse + array[index] + " ";
}
console.log(stringReverse);
