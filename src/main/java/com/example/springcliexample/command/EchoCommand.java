package com.example.springcliexample.command;

import com.example.springcliexample.shell.ShellHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class EchoCommand {

    @Autowired
    ShellHelper shellHelper;

    @ShellMethod("Displays greeting message to the user whose name is supplied")
    public String echo(@ShellOption({"-N", "--name"}) String name) {
        String output = shellHelper.getSuccessMessage(String.format("Hello %s!", name));
        return output.concat(" You are running spring shell cli-demo.");
    }
}
