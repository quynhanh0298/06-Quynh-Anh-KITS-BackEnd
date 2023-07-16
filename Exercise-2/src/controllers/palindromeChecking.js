const checkPalindrome = (req, res) => {
  const { array } = req.params.array;
  const intArray = array.split(" ");
  for (let i = 0; i < intArray.length; i++) {
    for (let j = 0; j < String(intArray[i]).length; j++) {
      if (
        String(intArray[i]).charAt(j) !=
        String(intArray[i]).charAt(String(intArray[i]).length - 1 - j)
      ) {
        res.send("Not a palindrome!");
      }
    }
  }
  res.send("Palindrome");
};
module.exports = {
  checkPalindrome,
};
