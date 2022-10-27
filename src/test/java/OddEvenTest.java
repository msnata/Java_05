import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OddEvenTest {

    //1. Positive testing Happy path
    // num Нечетное -345
    // return Odd


    @Test

    public void testNumIsOddAndNegative_HappyPath() {

        //AAA
        // arrange

        int num = -345;

        String expectedResult = "Odd";

        //act
        //String actualResult = new OddEven().oddEven(num);

        //OddEven oddEven = new OddEven();
        String actualResult = new OddEven().oddEven(num);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. num equal 0
    //return Even

    @Test

    public void testNumEqualZero_HappyPath() {

        //AAA
        // arrange

        int num = 0;

        String expectedResult = "Even";

        //act

        String actualResult = new OddEven().oddEven(num);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //3. num is Even (четное) 222222
    //return Even

    @Test

    public void testNumIsEven_HappyPath() {

        //AAA
        // arrange

        int num = 222222;

        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(num);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
