public class CliParser {
    
    public String action;
    public String command;
    
    public CliParser(String[] args)
    {
        getAction(args);
        getCommand(args);
    }


    public final String getCommand(String[] args)
    {
        if(args.length == 0)
        {
            return this.command= "No command line arguments recieved";
        }else
        {
            return this.command = args[0];
        }
    }

    public final String getAction(String[] args)
    {
        if(args.length <= 1)
        {
            return this.action = "No command instruction recieved";
        }else
        {
            return  this.action = args[1];
        }
    }
    
}
