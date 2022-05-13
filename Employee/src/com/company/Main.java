package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        Employee emp1 = new Employee(1,"kailash","Software Developer" , 1 , "Development" , 50000);
        Employee emp2 = new Employee(2 , "parthiban","Android Developer",1,"Development",55000);
        Employee emp3 = new Employee(3,"mouli","IOS Developer",1,"Development",60000);
        Employee emp4 = new Employee(4,"Ashok","Web Developer" ,1,"Development",45000);
        Employee emp5 = new Employee(5,"Ajay","Android Developer",1,"Development",55000);

       ArrayList<Employee> employee = new ArrayList<Employee>();
       employee.add(emp1);
       employee.add(emp2);
       employee.add(emp3);
       employee.add(emp4);
       employee.add(emp5);
       System.out.println("Enter Id To Get Full Details Of The Employee");
       int id = sc.nextInt();
       for(int i=0;i<employee.size();i++){
           if(employee.get(i).empid==id){
               System.out.println("ID : " +employee.get(i).empid);
               System.out.println("Name : "+employee.get(i).name);
               System.out.println("Role : "+employee.get(i).role);
               System.out.println("Experience : "+employee.get(i).experience);
               System.out.println("Deparment : "+employee.get(i).department);
               System.out.println("Salary : "+employee.get(i).salary);
           }
       }
        



    }
}
