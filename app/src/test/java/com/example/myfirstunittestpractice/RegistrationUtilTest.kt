package com.example.myfirstunittestpractice

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun emptyUsername_return_false() {
         val result = RegistrationUtil.validateRegistrationInput(
             "",
             "12345",
             "12345"
         )
        assertThat(result).isFalse()
    }

    @Test
    fun validUsernameAndCorrectlyRepeatedPassword_return_true() {
         val result = RegistrationUtil.validateRegistrationInput(
             "Ariya",
             "12345",
             "12345"
         )
        assertThat(result).isTrue()
    }

    @Test
    fun usernameAlreadyExist_return_false() {
         val result = RegistrationUtil.validateRegistrationInput(
             "Bahram",
             "12345",
             "12345"
         )
        assertThat(result).isFalse()
    }

    @Test
    fun emptyPassword_return_false() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Ariya",
            "",
            "12345"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun emptyConfirmedPassword_return_false() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Ariya",
            "12345",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun inCorrectlyConfirmedPassword_return_false() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Ariya",
            "12345",
            "123456efweda"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun lessThan2DigitsPassword_return_false() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Ariya",
            "9sdfsdf",
            "9sdfsdf"
        )
        assertThat(result).isFalse()
    }


}