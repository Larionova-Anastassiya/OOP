import java.util.Scanner;

public class b {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  
  Scanner in = new Scanner (System.in);
  
  int queue = in.nextInt();
  
  int arr[]= new int [queue];
  
  for (int i=0; i<queue; i++) {
   
   arr[i] = in.nextInt();
   
  }
  
  // array complete 
  
  
  for (int i=0; i<queue; i++) {
   for(int j=i+1; j<queue;j++) {
    if(arr[i]!=arr[0]){
     if(arr[i]<arr[j]){
      System.out.println("-1");
      continue;
     }
     else if (arr[queue-1]==arr[i]){
      for(int b=queue-1;b>1;b--){
       for(int c=b-1;c>1;c--){
        if(arr[b]<arr[c]) {
         System.out.println(arr[c]);
         break;
        }
        else{
         System.out.println("-1");
         break;
        }
       }
      }
     }
     else {
      System.out.println(arr[i]);
      continue;
     }
    }
    else {
     System.out.println("-1");
     continue;
    }
   }
   
   
  }
  
  
  
  
  
  
 }

}