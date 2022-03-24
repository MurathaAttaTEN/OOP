fun main(){
    var audi = Car("audi","a5","oieu9937",0)
    println(audi.make)
    audi.speed
    audi.accelerate(50)
    println(audi.speed)
    audi.accelerate(30)
    println(audi.speed)
    audi.hoot()
    audi.retard(20)
    println(audi.speed)
    audi.stop()
    println(audi.stop())
    var nancy = Student("mwanza", 22)
    var wanjiru = Student("VIC",25)
    println(nancy.name)
    println(wanjiru.age)




    var benz= Car("mercedez benz","g63","jdjf93",0)
    benz.retard(20)
    println(benz.speed)
    benz.stop()
    println(benz.speed)




}
class Car(var make:String, var model:String,registration:String, var speed:Int ){
    fun start(){
        println("chogio")
    }
    fun accelerate(acceleration:Int):Int{
        speed+=acceleration
        return speed

    }
    fun hoot(){
        println("wheew")

    }
    fun retard(retardation:Int):Int{
        speed-=retardation
        return speed
    }
    fun stop():Int{
        speed= 0
        return speed
    }
}
data class Student(var name: String, var age:Int)

