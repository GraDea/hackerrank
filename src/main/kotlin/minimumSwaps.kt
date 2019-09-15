// Complete the minimumSwaps function below.
fun minimumSwaps(arr: Array<Int>): Int {
    var counter = 0
    for ((index, i) in arr.withIndex()) {
        if (i == 0 || arr[i - 1] == i) continue
        arr[index] = 0
        var temp = i
        while (arr[temp - 1] != 0) {
            val temp1 = arr[temp - 1]
            arr[temp - 1] = 0
            temp = temp1
            counter++
        }
    }

    return counter
}