package comparators;

import animals.Wolf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WolfIterator implements Iterator<Wolf> {
    private final List<Wolf> wolfList;
    private int cursor;

    public WolfIterator(List<Wolf> wolfList) {
        this.wolfList = wolfList;
    }

    @Override
    public boolean hasNext() {
        return cursor < wolfList.size();
    }

    @Override
    public Wolf next() {
        return wolfList.get(cursor++);
    }
}
