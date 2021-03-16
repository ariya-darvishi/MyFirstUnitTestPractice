package com.example.myfirstunittestpractice

object RegistrationUtil {

    private val existingUsers = listOf("behroz", "bahram", "parmida", "raika")

    /**
     * the input is not valid if...
     * ...the userName/password is empty
     * ...the userName is already taken
     * ...the confirmed password is not the same as the real password
     * ...the password contains less than 2 digits
     */


    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        return true
    }


}