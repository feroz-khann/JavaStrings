public class Exp1 {
    public static void main(String[] args) {
        String firstName = "Feroz";
        String lastName = "Feroz";
        String str = "123";

        System.out.println(firstName +" "+ lastName);
        System.out.println(firstName.length());

        if(firstName.compareTo(lastName)==0){
            System.out.println("They are equal string");
        }else{
            System.out.println("They are not equal Strings");
        }

        System.out.println(firstName.substring(2));
        int number = Integer.parseInt(str);
        System.out.println(number);
    }
    

}