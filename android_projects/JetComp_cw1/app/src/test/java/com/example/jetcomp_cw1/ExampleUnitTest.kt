package com.example.jetcomp_cw1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val primal = PrimeNumbers();
        val result = primal.isPrimes(5)
        assertTrue(result)
    }
    @Test
    fun prime_unCorrect(){
        val primal = PrimeNumbers();
        val result = primal.isPrimes(12)
        assertFalse(result)
    }

    @Test
    fun primes_length(){
        val primal = PrimeNumbers();
        val result = primal.getPrimes(10)
        assertTrue(result.count()==10)
    }
    @Test
    fun primes_is(){
        val primal = PrimeNumbers();
        val result = primal.getPrimes(5)
        assertEquals(2,result[0])
        assertEquals(3,result[1])
        assertEquals(5,result[2])
        assertEquals(7,result[3])
        assertEquals(11,result[4])
    }
}