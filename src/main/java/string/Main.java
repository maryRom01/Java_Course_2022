package string;

public class Main {
    public static void main(String[] args) {
        //Concatenation
        String firstName = "FirstName";
        String lastName = "LastName";

        String concatName1 = firstName + " " + lastName;

        //Function concat
        String concatName2 = (firstName.concat(" ")).concat(lastName);
        System.out.println(concatName2);

        //String builder - instead of creating bunch of new strings
        StringBuilder stringBuilder = new StringBuilder("xyz");
        stringBuilder.append("def");
        stringBuilder.append("ghi");
        stringBuilder.insert(0, "abc");
        stringBuilder.delete(3, 6);
        stringBuilder.append("xyz");
        stringBuilder.replace(9, 12, "jkl");
        String alpha = stringBuilder.toString();
        System.out.println(alpha);

        //String Buffer - thread safe, because its method are synchronized
        StringBuffer stringBuffer = new StringBuffer("xyz");
        stringBuffer.append("def");
        stringBuffer.append("ghi");
        stringBuffer.insert(0, "abc");
        stringBuffer.delete(3, 6);
        stringBuffer.append("xyz");
        stringBuffer.replace(9, 12, "jkl");
        String beta = stringBuilder.toString();
        System.out.println(beta);
    }
}
