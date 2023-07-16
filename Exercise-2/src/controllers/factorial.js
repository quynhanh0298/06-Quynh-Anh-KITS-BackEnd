const calculateFactorial = (req, res) => {
  const { num } = req.params.num;
  if (num < 0) {
    res.send("Not available the factorial of this number!");
  }
  if ((num = 0)) {
    res.send(1);
  }
  let factorialNumber = 1;
  for (let i = 1; i <= num; i++) {
    factorialNumber *= i;
  }
  res.send(factorialNumber);
};
module.exports = {
  calculateFactorial,
};
