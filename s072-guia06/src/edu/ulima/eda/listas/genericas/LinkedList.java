/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.listas.genericas;

/**
 *
 * @author JC
 */
public class LinkedList<T> {
    private Node<T> L;        
    //Constructor
    public LinkedList(){
        L = null;
    }
    
    public Node<T> getL(){
        return L;
    }
        
    //Insertar al inicio
    public void addFirst(T value){
        //Crear nuevo nodo
        Node newNode = new Node(value);
        //Si la lista esta vacia
        if(L == null){
            //Unico elemento, no tiene sucesor
            newNode.setNext(null);
        //Si no esta vacia
        }else{
            //El sucesor de newNode debe ser el primero de la lista original
            newNode.setNext(L);
        }
        L = newNode;    
    }
        
    //Mostrar elementos
    public void showElements(){
        //Obtener referencia al primer nodo (variable ptr)
        Node ptr = L;
        //Mientras existan mas nodos por procesar
        while(ptr != null){
            //Mostrar valor del elemento actual: ptr.value()
            System.out.print(ptr.value() + " -> ");
            //Desplazarse al siguiente elemento
            ptr = ptr.next();
        }
        System.out.println("null");
    }
       
    public void addLast(T value){
	//Crear nuevo nodo
	Node newNode = new Node(value); 
	//Si la lista esta vacia, insertar al inicio
	if(L == null){
            addFirst(value);
	}else{
            //Si no esta vacia, recorremos hasta encontrar el ultimo nodo
            Node ptr = L;
            //Ultimo nodo: aquel que tiene como siguiente (next) el valor null
            while(ptr.next() != null){
                    ptr = ptr.next();
            }  
            ptr.setNext(newNode);        
            //El siguiente del nodo creado debe ser nulo (es el ultimo)
            newNode.setNext(null);
	}
    }
    
    public void addBefore(T ref, T item){
	//Creacion de nuevo nodo
        Node newNode = new Node(item);  	 
        //ptr: nodo referencia - prev: nodo anterior a "ptr"
	Node ptr = L, prev = null;
	while(ptr != null && !ptr.value().equals(ref)){//Se detiene al encontrar el elemento "ref"
            prev = ptr; //Antes de "avanzar" dejo una referencia al elemento anterior
            ptr = ptr.next();
	} //Luego del bucle, "ptr" apunta al nodo de valor "ref" (si existe) 

	if(ptr != null){//Solo si existe el elemento con valor "ref"
            if(prev == null){//Si el elemento encontrado es el primero
                    addFirst(item);//Agregar elemento al inicio
            }else{
                    //El nodo anterior (prev) tendra como sucesor al nodo que hemos creado
                    prev.setNext(newNode);
                    //El nodo siguiente de nuevoNodo debe ser el de valor "ref" (ptr)
                    newNode.setNext(ptr);        
            }        
	}
    }

    public void removeFirst(){
	if(L != null){//Si la lista no esta vacia
            L = L.next(); // L.next es el nuevo nodo inicial
	}
    }
    
    public void removeLast(){
	Node ptr = L;
	Node prev = null;
	if(ptr != null){ //Lista no vacia
            while(ptr.next() != null){ //para encontrar el ultimo elemento
                prev = ptr;
                ptr = ptr.next();
            }// Al salir del bucle: ptr - ultimo nodo, prev - penultimo nodo
            if(prev == null){//Si la lista tiene solo un elemento
                removeFirst();
            }else{
                //Penultimo nodo ahora sera el ultimo
                prev.setNext(null);
            }
	}
    }

    public void remove(T ref){
	if(L != null){ //Lista no vacia
            if(L.value() == ref){ //Si es el primer nodo
                removeFirst();
            }else{
                Node ptr = L.next();
                Node prev = L;
                //Buscar el nodo con valor ref (ptr) y su predecesor (anterior)
                while(ptr != null && !ptr.value().equals(ref)){
                        prev = ptr;
                        ptr = ptr.next();
                }
                if(ptr != null){ //Si se encontro el elemento
                        prev.setNext(ptr.next());                   
                }
            }
	}
    }   
}
