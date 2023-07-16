const express = require("express");
const router = express.Router();
const palindromeCheckingController = require("../controllers/palindromeChecking");

router.get(
  "/check-palindrome/:array",
  palindromeCheckingController.checkPalindrome
);

module.exports = router;
