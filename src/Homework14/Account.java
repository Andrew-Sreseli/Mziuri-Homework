package Homework14;


public class Account {
    private final String name;
    private final String surname;
    private final String SSN;
    private final String username;
    private final String password;
    private final int yearOfBirth;
    private final int monthOfBirth;
    private final int dayOfBirth;
    Account(String name,String surname,String SSN,String username,String password,int yearOfBirth,int monthOfBirth,int dayOfBirth){
        this.name=name;
        this.surname=surname;
        this.SSN=SSN;
        this.username=username;
        this.password=password;
        this.yearOfBirth=yearOfBirth;
        this.monthOfBirth=monthOfBirth;
        this.dayOfBirth=dayOfBirth;
    }
    String getName(){
        return name;
    }
    String getSurname(){
        return surname;
    }
    String getSSN(){
        return SSN;
    }
    String getUsername(){
        return username;
    }
    String getPassword(){
        return password;
    }
    int getYearOfBirth(){
        return yearOfBirth;
    }
    int getMonthOfBirth(){
        return monthOfBirth;
    }
    int getDayOfBirth(){
        return dayOfBirth;
    }
    class IncorrectNameException extends Exception{
        void checkName(String s){
            if(s.length()<2){
                throw new ArithmeticException("Information wrongfully filled. Name has to be at least 2 symbols");
            }
            else System.out.println(s);
        }
    }
    class IncorrectSurnameException extends Exception{
        void checkSurname(String s){
            if(s.length()<3){
                throw new ArithmeticException("Information wrongfully filled. Surname has to be at least 3 symbols");
            }
            else System.out.println(s);
        }
    }
    class IncorrectSSNException extends Exception{
        void checkSSN(String s){
            if(s.length()!=11){
                throw new ArithmeticException("Information wrongfully filled. Social security number has to be exactly 11 symbols");
            }
            else System.out.println(s);
        }
    }
    class IncorrectYearOfBirthException extends Exception{
        void checkYearOfBirth(int n){
            if(n>=2024){
                throw new ArithmeticException("Information wrongfully filled. Year of birth has to be lower than the current year");
            }
            else System.out.println(n);
        }
    }
    class IncorrectDayOfBirthException extends Exception{
        void checkDayOfBirth(int n){
            if(n>=1 && n<=31){
                throw new ArithmeticException("Information wrongfully filled. Day of birth is an inaccurate number (not 1-31)");
            }
            else System.out.println(n);
        }
    }
    class IncorrectMonthOfBirthException extends Exception{
        void checkMonthOfBirth(int n){
            if(n>=1 && n<=12){
                throw new ArithmeticException("Information wrongfully filled. Month of birth is an inaccurate number (not 1-12)");
            }
            else System.out.println(n);
        }
    }
    class IncorrectUsernameException extends Exception{
        void checkUsername(String s){
            if(s.length()<4){
                throw new ArithmeticException("Information wrongfully filled. Username has to be at least 4 symbols");
            }
            else System.out.println(s);
        }
    }
    class IncorrectPasswordException extends Exception{
        void checkPassword(String s){
            if(s.length()>=8 && s.length()<=15){
                throw new ArithmeticException("Information wrongfully filled. Password is an inaccurate symbol amount (not 8-15)");
            }
            else System.out.println(s);
        }
    }

}


