package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;
import org.junit.*;
public class ForumTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: beginHHH");
    }
    @After
    public void after(){
        System.out.println("Test Case: end555" + "\n");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin111111111" + "\n");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end22222222222");
    }
    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing " + result );
        //Then
        Assert.assertEquals("theForumUser", result );
    }
    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result );
        //Then
        Assert.assertEquals("John Smith", result);
    }
}