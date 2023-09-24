fun main(args: Array<String>) {
   val myDog = Dog("Fido", 70, "Mixed")
    myDog.bark()
    myDog.wight = 75
    println("Weight in Kgs is ${myDog.weighInKgs}")
    myDog.wight = -2
    println("Weight is ${myDog.wight}")
    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities){
        println("My dog enjoys $item")
    }

    val dogs = arrayOf(Dog("Kelpie", 20, "Westie"), Dog("Ripper", 10, "Poodle"))
    dogs[1].bark()
    dogs[1].wight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].wight}")
}