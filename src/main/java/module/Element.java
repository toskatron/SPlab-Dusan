package module;

public interface Element extends Cloneable {
    void print();
    Element clone() throws CloneNotSupportedException;
}
