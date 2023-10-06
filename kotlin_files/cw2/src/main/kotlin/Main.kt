fun main(args: Array<String>) {
   // first();
    print("Podaj tekst: ")
    val text = readln();
    print("Podaj ilosc: ")
    val count = readln().toInt();
    repeat(text,count);
}

fun first() {
    try {
        print("Podaj wiek: ")
        val age = readln().toInt();
        if (age < 0) println("Przed urodzeniem")
        else if (age < 18) println("maloletni")
        else if (age < 150) println("pelnoletni")
        else println("juz nie zyjesz")
    } catch (e: Exception) {
        println(e.message)
    }
}
fun second(){
    print("Podaj wiek: ")
    val age = readln().toInt();
    when(age){
        in Int.MIN_VALUE..0 -> println("Przed urodzeniem")
        //(age<18) ->println("Przed urodzeniem")
        in 1..17 -> println("maloletni")
        in 18..150 -> println("pelnoletni")
        else -> println("juz nie zyjesz")
    }
}

fun repeat(text:String,count:Int){
    for (i in 0..count){
        println(text)
    }
}