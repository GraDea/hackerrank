import org.amshove.kluent.`should contain same`
import org.junit.jupiter.api.Test

class CompareTripletsTest {

    @Test
    fun `equal  arrays  should  return  zero`() {
        val array = intArrayOf(1, 2, 3).toTypedArray()
        val result = compareTriplets(array, array)

        result `should contain same` count("00")
    }

    @Test
    fun `first  all  greater  should return three zero`() {
        val array1 = intArrayOf(5, 2, 3).toTypedArray()
        val array2 = intArrayOf(0, 0, 0).toTypedArray()
        val result = compareTriplets(array1, array2)

        result `should contain same` count("30")
    }

    @Test
    fun `second all greater should return three zero`() {
        val array1 = intArrayOf(0, 0, 0).toTypedArray()
        val array2 = intArrayOf(5, 2, 3).toTypedArray()
        val result = compareTriplets(array1, array2)

        result `should contain same` count("03")
    }

    private fun count(count: String): Array<Int> =
        intArrayOf(count[0].toString().toInt(), count[1].toString().toInt()).toTypedArray()
}