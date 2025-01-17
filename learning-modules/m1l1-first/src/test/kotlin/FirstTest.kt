import ru.otus.kotlin.maksapakov.main
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test
import kotlin.test.assertEquals

class FirstTest {

    @Test
    fun firstTest() {
        assertEquals(3, 1 + 2)
    }

    @Test
    fun testHelloWorld() {

        val output = captureOutput {
            main()
        }
        assertEquals("Hello, World!\n", output)
    }

    private fun captureOutput(action: () -> Unit): String {
        val stream = ByteArrayOutputStream()
        System.setOut(PrintStream(stream))
        action()
        System.setOut(System.out)
        return stream.toString("UTF-8")
    }
}