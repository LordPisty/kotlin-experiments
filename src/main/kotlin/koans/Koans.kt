package koans

/**
 * Created by crespis on 11/16/2015.
 */

// basic function
fun start() = "OK"

// named - default arguments
fun namedArguments(paramA: String = "a", paramB: Int = 3): String = paramA + paramB.toString()