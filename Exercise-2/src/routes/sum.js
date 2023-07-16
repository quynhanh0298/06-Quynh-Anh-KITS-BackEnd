const express = require("express");
const router = express.Router();
const sumControllers = require("../controllers/sum");

router.get("/sum-of-two-numbers", sumControllers.getSum);

module.exports = router;
