import java.util.Scanner;


/**
 * The test class RunnersTest.
 * 
 * @author  Mark Dutchuk and Dave Croft
 * @version 2020-10-08
 */
public class RunnersTest {
    
    Runners r; // Runners object

    /**
     * Constructor. This won't work until you've 
     * finished the Runners class!
     */
    public RunnersTest(String name1, String name2, String name3) {   
       Scanner keyboard = new Scanner(System.in); 
      
        r = new Runners();
        // here are the names of are three runners
        r.setRunner1(name1);
        r.setRunner2(name2);
        r.setRunner3(name3);
    }

 
    public void test1() {

        r.setTime1(21);  // time for Graham
        r.setTime2(19);  // time for Brandon
        r.setTime3(25);  // time for Dave
        
        System.out.println("\n\nTest1: Checking Runners first, second, third logic: ");
        System.out.println("First place (should be Brandon): " + r.getFirstPlace());
        System.out.println("Second place (should be Graham): " + r.getSecondPlace());
        System.out.println("Third place (should be Dave): " + r.getThirdPlace());
        
    }
    
    public void test2() {

        r.setTime1(15);  // time for Graham
        r.setTime2(19);  // time for Brandon
        r.setTime3(25);  // time for Dave
        
        System.out.println("\n\nTest2: Graham took performance enhancing substance!");
        System.out.println("Checking Runners first, second, third logic: ");
        System.out.println("First place (should be Graham): " + r.getFirstPlace());
        System.out.println("Second place (should be Brandon): " + r.getSecondPlace());
        System.out.println("Third place (should be Dave): " + r.getThirdPlace());
        
    }
    
     public void test3() {

        r.setTime1(26);  // time for Graham
        r.setTime2(30);  // time for Brandon
        r.setTime3(25);  // time for Dave
        
        System.out.println("\n\nTest3: Graham was on holidays in Mexico, and Brandon was up all night with a server");
        System.out.println("Checking Runners first, second, third logic: ");
        System.out.println("First place (should be Dave): " + r.getFirstPlace());
        System.out.println("Second place (should be Graham): " + r.getSecondPlace());
        System.out.println("Third place (should be Brandon): " + r.getThirdPlace());
        
    }
    
    public static void main(String args[]) {
        System.out.println("\n\nRunning the RunnersTest program!");
        
        RunnersTest demo = new RunnersTest("Graham", "Brandon", "Dave");
        
        demo.test1();
        demo.test2();
        demo.test3();
    }
}

