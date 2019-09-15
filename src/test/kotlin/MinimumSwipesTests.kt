import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

class MinimumSwipesTests {
    @Test
    fun `check single element`() {
        1 `min swipes should be` 0
    }

    @Test
    fun `check two items`() {
        21 `min swipes should be` 1
    }

    @Test
    fun `check three elem`() {
        312 `min swipes should be` 2
        321 `min swipes should be` 1
    }

    private infix fun Int.`min swipes should be`(result: Int) {
        minimumSwaps(this.asArray()) `should be equal to` result
    }
}