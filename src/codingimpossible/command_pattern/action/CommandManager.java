package codingimpossible.command_pattern.action;

import java.util.List;

public class CommandManager {
    private static CommandManager instance = null;
    private QueueStack<List<Action>> queueStackNormal;
    private QueueStack<List<Action>> queueStackReverse;

    public static CommandManager getInstance(){
        if(instance != null)
            return instance;
        return new CommandManager();
    }

    private CommandManager() {
        queueStackNormal = new QueueStack<>();
        queueStackReverse = new QueueStack<>();
    }

    public void execute(List<Action> actionList){
        actionList.forEach(Action::execute);
        queueStackNormal.push(actionList);
    }

    public void undo() {
        List<Action> actionList = queueStackNormal.pop();
        actionList.forEach(Action::undo);
        queueStackReverse.push(actionList);
    }

    public void redo() {
        List<Action> actionList = queueStackReverse.pop();
        actionList.forEach(Action::execute);
        queueStackNormal.push(actionList);
    }

    public void clearNormal() {
        queueStackNormal.clear();
    }

    public void clearReverse() {
        queueStackReverse.clear();
    }

}