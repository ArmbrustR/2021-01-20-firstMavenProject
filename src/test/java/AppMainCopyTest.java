import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({
            "kekse, false",
            "Keksesindsuperleckerundhabenvielekalorien, true"
    })

    public void paramstest(String s, boolean testResult){
        Assertions.assertEquals(testResult, AppMainCopy.checkLengh(s));

    }

}
