fun main() {
    println("Enter number of student:")
    var n:Int = readLine()!!.toInt()
    println("enter num of subject:")
    var numOfSubject = readLine()!!.toInt()
    var listOfStudent:MutableList<Student> = MutableList(n){
        Student("ahmed", MutableList<Subject>(n){
            Subject("os",50.5)
        })
    }
    for(i in 0 until  n){
        println(" enter the student name:")
        listOfStudent[i].name = readLine()!!.toString()
        for(j in 0 until numOfSubject){
            println("enter subject name:")
            var subjectName = readLine()!!.toString()
            println("Enter subject grade:")
            var grade = readLine()!!.toDouble()
            listOfStudent[j].list.add(Subject(subjectName,grade))
        }
        listOfStudent[i].calcGPA()
        listOfStudent[i].calacTotal()
    }

    for (i in listOfStudent){
        println("${i.name} ${i.total} ${i.GPA}")
    }
    listOfStudent.sortBy {
        it.total
    }
    for (i in listOfStudent){
        println("${i.name} ${i.total} ${i.GPA}")
    }
}