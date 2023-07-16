const express = require("express");
const router = express.Router();
const arrayReversingController = require("../controllers/arrayReversing");

router.get("/reverse-an-array/:array", arrayReversingController.reverseArray);

module.exports = router;
