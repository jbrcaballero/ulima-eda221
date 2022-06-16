/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.evaluaciones.ee02.simulacro;
import edu.ulima.eda.colas.Queue;
/**
 *
 * @author JC
 */

/*
    a) Implemente un TDA que extienda la funcionalidad de colas y, dado un entero n
    de 2 cifras, agregue cada dígito como elemento de la cola. Agregue primero
    el digito de las decenas y luego el digito de las unidaes.
    Ejemplo:
        P.enqueueAll(67);
        El llamado agregará a la cola el elemento 6 y el elemento 7.
*/

class QueueP04 extends Queue{
    public void enqueueAll(int n){
        int element1 = n / 10;
        int element2 = n % 10;
        this.enqueue(element1);
        this.enqueue(element2);
    }
}

public class Prob04 {
    public static void main(String[] args){
        QueueP04 q = new QueueP04();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.showElements();
        q.enqueueAll(98);
        q.showElements();
    }
    
}
