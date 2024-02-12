package Example_3;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    List<Command> commands = new ArrayList<Command>();
    public void addCommand(Command command){
        commands.add(command);
    }
    public void executeCommands(){
        for(Command command:commands){
            command.executeCommand();
        }
        commands.clear();
    }
}
