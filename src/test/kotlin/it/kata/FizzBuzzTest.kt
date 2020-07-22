package it.kata

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    private val mapper: Collection<NumberToWord> = listOf(
        NumberToWord("Fizz") { it % 3 == 0},
        NumberToWord("Buzz"){ it % 5 == 0} ,
        NumberToWord("Bit") { it % 7 == 0}
    )
    private val fizzBuzz = FizzBuzz(mapper)

    @Test
    internal fun testOne() {
        assertEquals("1", fizzBuzz.convert(1))
    }

    @Test
    internal fun testTwo() {
        assertEquals("2", fizzBuzz.convert(2))
    }

    @Test
    internal fun testThree() {
        assertEquals("Fizz", fizzBuzz.convert(3))
    }

    @Test
    internal fun testFive() {
        assertEquals("Buzz", fizzBuzz.convert(5))
    }

    @Test
    internal fun testSix() {
        assertEquals("Fizz", fizzBuzz.convert(6))
    }

    @Test
    internal fun testTen() {
        assertEquals("Buzz", fizzBuzz.convert(10))
    }

    @Test
    internal fun testFifteen() {
        assertEquals("FizzBuzz", fizzBuzz.convert(15))
    }

    @Test
    internal fun testSeven() {
        assertEquals("Bit", fizzBuzz.convert(7))
    }
}

