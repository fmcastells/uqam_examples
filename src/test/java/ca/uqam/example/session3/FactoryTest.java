package ca.uqam.example.session3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@Nested
public class FactoryTest {

    @Test
    void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("Test should have been aborted");
    }
}
