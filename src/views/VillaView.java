package views;

import model.Villa;
import services.exception.*;
import services.exception.Exception;
import utils.Write.WriteVillaFile;

import java.util.Scanner;

public class VillaView {
    Villa villa;
public  static final String FILEVILLA="src/data/villa.csv";
    public void addVilla() {

        Scanner scanner = new Scanner(System.in);
        String nameVilla = "";
        int areaVilla;
        int pricesVilla;
        int peopleVilla;
        int areaPool;
        int floor;
        String rentTypeVilla;
        String roomStandard;
        do {
            try {
                System.out.println("enter name of villa");
                nameVilla = scanner.nextLine();
                ExceptionAndRegexName regexID = new ExceptionAndRegexName();
                regexID.regexId(nameVilla);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        do {
            try {
                System.out.println("enter area of villa");
                areaVilla = Integer.parseInt(scanner.nextLine());
                ExceptionArea.area(areaVilla);
                break;
            } catch (Exception | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        do {
            try {
                System.out.println("enter prices of villa");
                pricesVilla = Integer.parseInt (scanner.nextLine());
                ExceptionPrices.prices(pricesVilla);
                break;
            } catch (Exception | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        do {
            try {
                System.out.println("enter amount of villa");
                peopleVilla = Integer.parseInt(scanner.nextLine());
                ExceptionPeople.people(peopleVilla);
                break;
            } catch (Exception | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        do {
            try {
                System.out.println("enter pool are of villa ");
                areaPool = Integer.parseInt(scanner.nextLine());
                ExceptionArea.area(areaPool);
                break;
            } catch (Exception | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        do {
            try {
                System.out.println("enter rentType of villa");
                rentTypeVilla = scanner.nextLine();
                ExceptionAndRegexName regexName = new ExceptionAndRegexName();
                regexName.regexId(rentTypeVilla);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        } while (true);
 do {
            try {
                System.out.println("enter room of villa");
                roomStandard = scanner.nextLine();
                ExceptionAndRegexName regexName = new ExceptionAndRegexName();
                regexName.regexId(roomStandard);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        } while (true);


        do {
            try {
                System.out.println("enter floor of villa");
                floor = Integer.parseInt(scanner.nextLine());
                ExceptionPrices.prices(floor);
                break;
            } catch (Exception | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);


        villa = new Villa(nameVilla, areaVilla, pricesVilla, peopleVilla, rentTypeVilla, roomStandard, areaPool, floor);
        WriteVillaFile.writeFile(FILEVILLA,villa);
    }

    public Villa villa() {
        return villa;
    }
}
