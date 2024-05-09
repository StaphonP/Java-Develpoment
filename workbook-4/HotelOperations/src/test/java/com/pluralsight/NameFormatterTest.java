package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    void formatName() {
        NameFormatter.formatName("Staphon","Peterson");

    }

    @Test
    void testFormatName() {
        NameFormatter.formatName("Dr.","Staphon","D","Peterson","Phd.");
    }

    @Test
    void testFormatName1() {
        NameFormatter.formatName("Dr. Staphon D Peterson Phd");
    }
}