//Assignment 9: Lists
//1. Given a list of 10 strings, write a function that returns a list of the strings at even indices i.e index 2,4,6 etc (2 points)
//2. Given a list of people’s heights in metres. Write a function that returns the average height and the total height (2 points)
//3. Given a list of Person objects, each with the attributes, name, age, height and weight. Sort the list in order of descending age (2 points)
//4. Given a list similar to the one above, write a function in which you will create 2 more people objects and add them to the list at one go.
//5. Write a function that takes in a list of Car objects each with a registration and mileage attribute and returns the average
//mileage of all the vehicles in the list. (3 points)
fun main() {
    val output = findString(listOf("Opinionated","Philanthropist","humanity","serve","purpose","Blessed","giver","smart","favoured","grateful"))
    println(output)
    val answer = avgSum(listOf(1.4,1.7,1.9,1.3,1.6,2.0))
    println(answer)
    var peopleList = listOf(Person("Jeniffer",24,1.4,56.7),
                            Person("Dian",28,1.6,63.4),
                            Person("Samantha",34,1.8,76.4),
                            Person("Melissa",22,1.3,45.3))
    println(sorting(peopleList))
    var otherpeopleList = mutableListOf(Person1("Jeniffer",24,1.4,56.7),
        Person("Dian",28,1.6,63.4),
        Person("Samantha",34,1.8,76.4),
        Person("Melissa",22,1.3,45.3))
   var addedPeople = mutableListOf(Person("Sanzi",34,1.5,87.9),
       Person("Sanzi",34,1.5,87.9))

    var newPeopleList = otherpeopleList.add(addedPeople)
//    addPeople(newPeopleList)
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
fun sorting(people:List<Person>):List<Person>{
    return people.sortedByDescending { person -> person.age }
}

data class Person1(var name:String,var age:Int,var height: Double,var weight:Double)
fun addPeople(watu:List<Person1>){
}

data class Car(var registration:String,var mileage:Int)


