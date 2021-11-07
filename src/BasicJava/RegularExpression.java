package BasicJava;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String gmailPattern = "[a-zA-Z\\d]+@gmail\\.com";
        Pattern p = Pattern.compile(gmailPattern);
        String sampleText= "This is me12@gmail.com here to give you some gifts";
        Matcher m = p.matcher(sampleText);
        m.find();
        String gmailAddress = m.group();
        System.out.println(gmailAddress);

        //split sentences
        String sampleText2 = "Hey,there is a lila. How are you? I am fine!";
        String[] sentences = sampleText2.split("[\\.,?!]");
        System.out.println(Arrays.toString(sentences));


    }
}
