const express = require("express");
const router = express.Router();
const stringReversingControllers = require("../controllers/stringReversing");

router.get("/factorial/:string", stringReversingControllers.reverseString);

module.exports = router;
