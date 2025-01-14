package nl.tomh.hello

data class Tokemon(val name: String, val type: String,  val description: String) {
    fun sayHello() = "Hello, my name is $name and I am a $type Tokemon. $description"
}
