# Informacje Wstępne

### 1. Android Studio
https://developer.android.com/

### 2. Xamarian
https://learn.microsoft.com/pl-pl/xamarin/get-started/what-is-xamarin

### 3. React Native
https://reactnative.dev/

### 4. Flutter
https://flutter.dev/?gclid=EAIaIQobChMI16yVwb_hgQMVeUZBAh0OIAmXEAAYASAAEgLAi_D_BwE&gclsrc=aw.ds

### 5. Embarcadero
https://www.embarcadero.com/

### 6. Cordova
https://cordova.apache.org/


# Kotlin i Android studio

## Język Kotlin
https://kotlinlang.org/

kompilator kotlina:
https://otfried.org/courses/cs109/project-install.html

https://github.com/JetBrains/kotlin/releases/tag/v1.9.10

### Kotlin typy danych
https://kotlinlang.org/docs/basic-types.html


- Typy danych: https://kotlinlang.org/docs/basic-types.html


```kotlin
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

    //typy zmiennoprzecinkowe
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817

    //string
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    val str = "abcd"
    println(str.uppercase()) // Create and print a new String object
    println(str) // The original string remains the same

    //boolean
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue) 

    //char
    val aChar: Char = 'a'

    println(aChar)
    println('\n') // Prints an extra newline character
    println('\uFF00')

``` 

## Typy Nulowalne
```kotlin
fun parseInt(str: String): Int? {
    // ...
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number")
    }    
}

```

### Instrukcje sterujące:
https://kotlinlang.org/docs/basic-syntax.html

```kotlin
var max = a
if (a < b) max = b

// With else
if (a > b) {
    max = a
} else {
    max = b
}

// As expression
max = if (a > b) a else b

// You can also use `else if` in expressions:
val maxLimit = 1
val maxOrLimit = if (maxLimit > a) maxLimit else if (a > b) a else b


when (x) {
    1 -> print("x == 1")
    2 -> print("x == 2")
    else -> {
        print("x is neither 1 nor 2")
    }
}

when (x) {
    in 1..10 -> print("x is in the range")
    in validNumbers -> print("x is valid")
    !in 10..20 -> print("x is outside the range")
    else -> print("none of the above")
}
```

https://kotlinlang.org/docs/control-flow.html

### Tablice w Kotlinie
https://kotlinlang.org/docs/arrays.html

### Zbiory w Kotlinie:
https://kotlinlang.org/docs/kotlin-tour-collections.html

### Klasy i obiekty
https://kotlinlang.org/docs/classes.html


```kotlin
class Person(
    val firstName: String,
    val lastName: String,
    var age: Int, // trailing comma
) { /*...*/ }


class Person(val name: String) {
    val children: MutableList<Person> = mutableListOf()
    constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
    }
}

class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor $i")
    }
}
```



### Cykl życia Activity
![Alt text](activity_lifecycle.png)


### aplikacje MultiActivity

https://www.geeksforgeeks.org/creating-multiple-screen-applications-in-android/


Fragments

 Fragment definiuje i zarządza własnym Układ, ma swój własny cykl życia i może obsługiwać własne zdarzenia wejściowe. Fragmenty Nie mogą żyć na własną rękę. Muszą być prowadzone przez działalność lub inną Fragment. Hierarchia widoku fragmentu staje się częścią lub przyłącza się do: Hierarchia widoku gospodarza.

Modułowość

Fragmenty wprowadzają modułowość i możliwość ponownego użytku Twojej działalności poprzez Pozwala ci podzielić UI na dyskretne kawałki. Działania są idealne Miejsce, aby umieścić globalne elementy wokół interfejsu użytkownika aplikacji, na przykład Szablon: szuflada nawigacyjna. Odwrotnie, fragmenty są lepiej dostosowane do definiowania i Zarządzaj interfejsem użytkownika jednego ekranu lub części ekranu.

Rozważ aplikację, która reaguje na różne rozmiary ekranu. Na większych ekranach, ty Może chcieć, aby aplikacja wyświetlał statyczną szufladę nawigacyjną i listę w siatce Układ. Na mniejszych ekranach możesz chcieć, aby aplikacja wyświetlał dolną Nawigacja i lista w układzie liniowym.

Zarządzanie tymi zmianami w działalności jest Nieporęcznie. Oddzielenie elementów nawigacyjnych od treści może to zrobić Proces bardziej zarządzalny. Działalność jest wtedy odpowiedzialna za wyświetlanie Prawidłowy interfejs nawigacyjny, podczas gdy fragment wyświetla listę z właściwą Układ.


![Alt text](fragment-screen-sizes.png)