package classes

import java.lang.IllegalArgumentException
import java.util.*

class User(var id: Int, var name: String, var birthYear: Int) {

    var age = 0
        get() = Calendar.getInstance().get(Calendar.YEAR) - birthYear

    var panNo: String = ""
        set(value)  {
            if (!value.startsWith("PN")) {
                throw IllegalArgumentException("Invalid PAN card no, should start with PN")
            }
        }

}

fun main(args: Array<String>) {
    val userObj = User(1, "Gangadhar", 1991)
    userObj.panNo = "PN1234"

    println("Id: ${userObj.id} Name: ${userObj.name} Age: ${userObj.age}")
}