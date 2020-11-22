import java.security.SecureRandom;

public class CutomerTest {
    public static void main(String[] args) {
//        if(isValidPassword("jadgG+-0h%kf78")){
//            System.out.println("Password is correct");
//        }else{
//            System.out.println("Password is incorrect");
//        }
        System.out.println(generatePassword());
    }
    public static boolean isValidPassword(String password){
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
    public static String generatePassword(){
        String password="";
        String digits="1234567890";
        String small="abcdefghijklmnopqrstuvwxyz";
        String capital="ABCDEFGHIJKLNMPPQRSTUVWXYZ";
        String symbol="!@#$%^&*()-+=";
//        String digits="^(?=.*[0-9])";
//        String small="(?=.*[a-z])";
//        String capital ="(?=.*[A-Z])";
//        String symbol="(.*[@,#,$,%,&,!,(,),-,+,=,^,*].*$)";
        while(password.length()!=12){
            SecureRandom randomNumber= new SecureRandom();
            password+=small.charAt(1+ randomNumber.nextInt(small.length()-1));
            password+=digits.charAt(1+ randomNumber.nextInt(digits.length()-1));
            password+=capital.charAt(1+ randomNumber.nextInt(capital.length()-1));
            password+=symbol.charAt(1+ randomNumber.nextInt(symbol.length()-1));
        }
        return password;
    }

}
