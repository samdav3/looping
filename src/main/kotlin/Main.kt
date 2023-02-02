fun main(args: Array<String>) {
    var userAns = 0
    while (userAns != 9) {
        println("Select your order from the Starbucks Menu below.")
        println("1) Caramel Frappe")
        println("2) Black Coffee")
        println("3) Salted Caramel Cold Brew")
        println("4) Passion Iced Tea Lemonade")
        println("5) Chai Latte")
        println("9) Size Selection")
        print("Enter your Order Number: ")
        userAns = readLine()!!.toInt()
    }
    while (userAns != 8) {
        println("Please select what size $userAns you would like.")
        println("1) Tall")
        println("2) Grande")
        println("3) Vente")
        println("8) Checkout")
        print("Enter your Size Number: ")
        userAns = readLine()!!.toInt()
    }
}