public class cliParser
{
    String[] cliArg;

    public cliParser(String[] cliArg)
    {
        checkIfthereIsCliArg(cliArg);
    }


    public static void checkIfthereIsCliArg(String[] cliArg)
    {
        if(cliArg.length < 0)
        {
            System.out.println("No arguments recieved");
        }else
        {
            this.cliArg = cliArg;
            System.out.println("arguments recieved");
        }
    }
}