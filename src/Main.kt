//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    removeLetter("Barnie bakes brown bangles and buns")
    println(sumCountAverage(arrayOf(10,20,30,40,50,60,70,80,90,100)))
    calculateVolume(2.6)
    println(isPalindrome("Madam"))
}

//Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.


fun removeLetter(sentence:String){


    var statement = sentence.lowercase().split("b")
    println(statement)
}


//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.


fun sumCountAverage(numbers:Array<Int>) :Calc {

    var sum = numbers.sum()
    var count = numbers.count()
    var average = numbers.average()

    var result = Calc(sum, count, average)

    return result
}

data class Calc(var sum:Int, var count:Int, var average:Double)

//The volume of a sphere is calculated using the formula below
//
//V = 4/3 π r
//3
//
//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π


fun calculateVolume(radius:Double){
    val pi = 3.14159
    val num = 4/3
    val volume = num * pi * radius * radius * radius
    println (volume)

}


//A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.
fun  isPalindrome(word:String) :Boolean {
    if (word == word.lowercase().reversed())
        return true
    else {
        return false
    }


}