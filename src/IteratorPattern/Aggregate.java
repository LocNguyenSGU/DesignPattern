package IteratorPattern;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
