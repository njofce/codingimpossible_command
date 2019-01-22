package codingimpossible.command_pattern;

import codingimpossible.command_pattern.action.Action;
import codingimpossible.command_pattern.action.CommandManager;
import codingimpossible.command_pattern.action.impl.Action1;
import codingimpossible.command_pattern.action.impl.Action2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CommandManager manager = CommandManager.getInstance();
        List<Action> actionList = new ArrayList<>();
        actionList.add(new Action1());
        actionList.add(new Action2());
        manager.execute(actionList);

        manager.undo();
        manager.redo();
    }
}
