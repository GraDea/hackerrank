import org.junit.jupiter.api.Test

@Test fun EqualArrayShoudReturnZeroZero(){
    val array = intArrayOf(1,2,3).toTypedArray()
    val result = compareTriplets(array, array)
}