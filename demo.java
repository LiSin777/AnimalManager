package Animal;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class demo {
    public static void main(String[] args)  {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Menu menu = new Menu();
        Manager manager = new Manager();
        while(true){
            try {
                menu.Welcome(manager);
            } catch (OverFlowException e) {
                e.printStackTrace();
            }
        }

    }

}
