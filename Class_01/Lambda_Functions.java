/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_01;

/**
 *
 * @author Aryan Wadhwani
 */
public class Lambda_Functions {
    public interface Lambda_Answerable {
        String answer();
    }
    public interface Predicate{
        Boolean test(int n);
    }
    public static void main(String args[]){
        Lambda_Answerable phone = () -> "Hello";
        System.out.println(phone.answer());
        Predicate isOdd =  n -> n%2!=0;
        System.out.println(isOdd.test(2));
        Predicate isEven = n -> n%2==0;
        System.out.println(isEven.test(2));
    }
}
