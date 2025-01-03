package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class UserCollection implements Aggregate<User>{
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }
    public void removeUser(User user) {
        users.remove(user);
    }

    @Override
    public Iterator<User> createIterator() {
        return new UserIterator();
    }
    // Inner class triển khai Iterator
    private class UserIterator implements Iterator<User> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < users.size();
        }

        @Override
        public User next() {
            return users.get(currentIndex++);
        }
    }
}
