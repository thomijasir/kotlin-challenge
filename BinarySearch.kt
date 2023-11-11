import java.util.Objects

fun main() {
  val numbers = listOf<Number>(1,2,3,4,5,6,7,8,9,10)
  // Find index Of Number
  val result = linearSearchIndex(3, numbers);
  val result2 = linearSearchTraversal(3, numbers)
  println(result)
  println("=======")
  println(result2.value)
}

fun linearSearchIndex(findElement: Number, elements: List<Number>): Int {
 return elements.indexOf(findElement)
}

data class DlinearSearchTraversal(val index: Number, val value: Number)
fun linearSearchTraversal(findElement: Number, elements: List<Number>): DlinearSearchTraversal {
  var isFound = false;
  var traversal = 0;

  while (!isFound && traversal <= elements.size){
    val item = elements[traversal]
    if(item === findElement) {
      isFound = true
    }
    traversal++
  }

  return DlinearSearchTraversal(traversal-1, findElement)
}

fun binnarySeach(findElement: Int, elements: MutableList<Int>): Int {
  var low = 0
  var high = elements.size - 1
  var traversal = 0;
  while (low <= high){
    traversal++
    val mid = (low + high) / 2
    val cmp = elements[mid].compareTo(findElement)
    if(cmp < 0) {
      low = mid + 1
    } else if (cmp > 0) {
      low = mid - 1
    } else {
      return elements[mid]
    }
  }
  return -1
}
