fun minimumBribes(q: Array<Int>): Unit {
    val result = getMinimumBribes(q)
    if (result == -1) {
        println("Too chaotic")
    } else {
        println(result)
    }
}

fun getMinimumBribes(q: Array<Int>): Int {
    if (q.mapIndexed { index, i -> (i - 1 - index) }.any { it > 2 }) {
        return -1
    }

    return getResult(q)
}

fun Array<Int>.normalize(): Array<Int> {
    val sorted = this.sortedArray().mapIndexed { index, i -> i to index }.toMap()
    return this.map { sorted.getValue(it) + 1 }.toTypedArray()
}

private fun getResult(q: Array<Int>): Int {
    if (sum(q) == 0) {
        return 0
    }
    val less = q.filterIndexed { index, i -> (i - 1 - index) <= 0 }.toTypedArray().normalize()
    return sum(q) + getResult(less)
}

private fun sum(q: Array<Int>) = q.mapIndexed { index, i -> (i - 1 - index) }.filter { it > 0 }.sum()
private fun printArray(q: Array<Int>) {
    q.mapIndexed { index, i -> println("$index\t$i\t${i - 1 - index}") }
}