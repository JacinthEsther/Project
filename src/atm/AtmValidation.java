package atm;

public class AtmValidation {

    private String number;
    private AtmCard cardType ;
    private int Sum = 0;
    private int sumTotal = 0;

    public AtmValidation(String number) {

        validate(number);
        atmCardCheck(number);
//        validateFirstDigit(number);
            this.number = number;
    }
    public  AtmCard atmCardCheck(String number){

        if(number.charAt(0) == '4'){return this.cardType = AtmCard.VISA_CARD;}
        else if (number.charAt(0) == '5'){ return this.cardType = AtmCard.MASTERCARD;}
        else if (number.charAt(0) == '3' && number.charAt(1) == '7'){
            return this.cardType = AtmCard.AMERICAN_EXPRESS;}
        else if (number.charAt(0) == '6'){ return this.cardType = AtmCard.DISCOVERY_CARD;}
//        else if (sumTotal% 10 == 0){return this.cardType = AtmCard.VALID_CARD;}
        else return this.cardType = AtmCard.INVALID_CARD;
    }
    private static void validate(String number) {
        if (number.length() < 13 || number.length() > 16) {
            throw new IllegalArgumentException("Invalid atm number");
        }
    }
    public  void validateFirstDigit(String number) {
            if (Character.getNumericValue(number.charAt(0)) != 6){
//                System.out.println(Character.getNumericValue(number.charAt(0)));
                throw new IllegalArgumentException("Invalid atm card");
            }
            else if (Character.getNumericValue(number.charAt(0)) != 4){
                throw new IllegalArgumentException("Invalid atm card");
            }
            else if(Character.getNumericValue(number.charAt(0)) != 5){
                throw new IllegalArgumentException("Invalid atm card");
            }
            else if ((Character.getNumericValue(number.charAt(0)) != 3 &&
                    Character.getNumericValue(number.charAt(1)) != 7)){
                throw new IllegalArgumentException("Invalid atm card");
            }
            else this.number = number;


    }

    public String getNumber() {
        return number;
    }

    public AtmCard getAtmCard() {
        return cardType;
    }

    public void evenDigitDoubled(String number) {
        for (int i = number.length()-1; i >= 0; i--){
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            if(i % 2 != 0) {
                Sum = digit * 2;
                  if (Sum > 9){
                    Sum = (Sum / 10) + (Sum % 10);
                }
                sumTotal += Sum;

            }
        }
    }

    public int getSum() {
        return sumTotal;
    }

    public void oddDigitDoubled(String number) {
        for (int i = number.length()-1; i >= 0; i--){
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            if(i % 2 == 0) {

                sumTotal += digit;
            }


        }
    }
        public void checkCardValidity(String number){
        if (sumOfOddAndEvenDigit(number) % 10 == 0){
            cardType = AtmCard.VALID_CARD;
        }
        else cardType = AtmCard.INVALID_CARD;
        }

    public int sumOfOddAndEvenDigit(String number) {
        int totalOdd = 0;
        int totalEven = 0;
        for (int i = number.length()-1; i >= 0; i--){
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            if(i % 2 != 0) {
                Sum = digit * 2;
                if (Sum > 9) {
                    Sum = (Sum / 10) + (Sum % 10);
                }
                totalOdd += Sum;

            }
            if(i % 2 == 0) {
                totalEven += digit;

            }
          sumTotal = totalOdd + totalEven;


            }
        return sumTotal;
        }


}
