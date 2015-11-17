package koans

/**
 * Created by crespis on 11/16/2015.
 */

// basic function
fun start() = "OK"

// named - default arguments
fun namedArguments(paramA: String = "a", paramB: Int = 3): String = paramA + paramB.toString()

// lambdas
fun containsEven(collection: Collection<Int>): Boolean = collection.any { x -> x % 2 == 0 }
fun evenPredicate(x: Int): Boolean = x % 2 == 0
fun filterOdds(collection: Collection<Int>): Collection<Int> = collection.filter(::evenPredicate)