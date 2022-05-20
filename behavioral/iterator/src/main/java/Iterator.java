public interface Iterator {
    boolean hasNext();
    String getNext() throws Exception;
    void forEach() throws Exception;
}
