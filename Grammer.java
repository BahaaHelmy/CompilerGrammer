/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grammer;

import java.util.Scanner;

/**
 *
 * 
 */
public class Grammer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char []string=new char[1000];
	int flag,count=0;
	System.out.println("The grammar is: S->aS, S->Sb, S->ab\n");
	System.out.println("Enter the string to be checked:\n");
        Scanner sc=new Scanner(System.in);
        string= sc.nextLine().toCharArray();
	if(string[0]=='a') {
		flag=0;
		for (count=1;count<=string.length;count++) {
                             
                                 if(count!=string.length&&string[count]=='b')
                        {
				flag=1;
				continue;
			}
		       else if(count!=string.length&&(flag==1)&&(string[count]=='a')) 
					{
				System.out.println("The string does not belong to the specified grammar");
				break;
			}
                     
			 else if(count!=string.length&&string[count]=='a'){
			continue;
                         }
			 else  if((flag==1)&&(string.length==count)) {
				System.out.println("String accepted…..!!!!");
				break;
			} 
			else
				System.out.println("The string does not belong to the specified grammar");
                }
        }
        else
            				System.out.println("The string does not belong to the specified grammar");

            
}
}
