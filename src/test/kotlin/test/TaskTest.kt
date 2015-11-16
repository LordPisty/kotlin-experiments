package test

import org.junit.Assert
import org.junit.Test as test

/**
 * Created by crespis on 11/16/2015.
 */

class TestStart {
    @test fun testOk() {
        Assert.assertEquals("OK", start())
    }
}