package ua.kiev.prog.absfactory;

public class JsonMessage implements Message {
    @Override
    public String toString() {
        return "{\"msg\":\"Hello\"}";
    }
}
