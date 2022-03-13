package Model;


public class LinkList<T extends Comparable<T>> {
    private Link<T> first;

    public LinkList() {
        first = null;
    }

    
    /** 
     * Retorna si la lista esta vacia
     * @return boolean
     */
    public boolean isEmpty() {
        return (first == null);
    }

    
    /** 
     * Retorna el primer elemento de la lista
     * @param dd
     */
    public void insertFirst(T dd) {
        Link<T> newLink = new Link<>(dd);
        newLink.setNext(first);
        first = newLink;
    }

    
    /** 
     * Elimina el primer elemento de la lista
     * @return Link<T>
     */
    public Link<T> deleteFirst() {
        Link<T> temp = null;
        if (!isEmpty()) {
            temp = first;
            first = first.getNext();
        }
        return temp;
    }

    public void displayList() {
        System.out.print("List (first--> ");
        Link<T> current = first;
        while (current != null) {
            current.displayLink();
            current = current.getNext();
        }
        System.out.println("<--last)");
    }

    
    /** 
     * Método para recorrer la lista
     * @return Link<T>
     */
    private Link<T> recorreLista() {
        Link<T> current;
        current = this.first;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        return current;
    }

    
    /** 
     *  Método para devolver el primer elemento sin eliminarlo
     * @return Link<T>
     */
    public Link<T> obtenerPrimerElemento() {
        return this.first;
    }

    
    /** 
     * Método para devolver el último elemento de la lista
     * @return Link<T>
     */
    public Link<T> obtenerUltimoElemento() {
        return this.recorreLista();
    }

    
    /** 
     * Método que retorne el size de la lista
     * @return int
     */
    public int size() {
        Link<T> current;
        int i = 0;
        current = this.first;
        while (current != null) {
            current = current.getNext();
            i++;
        }

        return i;
    }

    
    /** 
     *  Método para insertar un elemento antes de uno proporcionado
     * @param dd
     * @param datoABuscar
     */
    public void insertarAntesDeUnElemento(T dd, T datoABuscar) {
        Link<T> elementoInsertar = new Link<>(dd);
        Link<T> current;
        current = first;

        if (current.getdData().compareTo(datoABuscar) == 0) {
            Link<T> temp = first;
            elementoInsertar.setNext(temp);
            first = elementoInsertar;
            return;
        } else {
            while (current != null) {
                if (current.getNext().getdData().compareTo(datoABuscar) == 0) {
                    Link<T> temp = current.getNext();
                    elementoInsertar.setNext(temp);
                    current.setNext(elementoInsertar);
                    break;
                }
                current = current.getNext();
            }
        }
    }

    
    /** 
     * Método para insertar un elemento despues de uno proporcionado
     * @param dd
     * @param referenceddd
     */
    
    public void insertarDespuesDeUnElemento(T dd, T referenceddd) {
        Link<T> elementoInsertar = new Link<>(dd);
        Link<T> current;
        current = first;

        while (current != null) {
            if (current.getdData().compareTo(referenceddd) == 0) {
                Link<T> temp = current.getNext();
                elementoInsertar.setNext(temp);
                current.setNext(elementoInsertar);
                return;
            } 
            current = current.getNext();
        }
    }

    
    /** 
     * Método para insertar un elemento de forma ordenada Creciente
     * @param dd
     */
    public void insertAscending(T dd) {
        Link<T> current = first;

        if (isEmpty()) {
            insertFirst(dd);
            // Debug
            // displayList();

            // System.out.println(first);
        } else {
            while (current != null) {
                if (current.getdData().compareTo(dd) > 0 && current.getNext() == null) {
                    
                    insertFirst(dd);
                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.getNext() != null
                        && current.getNext().getdData().compareTo(dd) > 0) {
                    this.insertarDespuesDeUnElemento(dd, current.getdData());
                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.getNext() == null) {
                    
                    Link<T> nodoNuevo = new Link<>(dd);
                    if(isEmpty()){
                        first = nodoNuevo;
                    }else{
                        Link<T> temp;
                        temp = this.recorreLista();
                        temp.setNext(nodoNuevo);
                    }
                    
                    
                    // Debug
                    // displayList();
                    return;
                }
                current = current.getNext();
            }
        }
    }

    
    /** 
     * Método para insertar un elemento de forma ordenada Decreciente
     * @param dd
     */
    public void insertDescending(T dd) {
        Link<T> current = first;

        if (isEmpty()) {
            insertFirst(dd);
            // Debug
            // displayList();

            // System.out.println(first);
        } else {
            while (current != null) {
                if (current.getdData().compareTo(dd) > 0 && current.getNext() == null) {
                    Link<T> nodoNuevo = new Link<>(dd);
                    if(isEmpty()){
                        first = nodoNuevo;
                    }else{
                        Link<T> temp;
                        temp = this.recorreLista();
                        temp.setNext(nodoNuevo);
                    }

                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) >= 0 && current.getNext() != null
                        && current.getNext().getdData().compareTo(dd) < 0) {
                        insertarDespuesDeUnElemento(dd, current.getdData());
                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.getNext() == null) {
                    insertFirst(dd);
                    // Debug
                    // displayList();
                    return;
                }
                current = current.getNext();
            }
        }
    }

    
    /** Método para eliminar un elemento proporcionando su dato
     * @param datoAEliminar
     */
    public void eliminarElementoConDato(T datoAEliminar) {
        Link<T> current = first;
        if (first.getdData().compareTo(datoAEliminar) == 0) {
            first = first.getNext();
        } else {
            while (current != null) {
                if (current.getNext().getdData().compareTo(datoAEliminar) == 0) {
                    Link<T> temp = current.getNext().getNext();
                    current.setNext(temp);;
                    return;
                }
                current = current.getNext();
            }
        }
    }

    
    /** 
     * Método para eliminar un elemento proporcionando su indice
     * @param index
     */
    public void eliminarElemento(int index) {
        Link<T> current;
        Link<T> previous = first;
        current = first;

        if (index > this.size()) {
            System.out.println("El indice es más grande que el tamaño de la lista");
        } else {
            for (int i = 1; i < index; i++) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(current.getNext());
            current.setNext(null);
        }
    }

    // Método 9: Limpiar una lista
    public void limpiarLista() {
        first = null;
    }

    
    /** 
     * Método para buscar un elemento
     * @param elemento
     * @return int
     */
    public int buscarElemento(T elemento) {
        int i = 1;
        Link<T> current;
        current = first;

        while (current != null) {
            if (current.getdData() == elemento) {
                return i;
            }
            current = current.getNext();
            i++;
        }
        return -1;
    }

    
    /** 
     * Método para reemplazar un nodo por otro nodo mediante una posición
     * @param dd
     * @param index
     */
    public void reemplazarElemento(T dd, int index) {
        Link<T> elemento = new Link<>(dd);
        Link<T> current;
        Link<T> previous = first;
        current = first;

        if (index > this.size()) {
            System.out
                    .println("El indice indicando para reemplazar el elemento es más grande que el tamaño de la lista");
        } else {
            if (index == 1) {
                elemento.setNext(first.getNext());
                first = elemento;
            } else {
                for (int i = 1; i < index; i++) {
                    previous = current;
                    current = current.getNext();
                }
                previous.setNext(elemento);
                elemento.setNext(current.getNext());
            }
        }
    }

}