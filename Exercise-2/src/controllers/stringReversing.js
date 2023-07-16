const reverseString = (req, res) => {
  const { string } = req.params.string;
  let stringReverse = "";
  const array = string.split(/\s+/);
  for (let index = array.length - 1; index >= 0; index--) {
    stringReverse = stringReverse + array[index] + " ";
  }
  res.send(stringReverse);
};
module.exports = {
  reverseString,
};
