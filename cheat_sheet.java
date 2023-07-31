ArrayList (java.util.ArrayList):

// Initialization:
import java.util.ArrayList;

ArrayList<DataType> list = new ArrayList<>();
// Or, with an initial capacity:
ArrayList<DataType> list = new ArrayList<>(initialCapacity);

// Commonly used methods:
list.add(element);           // Add an element to the end
list.get(index);             // Retrieve an element at the specified index
list.set(index, element);    // Replace an element at the specified index
list.remove(index);          // Remove the element at the specified index
list.size();                 // Get the number of elements in the list
list.contains(element);      // Check if the list contains the specified element
list.clear();                // Remove all elements from the list



HashMap (java.util.HashMap):

// Initialization:
import java.util.HashMap;

HashMap<KeyType, ValueType> map = new HashMap<>();
// Or, with an initial capacity:
HashMap<KeyType, ValueType> map = new HashMap<>(initialCapacity);

// Commonly used methods:
map.put(key, value);             // Add a key-value pair to the map
map.get(key);                    // Retrieve the value associated with the key
map.containsKey(key);            // Check if the map contains the specified key
map.containsValue(value);        // Check if the map contains the specified value
map.remove(key);                 // Remove the key-value pair with the specified key
map.size();                      // Get the number of key-value pairs in the map
map.keySet();                    // Get a Set of all keys in the map
map.values();                    // Get a Collection of all values in the map
map.clear();                     // Remove all key-value pairs from the map



HashSet (java.util.HashSet):

// Initialization:
import java.util.HashSet;

HashSet<DataType> set = new HashSet<>();

// Commonly used methods:
set.add(element);             // Add an element to the set
set.contains(element);        // Check if the set contains the specified element
set.remove(element);          // Remove the specified element from the set
set.size();                   // Get the number of elements in the set
set.clear();                  // Remove all elements from the set



LinkedList (java.util.LinkedList):

// Initialization:
import java.util.LinkedList;

LinkedList<DataType> linkedList = new LinkedList<>();

// Commonly used methods:
linkedList.add(element);         // Add an element to the end of the linked list
linkedList.addFirst(element);    // Add an element to the beginning of the linked list
linkedList.addLast(element);     // Add an element to the end of the linked list
linkedList.get(index);           // Retrieve an element at the specified index
linkedList.set(index, element);  // Replace an element at the specified index
linkedList.remove(index);        // Remove the element at the specified index
linkedList.removeFirst();        // Remove and return the first element
linkedList.removeLast();         // Remove and return the last element
linkedList.size();               // Get the number of elements in the linked list
linkedList.isEmpty();            // Check if the linked list is empty



TreeSet (java.util.TreeSet):

// Initialization:
import java.util.TreeSet;

TreeSet<DataType> treeSet = new TreeSet<>();

// Commonly used methods:
treeSet.add(element);         // Add an element to the tree set
treeSet.contains(element);    // Check if the tree set contains the specified element
treeSet.remove(element);      // Remove the specified element from the tree set
treeSet.size();               // Get the number of elements in the tree set
treeSet.isEmpty();            // Check if the tree set is empty
treeSet.first();              // Get the first (lowest) element in the tree set
treeSet.last();               // Get the last (highest) element in the tree set
treeSet.lower(element);       // Get the greatest element less than the given element
treeSet.higher(element);      // Get the smallest element greater than the given element



PriorityQueue (java.util.PriorityQueue):

// Initialization:
import java.util.PriorityQueue;

PriorityQueue<DataType> priorityQueue = new PriorityQueue<>();

// Commonly used methods:
priorityQueue.add(element);          // Add an element to the priority queue
priorityQueue.remove();              // Remove and return the highest-priority element
priorityQueue.peek();                // Retrieve the highest-priority element without removing it
priorityQueue.size();                // Get the number of elements in the priority queue
priorityQueue.isEmpty();             // Check if the priority queue is empty



Stack (java.util.Stack):

// Initialization:
import java.util.Stack;

Stack<DataType> stack = new Stack<>();

// Commonly used methods:
stack.push(element);          // Push an element onto the stack
stack.pop();                  // Remove and return the top element from the stack
stack.peek();                 // Retrieve the top element without removing it
stack.isEmpty();              // Check if the stack is empty
stack.size();                 // Get the number of elements in the stack
