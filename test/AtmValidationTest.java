import atm.AtmCard;
import atm.AtmValidation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtmValidationTest {
    AtmValidation atmCheck;
    @BeforeEach
    public void setUp() {
        atmCheck = new AtmValidation("6234567881011");
    }
    @Test
    public void AtmValidationClassExist(){
        assertNotNull(atmCheck);
    }
    @Test
    public void userCanEnterNumberInStrings(){

        assertEquals("6234567881011", atmCheck.getNumber());
    }
    @Test
    public void userCannotEnterNumbersBelow13_AndAbove_16(){

       try{ AtmValidation atmCheck = new AtmValidation("12345873456");}
       catch(IllegalArgumentException e){
           assertEquals(IllegalArgumentException.class,e.getClass());
       assertEquals("Invalid atm number",e.getMessage());}

    }

    @Test
    public void validateFirstDigit(){
        try{ atmCheck.validateFirstDigit("1234587345699999");}
        catch(IllegalArgumentException e){
            assertEquals(IllegalArgumentException.class,e.getClass());
            assertEquals("Invalid atm card",e.getMessage());
        }
    }

    @Test
    public void validateVisaCard(){
        AtmValidation atmCheck = new AtmValidation("42345873456678");
        assertSame(AtmCard.VISA_CARD,atmCheck.getAtmCard() );
    }

    @Test
    public void validateMasterCard(){
        AtmValidation atmCheck = new AtmValidation("52345873456678");
        atmCheck.atmCardCheck("52345873456678");
        assertSame(AtmCard.MASTERCARD, atmCheck.getAtmCard());
    }
     @Test
    public void validateAmericanExpressCard(){
        AtmValidation atmCheck = new AtmValidation("3734587345667845");
        atmCheck.atmCardCheck("3734587345667845");
        assertSame(AtmCard.AMERICAN_EXPRESS, atmCheck.getAtmCard());
    }

     @Test
    public void validateDiscoveryCard(){
        AtmValidation atmCheck = new AtmValidation("6734587345667845");
        atmCheck.atmCardCheck("6734587345667845");
        assertSame(AtmCard.DISCOVERY_CARD, atmCheck.getAtmCard());
    }

    @Test
    public void checkForInvalidCardTest(){
        AtmValidation atmCheck = new AtmValidation("2734587345667845");
        atmCheck.atmCardCheck("2734587345667845");
        assertSame(AtmCard.INVALID_CARD, atmCheck.getAtmCard());
     }

     @DisplayName("evenDigitsOfAnAtmCardCanBeDoubledFromLeftToRight")
    @Test
     public void evenSecondDigitTest(){
        atmCheck.evenDigitDoubled("6734587345667845");
        assertEquals(38, atmCheck.getSum());
      }


     @DisplayName("oddDigitOfAnAtmCardCanBeDoubledFromLeftToRight")
     @Test
      public void oddDigitTest(){
        atmCheck.oddDigitDoubled("6734587345667845");
        assertEquals(42, atmCheck.getSum());
      }
 @Test
      public void sumOfOddAndEvenDigitTest(){
        atmCheck.sumOfOddAndEvenDigit("6734587345667845");
        assertEquals(80, atmCheck.getSum());
      }

 @Test
      public void validCardCheckTest(){
        atmCheck.checkCardValidity("6734587345667845");
     assertSame(AtmCard.VALID_CARD, atmCheck.getAtmCard());
      }

     @Test
      public void invalidCardCheckTest(){
        atmCheck.checkCardValidity("6734587345667844");
     assertSame(AtmCard.INVALID_CARD, atmCheck.getAtmCard());
      }

    @AfterEach
    void tearDown() {
    }
}
