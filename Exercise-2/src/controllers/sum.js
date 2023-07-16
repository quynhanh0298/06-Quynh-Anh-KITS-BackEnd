const getSum = (req, res) => {
  const { num1, num2 } = req.query;
  res.send(Number(num1) + Number(num2));
};
module.exports = {
  getSum,
};
