
data class Car(val brand: String, var model: String, val year: Int) {
  fun drive() {
    println("Wrooom!")
  }

  fun speed(maxSpeed: Int): Int {
    val sumFirst = maxSpeed + this.year
    return sumFirst
  }

  fun getBrandItem(): String {
    return this.brand
  }
}

fun main() {
  val mainCars = arrayOf<Car>(
    Car("Honda", "Civic", 2001),
    Car("Toyota", "Camry", 2006)
  )

  val result =  linearSearchTraversal(1, listOf(2,3,1,5,))

  val names = mutableListOf("Thomi", "Thorir");
  var jobs = arrayOf<String>("Sample", "Name", "Nexr");
  var color = listOf("red", "white", "blue");

  jobs.forEach {
    println("Name:$it")
  }
  devider();
  for (item in names) {
    println(item)
  }
  devider();
  for (car in mainCars) {
    println(car.getBrandItem())
  }
  devider();
  println(result)

}

fun devider() {
  println("===========")
}