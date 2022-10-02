package ui;

import model.VideoGame;
import model.VideoGameController;

import java.util.Scanner;
import java.util.random.*;

public class VideoGame{

    public static Scanner sc = new Scanner(System.in);
    public static VideoGameController videoController = new VideoGameController();

    public static void main(String[] args){
        
        public static void menu(){
            System.out.println("Welcome");
            boolean exit = false;

            while(!exit){
                System.out.println("Type an option\n1. Register a player");

                int option = sc.nextInt();

                switch(option){
                    case 1:
                    registerPlayer();
                    break;
                }
            }
        }

        private static void registerPlayer(){
            System.out.println("Type the nickname");
            sc.nextLine();
            String nickname = sc.nextLine();

            System.out.println("Type the name");
            String name = sc.nextLine();

            if (videoController.registerPlayer(nickname, name)){
                System.out.println("Registered player\n ");
            }
            else {
                System.out.println("Error\n ");

            }
        }
    }
}