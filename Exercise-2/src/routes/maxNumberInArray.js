const express = require("express");
const router = express.Router();
const maxNumInArrayController = require("../controllers/maxNumInArrayController");

router.get("/max-num-in-array/:array", maxNumInArrayController.getMax);

module.exports = router;
