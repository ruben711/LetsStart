package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    @Test
    public void suffixNietInStr(){
        String str = "abc";
        String suffix = "bc";
        StringProcessor s = new StringProcessor();
        assertEquals("abc", s.apppendSuffix(str,suffix));
    }

    @Test
    public void suffixInStr(){
        String str = "abc";
        String suffix = "xyz";
        StringProcessor s = new StringProcessor();
        assertEquals("abcxyz",s.apppendSuffix(str,suffix));
    }

}