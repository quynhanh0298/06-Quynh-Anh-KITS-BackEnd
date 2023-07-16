const reverseArray = (req, res) => {
  const { array } = req.params.array;
  const arraySize = array.length;
  const reversedArray = [];
  for (let i = 0; i < arraySize; i++) {
    reversedArray.push(array.pop());
  }
  res.send(reversedArray);
};
module.exports = {
  reverseArray,
};
