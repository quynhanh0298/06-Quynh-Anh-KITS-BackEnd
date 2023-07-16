const getMax = (req, res) => {
  const { array } = req.params.array;
  var intArray = array.split(" ");
  var max = Number(intArray[0]);
  for (let i = 1; i < intArray.length; i++) {
    if (Number(intArray[i]) > max) {
      max = Number(intArray[i]);
    }
  }
  res.send(max);
};
module.exports = {
  getMax,
};
