package me.sgorecki.legacy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppTest {

    private val uut = App()

    @Test
    fun `should has a greeting`() {
        // when
        val actual = uut.greeting

        // then
        assertThat(actual).isEqualTo("app should have a greeting")
    }
}
