package by.it.academy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MavenClassTests {
    private MavenClass mavenClass = new MavenClass();

    @Test
    public void testResultOfCalculation() {
        int result = mavenClass.summarazingNumbers(4);
        assertEquals(8, result);
        assertEquals(-4, mavenClass.summarazingNumbers(-2));
    }

    @Test
    public void NullCase() {
        assertEquals(0, mavenClass.summarazingNumbers(null));
    }
}
