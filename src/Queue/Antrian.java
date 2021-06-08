/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author AVITA
 */
public class Antrian {
        private int ukuran;
        private long[] antrian;
        private int belakang;
        private int jumItem;
        private int depan;
        
        public Antrian (int s){
                ukuran = s;
                antrian = new long[ukuran];
                depan = 0;
                belakang = -1;
                jumItem = 0;
        }
        
        public void enqueue (long j) {
            if (!isFull()) {
                    antrian[++belakang] = j;
                    jumItem++;
            }
        }
        
        public long dequeue (){
        long temp = antrian[0];
        if (!isEmpty()){
            for (int i=0; i<jumItem; i++)
                antrian [i] = antrian [i+1];
                jumItem--;
                belakang--;
            }
            return temp;
      }
      
      public long peek(){
          return antrian[depan];
      }
      public boolean isEmpty(){
          return (jumItem==0);
      }
      public boolean isFull(){
          return (belakang==ukuran-1);
      }
      public int ukuran(){
          return jumItem;
      }

      public void display(){
          for (int i=0; i<jumItem; i++)
              System.out.print(antrian[i]+" ");
              System.out.println("");
      }
}