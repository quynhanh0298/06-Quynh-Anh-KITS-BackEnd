const express = require("express");
const router = express.Router();
const factorialControllers = require("../controllers/factorial");

router.get("/factorial/:num", factorialControllers.calculateFactorial);

module.exports = router;
