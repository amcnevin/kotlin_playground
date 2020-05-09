package chapter_1

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"),
            Person("Bob", age=21),
            Person("Charlie", age=30),
            Person("Derrick"))

    val oldest = persons.maxBy { it.age ?: 0 }
    val youngest = persons.minBy { it.age ?: 0 }

    println("The older is: $oldest")
    println("The youngest is: $youngest")
}

