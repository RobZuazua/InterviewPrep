import java.io.*;
import java.util.*;

class BreadthFirstSearch{

        class Graph{
            
            private int numVertices;
            private LinkedList<Integer> adjList[];
            
            public Graph(int v){
                numVertices = v;
                adjList = new LinkedList[v];
                for(int i = 0; i < v; i++){
                    adjList[i] = new LinkedList();
                }
            }
            
            public void addEdge(int v1, int v2){
                adjList[v1].add(v2);
            }
            
            public void BFS(int source){
                
                boolean [] visited = new boolean[numVertices];
                
                LinkedList<Integer> queue = new LinkedList<Integer>();
                
                visited[source] = true;
                queue.add(source);
                
                while(queue.size() !=0){
                    source =queue.poll();
                    
                    Iterator<Integer> i = adjList[source].listIterator();
                    while(i.hasNext()){
                        int j = i.next();
                        if(!visited[j]){
                            visited[j] = true;
                            queue.add(j);
                        }
                        
                    }
                    
                    
                }
                
                
                
            }
            
            
            
            
        }

        public static void main(String[] args) {
        	//code
        }
}