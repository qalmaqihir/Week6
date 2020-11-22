import java.security.SecureRandom;

public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String cardNumber;
    private int pin;
    private String username;
    private String password;
    public Customer(String firstName, String lastName, String address,
                    String cardNumber, int pin, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
        if(isValidPassword(password)){
            this.password=password;
        }else{
            this.password="DefaultPassword@20";
        }

    }
    public Customer(String firstName,String lastName,String address
    ,String cardNumber, int pin, String username){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.pin= pin;
        this.username=username;
        this.password=generatePassword();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isValidPassword(String password){
        boolean digit=false;
        boolean small=false;
        boolean capital = false;
        boolean symbol=false;
        boolean lenght=false;
        if (password.length()>8 || password.length()<20){
            lenght=true;
        }
        if(password.matches("(.*[@,#,$,%,&,!,(,),-,+,=,^,*].*$)")){
            symbol=true;
        }
        for (int i = 0; i <password.length() ; i++) {
            if(Character.isDigit(password.charAt(i))){
                digit=true;
                continue;
            }
            if(Character.isLowerCase(password.charAt(i))){
                small=true;
                continue;
            }
            if(Character.isUpperCase(password.charAt(i))){
                capital=true;
                continue;
            }

        }
        return digit && small && capital && lenght && symbol;
    }
    public String generatePassword(){
        String password="";
        String digits="^(?=.*[0-9])";
        String small="(?=.*[a-z])";
        String capital ="(?=.*[A-Z])";
        //String symbol="(.*[@,#,$,%,&,!,(,),-,+,=,^,*].*$)";
        String symbol="@#$%";
        while(password.length()!=12){
            SecureRandom randomNumber= new SecureRandom();
            password+=small.charAt(1+ randomNumber.nextInt(small.length()-1));
            password+=digits.charAt(1+ randomNumber.nextInt(digits.length()-1));
            password+=capital.charAt(1+ randomNumber.nextInt(capital.length()-1));
            password+=symbol.charAt(1+ randomNumber.nextInt(symbol.length()-1));
        }
        return password;
    }

    @Override
    public String toString() {
        return String.format("Customer [firstName='%s', lastName='%s', cardNumber='%s', pin='%d', username='%s', password='%s', address='%s']",
                firstName,lastName,cardNumber,pin,username,password,address);
    }
}
