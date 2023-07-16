const randomString = (req, res) => {
  const { num } = req.params.num;
  const uppercaseCharArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  const lowercaseCharArray = uppercaseCharArray.toLowerCase();
  const numberArray = "0123456789";
  const stringForRandom = uppercaseCharArray + lowercaseCharArray + numberArray;
  let randomString = "";
  for (let i = 0; i < num; i++) {
    randomString += stringForRandom.charAt(
      Math.floor(Math.random() * stringForRandom.length)
    );
  }
  res.send(randomString);
};
module.exports = {
  randomString,
};
