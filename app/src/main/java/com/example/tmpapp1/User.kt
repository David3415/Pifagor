package com.example.tmpapp1

class User(
    var name: String? = null,
    var id: String? = null,
    var age: Int? = null
) {
    fun addAge(years: Int) {
        age = age?.plus(years)
    }
    fun printUserInfo(){

    }
}