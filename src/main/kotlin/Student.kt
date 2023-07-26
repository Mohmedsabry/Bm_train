class Student(var name:String,var list: MutableList<Subject>,var total:Double=0.0,var GPA:Double=0.0) {
    fun calacTotal(){
        for (i in list){
            total+=i.grade
        }
    }
    fun calcGPA(){
        GPA = when(total){
            50.toDouble()  -> 2.0
            70.toDouble() ->3.0
            else -> 1.0
        }
    }
    init {
        calacTotal()
        calcGPA()
    }
}