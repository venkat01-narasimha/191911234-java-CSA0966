import java.util.*;
class generic 
{  
public static <E extends Comparable<E>> void sortArray( E[] inputArray ) 
{
E temp;
System.out.println("Before soring :");
for(int i=0; i< inputArray.length;i++) 
{		  
System.out.printf("%s ", inputArray[i]);
}
for(int i=0; i< inputArray.length;i++) 
for ( int j=i+1; j<inputArray.length;j++)
{
if ( inputArray[i].compareTo(inputArray[j])>0)
{
temp=inputArray[i];
inputArray[i]=inputArray[j];
inputArray[j]=temp;
}  
}
System.out.println("after soring :");
for(int i=0; i< inputArray.length;i++) 
{		   
System.out.printf("%s ", inputArray[i]);
}
System.out.println();
}
public static void main(String args[]) 
{
Integer[] intArray = { 1, 2, 3, 4, 5 };
Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
String [] myName = {"Orange","Apple","Grapes","Cherry"};
sortArray(myName); 
System.out.println("Array integerArray contains:");
sortArray(intArray);  
System.out.println("\nArray doubleArray contains:");
sortArray(doubleArray);  
System.out.println("\nArray characterArray contains:");
sortArray(charArray);   
}
}
