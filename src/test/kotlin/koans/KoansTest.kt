package koans

import org.junit.Assert
import org.junit.Test as test

/**
 * Created by crespis on 11/16/2015.
 */

class TestKoans {
    @test fun testOk() {
        Assert.assertEquals("Returned string should match", "OK", start())
    }

    @test fun testNamedArguments() {
        Assert.assertEquals("Returned string should match", "c4", namedArguments(paramB = 4, paramA = "c"))
    }

    @test fun testDefaultArguments() {
        Assert.assertEquals("Returned string should match", "a3", namedArguments())
    }

    @test fun testMixedArguments() {
        Assert.assertEquals("Returned string should match", "a5", namedArguments(paramB = 5))
        Assert.assertEquals("Returned string should match", "v7", namedArguments("v",7))
    }

    @test fun testLambda() {
        Assert.assertEquals("Returned boolean should match", true, containsEven(listOf(1, 2, 3)))
    }

    @test fun testNamedLambda() {
        Assert.assertEquals("Returned collection should match", 1, filterOdds(listOf(1, 2, 3)).size)
        Assert.assertEquals("Returned boolean should match", true, containsEven(filterOdds(listOf(1, 2, 3))))
    }
}