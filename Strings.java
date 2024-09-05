public class Strings {
    public static void main(String[] args) {
        String firstName="vikash";
        String lastName="vikahsh";
        String fullName=firstName.concat(lastName);
        String fullName2=firstName+lastName;
        String myDes="Hi i am a boy my name is vikash dubey i am in class 7. My name is vikash because my father has kept";

        System.out.println(fullName);
        System.out.println(fullName2);
        System.out.println(firstName.charAt(3));
        System.out.println(firstName.substring(3));
        System.out.println(firstName.substring(2,5));
        System.out.println(firstName.equals(lastName));
        System.out.println(myDes.contains("vikash"));








    }
}
