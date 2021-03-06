package ua.kiev.prog.visitor;

public interface CarVisitor {
    void visit(Engine engine);
    void visit(Wheel wheel);
    void visit(Door door);
    void visit(Car car);
}
