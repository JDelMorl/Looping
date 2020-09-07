fun main(args: Array<String>) {
//    var counter = 10
//    while (counter < 10){
//        println("the counter is $counter")
//        counter++
//    }
//    counter = 10
//    do {
//        println("the counter is $counter")
//        counter++
//    } while (counter < 10)
//    var userAns = 0
//    do {
//        println("1) First Choice")
//        println("2) Second Choice")
//        println("9) Exist")
//
//        print("Enter Choice: ")
//        userAns = readLine()!!.toInt()
//    } while (userAns != 9)
    var userAns = 0
    do {
        println("Please enter the number of your selection: ")
        println("1) Burger")
        println("2) Burger with Cheese")
        println("3) Burger and Fries")
        println("4) Burger with Cheese and Fries")
        println("5) Exit")

        print("Enter Choice: ")
        userAns = readLine()!!.toInt()
        if(userAns == 1)
            println("your ordered Burger")
        else if(userAns == 2)
            println("your ordered Burger with Cheese")
        else if(userAns == 3)
            println("your ordered Burger and Fries")
        else if(userAns == 4)
            println("your ordered Burger with Cheese and Fries")
    } while (userAns != 5)

}