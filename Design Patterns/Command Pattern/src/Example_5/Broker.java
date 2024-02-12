package Example_5;

import java.util.Stack;

public class Broker {
    Stack<Command> commands = new Stack<>();
    public void addToCommandList(Command command){
        commands.add(command);
    }
    public Command undo(){
         return commands.pop();
    }
    public void executeCommands(){
        for(Command command:commands){
            command.executeCommand();
        }
        commands.clear();
    }
}
