package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeftPadUtilsTest {

    // ===== SPECIFICATION-BASED TESTS ===== //

    @Test
    @Tag("specification")
    void testNull() {
        assertNull(LeftPadUtils.leftPad(null, 5, "x"));
    }

    @Test
    @Tag("specification")
    void testEmpty() {
        assertEquals("xx", LeftPadUtils.leftPad("", 2, "x"));
    }


    @Test
    @Tag("specification")
    void testpadstrNull() {
        assertEquals("  a", LeftPadUtils.leftPad("a", 3, null));
    }

    @Test
    @Tag("specification")
    void testPaddingWithEmptySmallSize() {
        assertEquals("  a", LeftPadUtils.leftPad("a", 3, ""));
    }

    @Test
    @Tag("specification")
    void testPaddingWithOne() {
        assertEquals("xxxabc", LeftPadUtils.leftPad("abc", 6, "x"));
    }



    @Test
    @Tag("specification")
    void testPaddingWithemptyLargeSize() {
        assertEquals("  abc", LeftPadUtils.leftPad("abc", 5, " "));
    }

    // ===== COVERAGE-BASED TESTS ===== //


    @Test
    @Tag("coverage")
    void testPaddingWithlessSize() {
        assertEquals("abc", LeftPadUtils.leftPad("abc", 3, "xyz"));
    }


    @Test
    @Tag("coverage")
    void testWithSameLength() {
        assertEquals("xyzabc", LeftPadUtils.leftPad("abc", 6, "xyz"));
    }


    @Test
    @Tag("coverage")
    void testEmptyString() {
        assertEquals("abc", LeftPadUtils.leftPad("abc", 1, ""));
    }

    @Test
    @Tag("coverage")
    void testSizeWithNull() {
        assertEquals("abc", LeftPadUtils.leftPad("abc", 2, null));
    }
}