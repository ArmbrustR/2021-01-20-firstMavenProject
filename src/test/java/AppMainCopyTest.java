import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppMainCopyTest {
    @Test
    public void stringLenghshoter20false(){
        // GIVEN
        String test2 = "Kekse";

        //WHEN
        boolean testResult = AppMainCopy.checkLengh(test2);

        //THEN
        Assertions.assertEquals(false, testResult);

    }

    @Test
    public void stringLenghlonger20true(){

        // GIVEN
        String test2 = "Keksesindsuperleckerundhabenvielekalorien";

        //WHEN
        boolean testResult = AppMainCopy.checkLengh(test2);

        //THEN
        Assertions.assertEquals(true, testResult);
    }

}
