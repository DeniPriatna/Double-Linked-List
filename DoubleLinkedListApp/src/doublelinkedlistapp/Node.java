/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlistapp;

/**
 *
 * @author XiauXiau
 */
public class Node {
     int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
    }

    public void tampil(){
        System.out.print("{"+data+"}");
    }
}
