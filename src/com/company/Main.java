package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        while(true){
            System.out.println("Would you like to create an account or login?");
            String inp = reader.nextLine();
            if(inp.equalsIgnoreCase("login")){
                System.out.println("Enter username");
                String username = reader.nextLine();
                System.out.println("Enter password");
                String password = reader.nextLine();
                for(int i = usernames.size() -1; i >=0; i--){
                    if(usernames.get(i).equals(username) && passwords.get(i).equals(password)){
                        System.out.println("Welcome, " + username);
                        System.exit(0);
                    }
                    else{
                      System.out.println("Incorrect username or password");
                    }
                }
            }
            else if((inp.equalsIgnoreCase("create"))|| (inp.equalsIgnoreCase("create account"))||(inp.equalsIgnoreCase("create an account"))){
                System.out.println("Enter new username");
                String username = reader.nextLine();
                boolean New = true;
                for(int i = usernames.size() -1; i>=0; i--){
                    if(usernames.get(i).equals(username)){
                        System.out.println("This username already exists");
                        New = false;
                        break;
                    }
                }
                if(New){
                    usernames.add(username);
                    System.out.println("Enter a password");
                    String password = reader.nextLine();
                    passwords.add(password);
                }
            }
        }
    }
}
