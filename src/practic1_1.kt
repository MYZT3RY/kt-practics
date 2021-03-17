//2. сумма нечетных цифр

fun main(){
    var num = 0
    do{
        println("введите число")
        var num = readLine()!!.toInt()
    }while(num < 1)
    var sum: Int = 0
    while (num > 0) {
        if ((num % 10) % 2 == 1) {
            sum += num % 10
        }
        num /= 10;
    }
    println(sum)
}