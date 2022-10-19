val studentName = arrayListOf<String>()
val studentScore = arrayListOf<Double>()
var studentsNumber = 0
var totalscore: Double = 0.0
var avargescore: Double = 0.0

var highestscore: Double = -1.0
var indexhighststudentscore = 0

fun main() {
    println("please enter student number:")
    studentsNumber = readLine()!!.toInt()
    registration()
    println("_____________________")
    printnamesandscore()
    println("_____________")
    calculatescore()
    gethigherscoew()

}


fun registration() {
    for (i in 1..studentsNumber) {
        println("Please enter student $i Name")
        studentName.add(readln().toString())
        println("Please enter student score")
        studentScore.add(readLine()!!.toDouble())
    }
}

fun printnamesandscore() {
    for (i in 0..studentScore.lastIndex) {
        println("${studentName[i]} got:${studentScore[i]}")
    }
}

fun calculatescore() {
    for (i in 0..studentScore.lastIndex) {
        totalscore = totalscore + studentScore[i]

    }
    avargescore = totalscore / studentsNumber

    println("The avarge score in class is: $avargescore")
}

fun gethigherscoew() {
    for (i in 0..studentScore.lastIndex) {
        if (studentScore[i] > highestscore) {
            highestscore = studentScore[i]
            indexhighststudentscore = i

        }
    }
    println("${studentName[indexhighststudentscore]} got the highest score $highestscore")
}



