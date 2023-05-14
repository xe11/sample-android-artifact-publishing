package xe11.samples.android.lib.sum

import org.junit.Test

internal class CalculatorTest {

    @Test
    fun `sum should `() {
        val sut = Calculator()

        val actual = sut.sum(1, 2)

        assert(actual == 3)
    }
}
