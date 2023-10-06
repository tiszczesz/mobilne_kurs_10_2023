package com.example.cw1
import java.util.Scanner
fun main() {
    println("Hello from Kotlin");
    val firstname = "Franek"
    val lastname: String;
    lastname = "ddddd";
    // lastname = "ddddd"
    var age: Int = 34;
    age = 45;
    //age = "45";
    println(wizytowka("Franek", "Kimono"));
    println(wizytowka(firstname, lastname, age));
    val a = 12;
    println("a = $a")
    test()
}
fun test() {
    try {
        print("Podaj imie: ")
        val sc = Scanner(System.`in`)
        val firstname = sc.next();
        print("Podaj nazwisko: ")
        val lastname = sc.next();
        print("Podaj wiek: ")
        val age = sc.nextInt();
        val result = if (age < 18) "malolat" else "pelnoletni";
        println("Twoje imie: $firstname nazwisko: $lastname twoj wiek: $age $result")
        println(
            "Twoje imie: $firstname nazwisko: $lastname twoj wiek:"
                    + " $age ${if (age < 18) "malolat" else "pelnoletni"}"
        )
    } catch (e: Exception) {
        println(e.message)
    }

}

fun wizytowka(firstname: String, lastname: String, age: Int = 18): String {
    return "imie: $firstname \nnazwisko: $lastname \nwiek: $age";
}