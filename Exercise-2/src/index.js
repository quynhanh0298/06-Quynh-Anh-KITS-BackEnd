const express = require("express");
const app = express();
const port = 3000;
const sum = require("./routes/sum");
const primeChecking = require("./routes/primeChecking");
const maxNumberInArray = require("./routes/maxNumberInArray");
const arrayReversing = require("./routes/arrayReversing");
const palindromeChecking = require("./routes/palindromeChecking");
const charCountInString = require("./routes/charCountInString");
const randomString = require("./routes/randomString");
const factorial = require("./routes/factorial");
const stringReversing = require("./routes/stringReversing");

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

app.use("/api/v1/", sum);
app.use("/api/v1/", primeChecking);
app.use("/api/v1/", maxNumberInArray);
app.use("/api/v1/", arrayReversing);
app.use("/api/v1/", palindromeChecking);
app.use("/api/v1/", charCountInString);
app.use("/api/v1/", randomString);
app.use("/api/v1/", factorial);
app.use("/api/v1/", stringReversing);

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
