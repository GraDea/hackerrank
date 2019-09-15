// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

    var first = 0
    var second = 0

    for (i in 0..2) {
        if (a[i] > b[i]) {
            first++
        } else if (a[i] < b[i]) {
            second++
        }
    }
    return intArrayOf(first, second).toTypedArray()
}