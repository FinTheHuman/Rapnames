public class MyProgram extends ConsoleProgram
{

    public void run()
    {
         String firstName = readLine("What is your first name? ");
         String lastName = readLine("What is your last name? ");
         String question = readLine("Are you all about that money? ");
         
        String [] rapName = new String[] {"The Wrapper" + " " + lastName, "But i'm not a wrapper" + " " + lastName, lastName.charAt(0) + " " + "$wag", "$wagHaze", "EmpathyRhymes" + " " + lastName, "GetMoney" + " " + lastName, "the pretty pink princess who rides unicorns that poops rainbow icecream and spits fire", "mixtape so hot it melts your pot" + " " + lastName, "mixtape so fire it will make you perspire" + " " + lastName, "you used to call me on my cellphone" + " " + lastName, "back 2 back" + " " + lastName, "mixt@pe he@t" + " " + lastName, "legend rhymes" + " " + lastName, "league of rhymes" + " " + lastName, "mixtape so frizzy it will make you dizzy" + " " + lastName};
        
       
        
        int random = Randomizer.nextInt(0,14);
        
        if(question.equals("no") || question.equals("nah") || question.equals("nope") || question.equals("No") || question.equals("Nah"))
        {
            System.out.println("Then you don't get a rap name.");
        }
        else
        {
            System.out.println("Your rap name is: " + firstName +" "+ rapName[random]);
        }
    }
}
