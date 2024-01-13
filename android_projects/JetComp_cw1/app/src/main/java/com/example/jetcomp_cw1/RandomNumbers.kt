package com.example.jetcomp_cw1

import kotlin.random.Random

class RandomNumbers {
    public fun getRandom(howMany:Int):String{
//        val rnd = Random(100)
        val count = if(howMany<2 || howMany>20) 20 else howMany
       // val numbers = Array<Int>(howMuch,{0})
        val sb = StringBuilder()
        for (i in 0..count){
            sb.append(Random.nextInt(0,100)).append(" ")
        }
        return sb.toString()
    }
}