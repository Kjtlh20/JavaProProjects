package ua.kiev.prog.absfactory;

public abstract class AbstractFactory {
    public abstract Message createMessage();
    public abstract Sender createSender();
}
