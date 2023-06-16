const express = require("express");
const multer = require("multer");
const fs = require("fs");

const app = express();
const port = 8000;

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

app.get("/", function (req, res) {
  res.sendFile(__dirname + "/index.html");
});

// SET STORAGE
var storage = multer.diskStorage({
  destination: function (req, file, cb) {
    cb(null, "uploads");
  },
  filename: function (req, file, cb) {
    cb(null, "output.json");
  },
});

var upload = multer({ storage: storage });

app.post("/uploadfile", upload.single("myFile"), (req, res, next) => {
  const file = req.file;
  if (!file) {
    const error = new Error("Please upload a file");
    error.httpStatusCode = 400;
    return next(error);
  }
  res.send(file);
});

app.get("/country/:name", (req, res) => {
  const countryName = req.params.name;
  console.log(countryName);
  if (fs.existsSync("./uploads/output.json")) {
    const data = JSON.parse(fs.readFileSync("./uploads/output.json"));
    console.log(data);
    let result = [];
    const imports = data.children[0].children[0].children;
    console.log(imports);
    for (let i = 0; i < imports.length; i++) {
      for (let j = 0; j < imports[i].children.length; j++) {
        if (imports[i].children[j].country == countryName) {
          result.push(imports[i].children[j]);
        }
      }
    }
    const exports = data.children[0].children[1].children;
    console.log(exports);
    for (let i = 0; i < exports.length; i++) {
      for (let j = 0; j < exports[i].children.length; j++) {
        if (exports[i].children[j].country == countryName) {
          result.push(exports[i].children[j]);
        }
      }
    }
    if (result.length == 0) {
      res.send("Country not found!");
    } else {
      res.send(result);
    }
  } else {
    res.send("Database not available!");
  }
});

app.listen(port, () => {
  console.log(`Listening on port ${port}`);
});
