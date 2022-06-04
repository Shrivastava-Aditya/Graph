import java.util.*;
class Graph<T>{

  private Map<T, List<T>> map = new HashMap<>();

  public void addVertex(T s){
    map.put(s, new LinkedList<T>());
  }
  public void addEdge(T source,T destination, boolean bidirectional){
    if(!map.containsKey(source))
      addVertex(source);
    if(!map.containsKey(destination))
      addVertex(destination);
    map.get(source).add(destination);

    if(bidirectional == true)
      map.get(destination).add(source);
  }
  public static void main(String[] args){
    
  
}