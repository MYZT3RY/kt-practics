//сумма нечетных цифр

fun main(){
    println("введите число")
    var num = readLine()!!.toInt()
    var sum: Int = 0
    while(num > 0){
        if((num % 10) % 2 == 1){
            sum+=num%10
        }
        num/=10;
    }
    println(sum)
}