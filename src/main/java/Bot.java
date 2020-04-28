import commands.Startcom;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

import java.io.File;
import java.util.Scanner;


public class Bot {

    public static void main(String[] args) throws Exception{
        Scanner fileScanner = new Scanner(new File("src/main/java/tokenFile.txt"));
        String tokenString = fileScanner.nextLine();

        Token tokenObject = new Token(tokenString);

        JDA jda = new JDABuilder(tokenObject.getTokenString()).build();

        //jda.addEventListener(new HelloEvent());
        jda.addEventListener(new Startcom());


    }
}
