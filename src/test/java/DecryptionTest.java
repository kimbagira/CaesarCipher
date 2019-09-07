//import org.junit.*;
//import static org.junit.Assert.*;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class DecryptionTest {
//
//    @Test
//    public void runDecryption_startUpToWord_ArrayList() {
//        Decryption  testDecryption = new Decryption();
//        List<Object> expectedOutput = new ArrayList<Object>();
//        expectedOutput.add("word");
//        assertEquals(expectedOutput, testDecryption.runDecryption(1));
//    }
//    @Test
//    public void runDecryption_startUpToEnteredWord_ArrayList() throws Exception {
//        Decryption testDecryption = new Decryption();
//        ArrayList<Object> expectedOutput = new ArrayList<Object>();
//        expectedOutput.add("word");
//        expectedOutput.add("anyword");
//        assertEquals(expectedOutput, testDecryption.runDecryption(2));
//    }
//
//    @Test
//    public void runDecryption_DecrypteWord_ArrayList() {
//        Decryption testDecryption = new Decryption();
//        ArrayList<Object> expectedOutput = new ArrayList<Object>();
//        expectedOutput.add("word");
//        expectedOutput.add("anyword");
//        expectedOutput.add("Numbers");
//        assertEquals(expectedOutput, testDecryption.runDecryption(3));
//    }
//}
