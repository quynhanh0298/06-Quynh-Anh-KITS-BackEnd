const express = require("express");
const router = express.Router();
const primeCheckingControllers = require("../controllers/primeChecking");

router.get("/prime-checking/:num", primeCheckingControllers.checkPrime);

module.exports = router;
