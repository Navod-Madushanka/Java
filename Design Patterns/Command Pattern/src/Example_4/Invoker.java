package Example_4;

import java.util.Stack;

public class Invoker {
    Stack<Command> commands = new Stack<>();
    public void addCommands(Command command){
        commands.add(command);
    }
    public Command undoCommand(){
         return commands.pop();
    }

    public void executeCommands(){
        for(Command command: commands){
            command.executeCommand();
        }
        commands.clear();
    }
}
