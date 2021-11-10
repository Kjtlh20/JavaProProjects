package ua.kiev.prog.visitor;

public interface CarPart {
    void accept(CarVisitor visitor);
}
