package codingimpossible.command_pattern.action.impl;

import codingimpossible.command_pattern.action.Action;

public class Action2 implements Action {

    private String name;

    public Action2(String name) {
        this.name = name;
    }


    @Override
    public void execute() {
        System.out.println("Executing Action 2");
    }

    @Override
    public void undo() {
        System.out.println("Undo Action 2");
    }

    @Override
    public String getName() {
        return this.name;
    }

}