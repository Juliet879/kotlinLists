fun main() {
    val output = findString(listOf("Opinionated","Philanthropist","humanity","serve","purpose","Blessed","giver","smart","favoured","grateful"))
    println(output)
    val answer = avgSum(listOf(1.4,1.7,1.9,1.3,1.6,2.0))
    println(answer.average)
    println(answer.sum)
    val peopleList = listOf(Person("Jeniffer",24,1.4,56.7),
                            Person("Dian",28,1.6,63.4),
                            Person("Samantha",34,1.8,76.4),
                            Person("Melissa",22,1.3,45.3))
    println(sorting(peopleList))
    addPeople(peopleList)
    val cars = listOf(Car("KCA456",120),
                         Car("KCC721",80),
                         Car("KBC6423",100)
        )
    println(avgMileage(cars))

}
fun findString(words:List<String>):List<String>{
    val evenIndices = mutableListOf<String>()
    words.forEachIndexed { index, string ->
        if (index%2==0){
            evenIndices.add(string)
        }
    }
    return evenIndices
}
data class ListAvgSum(var sum:Double,var average:Double)
fun avgSum(height: List<Double>): ListAvgSum {
    val total = height.sum()
    val ave = height.average()
    val avgSum = ListAvgSum(total,ave)
    return avgSum
}
data class Person(var name:String,var age:Int,var height: Double,var weight:Double)
fun sorting(peopleList:List<Person>):List<Person>{
    return peopleList.sortedByDescending { person -> person.age }
}

fun addPeople(peopleList: List<Person>){
    val oldPeopleList = mutableListOf<Any>()
    val newPeopleList = listOf(Person("Johnte",21,1.7,56.4),
                               Person("Mariam",14,1.4,43.2)
        )

    val allPeople = oldPeopleList.add(newPeopleList)
    println(allPeople)
}

data class Car(var registration:String,var mileage:Int)
fun avgMileage(cars:List<Car>):Int{
     var totalMileage = 0
    cars.forEach { car -> totalMileage+=car.mileage }
    return totalMileage/cars.size

}
