package com.example.cw1

fun main(){
    println("Hello from Kotlin");
    val firstname = "Franek"
    val lastname = "Kimono"
    val age:Int = 34;
    println(wizytowka("Franek","Kimono"));
    println(wizytowka(firstname,lastname,age));
    val a = 12;
    println("a = $a")
}


fun wizytowka(firstname:String,lastname:String,age:Int=18):String{
    return "imie: $firstname \nnazwisko: $lastname \nwiek: $age";
}