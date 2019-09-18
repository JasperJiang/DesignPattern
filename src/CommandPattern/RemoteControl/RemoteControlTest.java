package CommandPattern.RemoteControl;

import CommandPattern.RemoteControl.commands.LightOffCommand;
import CommandPattern.RemoteControl.commands.LightOnCommand;
import CommandPattern.RemoteControl.components.Light;

public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        control.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        control.onButtonWasPressed(0);
        control.offButtonWasPressed(0);
        control.undoButtonWasPressed();
    }
}
