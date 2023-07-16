const express = require("express");
const router = express.Router();
const randomStringControllers = require("../controllers/randomString");

router.get("/random-string/:num", randomStringControllers.randomString);

module.exports = router;
