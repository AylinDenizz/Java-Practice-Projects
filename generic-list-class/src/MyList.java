import java.util.Arrays;

public class MyList<T> {
    private Object[] array;
    private int capacity;
    private int size;

    public MyList() {
        this.capacity = 10; // default capacity
        this.array = new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public void setSize() {
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            if (array[i] != null) {
                size++;
            }
        }
        this.size = size;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int size() {
        return size;
    }

    public void add(T data) {
        if (size == 0) {
            this.array[this.size] = data;
            size++;
        } else {
            if (this.array[this.size - 1] == null) {
                this.array[this.size - 1] = data;
                size++;
            } else {
                if (size < capacity) {
                    this.array[size] = data;
                    size++;

                } else if (size == capacity) {

                    this.capacity *= 2;
                    Object[] newArray = new Object[capacity];
                    System.arraycopy(array, 0, newArray, 0, size);
                    array = newArray;
                    array[size + 1] = data;
                    size++;
                }
            }

        }
    }


    public T get(int index) {
        return (T) this.array[index];
    }

    public T remove(int index) {
        T element = null;
        this.size = size - 1;
        if (index < this.size - 1) {
            for (int i = index; i < this.size - 1; i++) {
                this.array[i] = this.array[i++];
            }
            this.array[this.size - 1] = null;
            element = (T) this.array[index];
        } else if (index == this.size - 1) {
            this.array[index] = null;
            element = (T) this.array[index];
        } else if (index > size - 1) {
            element = null;
        }
        return element;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "array=" + Arrays.toString(array) +
                ", capacity=" + capacity +
                ", size=" + size +
                '}';
    }

    public T set(int index, T data) {
        T element;
        if (index < size) {
            this.array[index] = data;
            element = data;
        } else {
            element = null;

        }
        return element;
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (data.equals(this.array[i])) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (data.equals(this.array[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(array, 0, size, null);
        size = 0;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    public MyList<T> subList(int start, int finish) {
        if (start < 0 || finish > size || start > finish) {
            throw new IndexOutOfBoundsException();
        }

        MyList<T> subList = new MyList<>(finish - start);
        System.arraycopy(array, start, subList.array, 0, finish - start);
        subList.size = finish - start;

        return subList;
    }

    @SuppressWarnings("unchecked")
    public T[] toArray() {
        T[] result = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            result[i] = (T) array[i];
        }
        return result;
    }


}


