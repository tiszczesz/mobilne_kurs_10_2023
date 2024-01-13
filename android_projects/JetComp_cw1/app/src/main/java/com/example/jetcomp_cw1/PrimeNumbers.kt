package com.example.jetcomp_cw1

class PrimeNumbers {
    public fun isPrimes(number:Int):Boolean{
        //for(int i=2 ; i*i<=number;i++){}
        if(number<2) return false;
        var i = 2
        while ((i*i)<=number){
            if(number%i==0) return false;
            i++;
        }
        return true
    }
    public fun getPrimes(count:Int):List<Int>{
        val primes = mutableListOf<Int>();
        var number = 1
        while(primes.count()<count){
            number++
            if(isPrimes(number)){
                primes.add(number)
            }
        }
        return primes
    }
    public fun primalsToString(primes:List<Int>):String{
        val sb = StringBuilder();
        for (elem in primes){
            sb.append(elem).append(" ")
        }
        return sb.toString()
    }
}