package schule;

import java.util.*;
import java.lang.*;

public class Sort {
public Sort() {
  
  int[] feld = {7,9,3,19,1};         

 
      
}

public void bubbleSort(int[] feld) {
  
  boolean swap = true;
  int temp=0;
  int j=0;
  
  while (swap) {
    swap = false;
    j++;
    
   
    for (int i=0;i<feld.length-j ;i++ ) {
      
      if (feld[i] > feld[i+1]) {
        temp = feld [i];
        feld [i] = feld[i+1];
        feld[i+1] = temp; 
        swap = true;         
      } // end of if
    } // end of for
    
  } // end of while
  System.out.println(Arrays.toString(feld)+" ");   
  
}

public void selectionSort1(int [] feld) { 
  int n = feld.length;   
  
  for (int i=0;i<n ;i++ ) {
    feld[i]= (int) Math.round((19 * Math.random())+1); 
  } // end of for  
  
  System.out.println(Arrays.toString(feld) +" ");
  final long timeStart = System.currentTimeMillis();  
  
  for (int i=0;i<n ;i++ ) {
    for (int j=i+1;j<feld.length ;j++ ) {
      
      if (feld[i]>feld[j]) {
        int temp = feld[i];
        feld[i] = feld[j];
        feld[j] = temp;
        System.out.println(Arrays.toString(feld)+" ");      
      } // end of if
      else {
        System.out.println(Arrays.toString(feld) +" ");          
      } // end of if-else                 
      
    } // end of for
    
  } // end of for
  
  final long timeEnd = System.currentTimeMillis();
  System.out.println("Zeit für Selection Sort: " + (timeEnd - timeStart) + " Millisek, bei " +feld.length +" Elementen.");
  
  
}

public void selectionSort2(int[] feld)
{
  int  minimumPos, swapValue;
  for (int i = 0; i < feld.length - 1; i++)
  {
    minimumPos = i;
    for (int j = i + 1; j < feld.length; j++)
    {
      if (feld[j] < feld[minimumPos])
      {
        minimumPos = j;
      }
    }
    swapValue = feld[i];
    feld[i] = feld[minimumPos];
    feld[minimumPos] = swapValue;
  }
  System.out.println(Arrays.toString(feld) +", ");
}


public static int[] selectionSort3(int[] arr) {
  for (int i = 0; i < arr.length - 1; i++) {
    for (int j = i + 1; j < arr.length; j++) {
      if (arr[i] > arr[j]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
  
  return arr;
}

void ze() {
  int b=6;
  int h=5;
  
  System.out.print("+");
  for (int i=0;i<b-2 ;i++ ) {
    System.out.print("-");      
  } // end of for           
  System.out.print("+");
  System.out.println();
  
  for (int i=0;i<h-2 ; i++) {
    System.out.println("|");
    
    for (int j=0;j<b-2 ;j++ ) {
      System.out.print(" ");        
    } // end of for
    System.out.println("|");
  } // end of for
  System.out.println();
  
  System.out.print("+");
  for (int i=0;i<b-2 ;i++ ) {
    System.out.print("-");      
  } // end of for           
  System.out.print("+");
  
}

void insertionSort(int[] arr) {
  int j;
  
  for (int i=1;i<arr.length ;i++ ) {
    j = i;
    
    while (j>0 && arr[j-1] > arr[j]) {          
      int temp = arr[j];
      arr[j] = arr[j-1];  
      arr[j-1] = temp;          
      j--;      
    } // end of while   
  } // end of for
  
  System.out.println(Arrays.toString(arr));       
}      

  public static void main(String[] args) {
  
  new Sort();
  
  
  
} // end of main            


} // end of class Sort