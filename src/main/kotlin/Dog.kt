class Dog(val name: String, val weight_param: Int, val breed_param: String) {
    init {
        print("Dog $name has been created. ")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init {
        println("The breed is $breed.")
    }

    var wight = weight_param
        set(value) {
            if (value > 0) field = value
        }

    val weighInKgs: Double
        get() = wight / 2.2

    fun bark(){
        println(if (wight < 20) "Yip!" else "Woof!")
    }
}