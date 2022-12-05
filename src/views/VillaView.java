package views;

import model.Facility;
import model.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaView {
    Villa villa;

    public void addVilla() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name of villa");
        String nameVilla = scanner.nextLine();
        System.out.println("enter area of villa");
        int areaRoom = Integer.parseInt(scanner.nextLine());
        System.out.println("enter prices of villa");
        double pricesVilla = Double.parseDouble(scanner.nextLine());
        System.out.println("enter amount of villa");
        int peopleVilla = Integer.parseInt(scanner.nextLine());
        System.out.println("enter rentType of Room");
        String rentTypeVilla = scanner.nextLine();
        System.out.println("enter room of villa");
        String roomStandard = scanner.nextLine();
        System.out.println("enter pool are of villa ");
        int areaPool = Integer.parseInt(scanner.nextLine());
        System.out.println("enter floor of villa");
        int floor = Integer.parseInt(scanner.nextLine());
        villa = new Villa(nameVilla, areaRoom, pricesVilla, peopleVilla, rentTypeVilla, roomStandard, areaPool, floor);

    }
    public Villa villa(){
        return villa;
    }
}
