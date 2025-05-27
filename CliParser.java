public class CliParser {
    
    public String action;
    public String command;
    
    public CliParser(String[] args)
    {
        getAction(args);
        getCommand(args);
    }


    public final String getAction(String[] args)
    {
        if(args.length == 0)
        {
            return "No input recieved";
        }else
        {
            return this.action = args[0];
        }
    }

    public final String getCommand(String[] args)
    {
        if(args.length <= 1)
        {
            return this.command = "No input recieved";
        }else
        {
            return  this.command = args[1];
        }
    }
    
}
