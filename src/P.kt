
    /*Kotlin when
    Instead of writing many if..else expressions, you can use the when expression, which is much easier to read.

    It is used to select one of many code blocks to be executed:

    Example
    Use the weekday number to calculate the weekday name:*/
fun main() {
        val day = 4

        val result = when (day) {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid day."
        }
        println(result)
    }
// Outputs "Thursday" (day 4)
