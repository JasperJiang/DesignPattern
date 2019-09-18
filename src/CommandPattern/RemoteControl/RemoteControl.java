package CommandPattern.RemoteControl;

import CommandPattern.RemoteControl.commands.Command;
import CommandPattern.RemoteControl.commands.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl(){
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++){
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        this.onCommands[slot].execute();
        undoCommand = this.onCommands[slot];
    }

    public void offButtonWasPressed(int slot){
        this.offCommands[slot].execute();
        undoCommand = this.offCommands[slot];
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }
}
