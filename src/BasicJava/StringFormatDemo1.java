package BasicJava;

public class StringFormatDemo1 {
    public static void main(String[] args) {
        String firstname = "Sabin";
        String greetingFormat = "Hello, Mr. %s ! Good %s" ;
        String morning = "Morning";
        String formattedString = String.format(greetingFormat,firstname,morning);
        System.out.println(formattedString);
    }
}
