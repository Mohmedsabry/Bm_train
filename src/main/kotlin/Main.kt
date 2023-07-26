fun main() {
    println("Enter number of student:")
    var n:Int = readLine()!!.toInt()
    var listOfStudent:ArrayList<Student> = ArrayList(n)
    for(i in 1 .. n){
        println(" enter the student name:")
        listOfStudent[i].name = readLine()!!.toString()
        println("enter num of subject:")
        var numOfStudent = readLine()!!.toInt()
        for(i in 1..numOfStudent){
            println("enter subject name:")
            var subjectName = readLine()!!.toString()
            println("Enter subject grade:")
            var grade = readLine()!!.toDouble()
            listOfStudent[i].list.add(Subject(subjectName,grade))
        }
    }
    for (i in listOfStudent){
        println("${i.name} ${i.total} ${i.GPA}")
    }
    listOfStudent.sortBy {
        it.GPA
    }
    for (i in listOfStudent){
        println("${i.name} ${i.total} ${i.GPA}")
    }
}