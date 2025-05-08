package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class NameFormatterTest {

    @Test
    public void testFormat_FirstAndLastName() {
        String result = NameFormatter.format("Mel", "Johnson");
        assertEquals("Johnson, Mel", result);
    }

    @Test
    public void testFormat_AllPartsPresent() {
        String result = NameFormatter.format("Dr.", "Mel", "B", "Johnson", "PhD");
        assertEquals("Johnson, Dr. Mel B, PhD", result);
    }

    @Test
    public void testFormat_NoMiddleOrSuffix() {
        String result = NameFormatter.format("", "Mel", "", "Johnson", "");
        assertEquals("Johnson, Mel, ", result);
    }

    @Test
    public void testFormat_WithMiddleOnly() {
        String result = NameFormatter.format("", "Mel", "B", "Johnson", "");
        assertEquals("Johnson, Mel B, ", result);
    }

    @Test
    public void testFormat_WithSuffixOnly() {
        String result = NameFormatter.format("", "Mel", "", "Johnson", "III");
        assertEquals("Johnson, Mel, III", result);
    }

    @Test
    public void testFormat_FullNameWithPrefixMiddleSuffix() {
        String result = NameFormatter.format("Dr. Mel B Johnson, PhD");
        assertEquals("Johnson, Mel Dr. B, PhD", result);
    }

    @Test
    public void testFormat_FullNameWithoutPrefixOrSuffix() {
        String result = NameFormatter.format("Mel Johnson");
        assertEquals("Johnson, Mel, ", result);
    }

    @Test
    public void testFormat_FullNameWithMiddle() {
        String result = NameFormatter.format("Mel B Johnson");
        assertEquals("Johnson, Mel B, ", result);
    }

}