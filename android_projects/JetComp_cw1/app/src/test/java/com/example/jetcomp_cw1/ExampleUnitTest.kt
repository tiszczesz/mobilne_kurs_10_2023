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
}