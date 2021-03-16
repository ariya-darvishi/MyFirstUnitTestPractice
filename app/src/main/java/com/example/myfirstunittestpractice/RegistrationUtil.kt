package com.example.myfirstunittestpractice

object RegistrationUtil {

    private val existingUsers = listOf("Behroz", "Bahram", "Parmida", "Raika")

    /**
     * the input is not valid if...
     * ...the userName/password is empty
     * ...the userName is already taken
     * ...the confirmed password is not the same as the real password
     * ...the password contains less than 2 digits
     */


    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()){
            return false
        }
        if (username in existingUsers){
            return false
        }
        if (password != confirmedPassword){
            return false
        }
        if (password.count { it.isDigit() } < 2){
            return false
        }
        return true
    }


}