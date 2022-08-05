package test;

import org.junit.Test;
import main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void bracketsWithTextInside(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsWithTextOutsideandInside(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsWithTextFollowing(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void singleOpenBracketWithText(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void singleCloseBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode"));
    }

    @Test
    public void closedThenOpenBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void singleOpenBracketNoText(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleClosedBracketNoText(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void closedThenOpenNoText(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
}
