import java.io.*;
import java.util.*;

class DepthFirstSearch{


	//Begin Here
	class Graph{
		int numVertex;
		LinkedList<Integer> adjacencyList[];

		public Graph(int v){
			numVertex = v;
			adjacencyList= new LinkedList[v];
			for(int i = 0; i < v; i++){
				adjacencyList[i] = new LinkedList();
			}
		}

		public void addEdge(int v1,int v2){
			adjacencyList[v1].add(v2);
		}

		public void DFS(int source){

			boolean[] visited = new boolean[numVertex];
			DFSHelper(source, visited);
		}

		public void DFSHelper(int source, boolean[] visited){

			visited[source]= true;

			Iterator<Integer> i = adjacencyList[source].listIterator();

			while( i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					DFSHelper(n,visited);
				}
				}
			}



		}

		


	




















public static void main(String[] args) {
        	//code
        }
}