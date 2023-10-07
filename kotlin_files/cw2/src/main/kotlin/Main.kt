import kotlin.random.Random
fun main(args: Array<String>) {
   // first();
//    print("Podaj tekst: ")
//    val text = readln();
//    print("Podaj ilosc: ")
 //   val count = readln().toInt();
    //repeat(text,count);
   // withWhile();
   // withDoWhile()
    StepRek(10);
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
        println(text+" range")
    }
    for(i in 0 until count){
        println(text+"until i = $i")
    }
    for(i in 1 until count step 2){
        println(text+" i = $i")
    }
    for(i in 10 downTo  1){
        println("i = $i")
    }
}
fun withWhile(){
    var tempOk = "Jest zimno"
    var tempRoom = 10;
    while(tempOk=="Jest zimno"){
        tempRoom++;
        if(tempRoom==20){
            tempOk = "Teraz jest przyjemnie";
        }
        println("temperatura: $tempRoom odczucie: $tempOk")
    }
    //println("temperatura: $tempRoom odczucie: $tempOk")
}
fun withDoWhile(){
    var losowa = 0;
    var licznik = 0;
    do{
        losowa = Random.nextInt(0,20)
        if(losowa!=0) licznik++
        print(losowa.toString()+" ")
    }while (losowa!=0);
    println("\nIlosc elementow: $licznik")
    println(4.toDouble()/3)
}
fun StepRek(count:Int){
    if(count>0) StepRek(count-1)
    println(count)
}