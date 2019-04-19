package classes

data class BadgeDataClass(val id: Int, val name: String)

fun main(args: Array<String>) {

    val badgeDataClass = BadgeDataClass(101, "Bronz")
    println(badgeDataClass)
}