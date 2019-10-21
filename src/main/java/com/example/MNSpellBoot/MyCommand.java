package com.example.MNSpellBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import com.example.MNSpellBoot.Repository.BookRepository;

@ShellComponent
public class MyCommand {

    @Autowired
    private BookRepository bookRepository;

    @ShellMethod(value = "Add data", key = "sum")
    public void add() {
        bookRepository.flush();
    }

    @ShellMethod("Display stuff.")
    public String echo(int a, int b, int c) {
        return String.format("You said a=%d, b=%d, c=%d", a, b, c);
    }
}
