
public interface Cola {
public int size();
public void push(Object e) throws FullQueueException;
public Object pop() throws EmptyQueueException;
}
