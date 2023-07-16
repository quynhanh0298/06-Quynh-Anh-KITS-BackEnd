const express = require("express");
const router = express.Router();
const charCountInStringController = require("../controllers/charCountInString");

router.get("/char-count-in-string", charCountInStringController.countChar);

module.exports = router;
