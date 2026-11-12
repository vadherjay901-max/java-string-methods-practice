import java.util.*;
class javastring{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter you Name::");
    String name1 = sc.nextLine();

    System.out.print("Enter you friend Name ::");
    String name2 = sc.nextLine();

    String name12 = name1 + " " + name2;

    //String name = small ;
    // name.length() : 5 ;

    System.out.println(name1.length()+" "+name2.length());
    System.out.println(name12.length());

    // String name = big;
    // charAt(2) : print 'i';

    for(int i = 0 ; i<name1.length();i++){
        System.out.println(name1.charAt(i));
    }

    //substring(beg index, end index)
    //stringname.substring(start,end)

    String toy = "System point";
    System.out.println(toy.substring(4,toy.length()));

    // compare
    // name1 == name2 : 0
    // name1 > name2 : +ve value
    // name1 < name2 : -ve value

    if(name1.compareTo(name2)== 0){
        System.out.print("they are same same ");
    }
    else{
        System.out.print("they are not same same ");
    }
 }
}
