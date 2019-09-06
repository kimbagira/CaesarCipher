import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;


public class EncryptionTest {

        @Test
        public void runEncryption_startUpToWord_ArrayList() {
            Encryption  testEncryption = new Encryption();
            List<Object> expectedOutput = new ArrayList<Object>();
            expectedOutput.add("word");
            assertEquals(expectedOutput, testEncryption.runEncryption("word"));
        }
      @Test
        public void runEncryptiom_startUpToEnteredWord_ArrayList() throws Exception {
          Encryption testEncryption = new Encryption();
          ArrayList<Object> expectedOutput = new ArrayList<Object>();
          expectedOutput.add("word");
          expectedOutput.add("anyword");
          assertEquals(expectedOutput, testEncryption.runEncryption("anyword"));
    }

      @Test
        public void runEncryption_EncrypteWord_ArrayList() {
          Encryption testEncryption = new Encryption();
          ArrayList<Object> expectedOutput = new ArrayList<Object>();
          expectedOutput.add("word");
          expectedOutput.add("anyword");
          expectedOutput.add("Numbers");
          assertEquals(expectedOutput, testEncryption.runEncryption("Numbers"));
    }




    }
