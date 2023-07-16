const express = require("express");
const router = express.Router();
const sumController = require("../controllers/sum");

router.get("/sum-of-two-numbers", sumController.getSum);

module.exports = router;
