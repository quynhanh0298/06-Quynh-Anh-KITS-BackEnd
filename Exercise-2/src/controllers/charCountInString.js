const countChar = (req, res) => {
  const { string, char } = req.query;
  var count = 0;
  for (let i = 0; i < string.length; i++) {
    if (char == string.charAt(i).toLowerCase()) {
      count++;
    }
  }
  res.send(count);
};
module.exports = {
  countChar,
};
