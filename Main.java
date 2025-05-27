public class Main {
    public static void main(String[] args) {
        CliParser cliParser = new CliParser(args);
        
        switch (cliParser.action) 
        {
            case "add" -> {
            }
            case "update" -> {
            }
            case "delete" -> {
            }
            default -> System.out.println("unrecognized input: "+ cliParser.action);
        }
        
    }
}
