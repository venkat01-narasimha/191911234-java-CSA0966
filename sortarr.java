import java.util.*;
class sort
{
public static<E>void sort1(E[] arr)
{
Arrays.sort(arr,0,arr.length);
System.out.println("Sorted array : "+Arrays.toString(arr));
}
public static void main(String[] args){
Integer[] i={4,3,2,1};
String s[]={"sanjay","sanjay1","sanjay2"};
sort1(i);
sort1(s);
}
}
