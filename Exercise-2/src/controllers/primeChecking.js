const checkPrime = (req, res) => {
  const num = req.params.num;
  if (num < 2) {
    res.send("Not a Prime");
  }
  if (num == 2) {
    res.send("Prime");
  }
  for (let i = 2; i <= num; i++) {
    if (num % i == 0) {
      res.send("Not a Prime");
    }
  }
  res.send("Prime");
};
module.exports = {
  checkPrime,
};
