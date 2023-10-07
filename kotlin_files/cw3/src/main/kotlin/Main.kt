fun main(args: Array<String>) {
   //cw1()
   // cw2()
    cw3Lists()
}
fun cw1(){
    print("Podaj a: ")
    val a = readln().toInt();
    print("Podaj b: ")
    val b = readln().toInt();
    println("Rekurencyjnie NWD($a,$b) = ${NWDRek(a,b)}")
    println("Iteracyjnie NWD($a,$b) = ${NWDIter(a,b)}")
}
fun cw2(){
    //uzycie funkcji
    val t1:Array<Int> = arrayOf(4,6,7,8,9,78)
    val t2 = arrayOf("sdfsfsd","dfgdgdg","sdfdsfs","dsfsfsf");
    for (elem in t1){
        print(elem.toString()+" ")
    }
    println()
    t2[3] = "45789";
    t2.forEach {it-> print(it+" ") }
    println()
    t2.forEach { print(it+" ") }
    //uzycie konstruktora
    val t3 = Array<Int>(4) { 0 };
    println()
    t3.forEach { print("$it ") }
    t3[2]=22222;
    println()
    t3.forEach { print("$it ") }
    val t4 = Array<String>(5){"ala"}
    println()
    t4.forEach { print("$it ") }
    val t5:Array<Int?> = arrayOfNulls(5)
    println()
    t5.forEach { print("$it ") }
    val t6 = intArrayOf(0,0,0,0,0)
    println()
    t6.forEach { print("$it ") }
    println("rozmiar tablicy t6: ${t6.size}")
}
fun cw3Lists(){
    //List Set Map
    //List
    val list1 = mutableListOf<String>("ala","bela","cela");
    list1.forEach{print(it+" ")}
    list1.add("rrr")
    println()
    list1.forEach{print(it+" ")}
    list1.removeAt(2)
    println()
    list1.forEach{print(it+" ")}
    list1.remove("rrr");
    println()
    list1.forEach{print(it+" ")}
    //za pomocą konstruktora lista zmienialna
    val list2 = MutableList<String>(0){""}
    list2.add("kkkkk")
    println()
    ExList()
}
fun ExList(){
    val names:MutableList<String> = mutableListOf()
    var name = ""
    do{
        print("Podaj imie (napis null konczy): ")
        name = readln();
        if(name.lowercase()!="null") names.add(name)
    }while(name.lowercase()!="null")
    names.forEach{print("$it ")}
    println()
}
fun NWDRek(a: Int, b: Int): Int {
    if (b == 0) return a;
    return NWDRek(b, a % b);
}

fun NWDIter( a: Int, b: Int): Int{
    var temp = a;
    var aa = a;
    var bb = b;
    while (bb!=0){
        temp = aa;
        aa = bb;
        bb = temp % bb
    }
    return aa
}
