import org.amshove.kluent.`should be equal to`
import org.amshove.kluent.`should contain same`
import org.junit.jupiter.api.Test

class BribeTests {
    @Test
    fun `test too chaotic`() {
        wrapper(4123) `should be equal to` -1
    }

    @Test
    fun `test single bribe`() {
        wrapper(132) `should be equal to` 1
    }

    @Test
    fun `test double`() {
        wrapper(312) `should be equal to` 2
        wrapper(231) `should be equal to` 2
    }

    @Test
    fun `test any`() {
        wrapper(3412) `should be equal to` 4
        wrapper(21534) `should be equal to` 3
        wrapper(25134) `should be equal to` -1
        wrapper(12537864) `should be equal to` 7
    }

    private fun wrapper(queue: Int): Int {
        val q = queue.asArray()
        return getMinimumBribes(q)
    }

    @Test
    fun `test normalize`() {

        2.asArray().normalize() `should contain same` 1.asArray()
        137.asArray().normalize() `should contain same` 123.asArray()
        731.asArray().normalize() `should contain same` 321.asArray()
        42.asArray().normalize() `should contain same` 12.asArray()
    }

}