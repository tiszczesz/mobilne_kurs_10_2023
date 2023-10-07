fun main(args: Array<String>) {
    Ex1()
    Ex2()
}

fun Ex2() {
   //utworzyc klase Book (title,price,year,author, override toString() jeden konstruktor)
    //utworzyc liste oboektow Book (3 elementy)
    //wyswietlic zawartosc listy uzywajac metody toString z klasy Book
}

fun Ex1(){
    val myClass = MyClass()
    println(myClass)
    println(myClass.hashCode())
    val p1 = Person();
    val p2 = Person("Lolek","Malecki");
    println(p2)
    val d1 = Dane(23,67.9)
    println(d1)
    val personList = mutableListOf<Person>();
    personList.add(Person())
    personList.add(Person("Antoni","Walecki"))
    personList.add(Person("Roman","Boman"))
    personList.forEach { println(it) }
}
class  MyClass(){
    private var a:Int;
    constructor(a:Int) : this() {
        this.a = a;
    }
    init {
        this.a = 0;
    }
}
class Person constructor(firstname:String="noname",lastname:String="noname"){
   private var firstname:String;
   private var lastname:String;
    init {
        println("blok inicjujacy")
        this.firstname = firstname;
        this.lastname = lastname
    }
    public override fun toString():String{
        return "imie: ${this.firstname} nazwisko: ${this.lastname}";
    }
}
data class Dane(val a:Int,var b:Double);