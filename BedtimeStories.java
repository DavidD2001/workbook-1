import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the name of a story (example: goldilocks.txt): ");
        String fileName = userInput.nextLine();

        File storyFile = new File(fileName);

        try
        {
            Scanner fileScanner = new Scanner(storyFile);
            int lineNumber = 1;

            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }

            fileScanner.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: The file was not found. Please check the file name and try again.");
        }

        userInput.close();
    }
}

