fun plusMinus(arr: Array<Int>): Unit {
    var plus = 0
    var minus = 0
    var zeroes = 0
    for (i in arr) {
        when {
            i == 0 -> zeroes++
            i > 0 -> plus++
            else -> minus++
        }
    }

    println("%.6f".format(plus.toDouble()/arr.size))
    println("%.6f".format(minus.toDouble()/arr.size))
    println("%.6f".format(zeroes.toDouble()/arr.size))


}