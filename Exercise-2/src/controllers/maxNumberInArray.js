const getMax = (req, res) => {
  const { array } = req.params.array;
  var intArray = array.split(" ");
  var max = intArray[0];
  for (let i = 1; i < arrayQuestion3.length; i++) {
    if (arrayQuestion3[i] > max) {
      max = arrayQuestion3[i];
    }
  }
  return max;
  res.send(Number(num1) + Number(num2));
};
module.exports = {
  getMax,
};
