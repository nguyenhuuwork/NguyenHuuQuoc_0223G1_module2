package case_study.service;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.repository.FacilityRepository;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    private FacilityRepository facilityRepository = new FacilityRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayFacilityMenu() {
        do {
            System.out.println("----Facility Menu------\n" +
                    "1. House\n" +
                    "2. Villa\n" +
                    "3. Room");
            System.out.println("Choose option facility");
            String choose = sc.nextLine();
            if (choose.equals("1")) {
                Map<Facility, Integer> facilityMap = facilityRepository.getFacilityMap();
                Set<Facility> facilitySet = facilityMap.keySet();
                for (Facility f : facilitySet) {
                    if (f instanceof House) {
                        System.out.println(f);
                    }
                }
                break;
            } else if (choose.equals("2")) {
                Map<Facility, Integer> facilityIntegerMap = facilityRepository.getFacilityMap();
                Set<Facility> facilitySet = facilityIntegerMap.keySet();
                for (Facility f : facilitySet) {
                    if (f instanceof Villa) {
                        System.out.println(f);
                    }
                }
                break;
            } else if (choose.equals("3")) {
                Map<Facility, Integer> facilityIntegerMap = facilityRepository.getFacilityMap();
                Set<Facility> facilitySet = facilityIntegerMap.keySet();
                for (Facility f : facilitySet) {
                    if (f instanceof Room) {
                        System.out.println(f);
                    }
                }
                break;
            } else {
                System.out.println("You input wrong");
            }
        } while (true);
    }

    @Override
    public void addNewFacility() {
        // House String codeService, String nameService, double areaFacility, double chargeRent, int maximumPeople,
        //                 String date, String houseStandard, int floorHouse
        boolean flag = true;
        do {
            System.out.println("-----Chose Option-----\n" +
                    "1. Add house\n" +
                    "2. Add villa\n" +
                    "3. Add room\n" +
                    "4. Exit");
            System.out.println("Choose option");
            String chooseOption = sc.nextLine();
            switch (chooseOption) {
                case "1":
                    System.out.println("Enter codeService house");
                    String codeService = sc.nextLine();
                    System.out.println("Enter nameService house");
                    String nameService = sc.nextLine();
                    System.out.println("Enter areaFacility house");
                    double areaFacility = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter chargerent house");
                    double chargeRent = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter maximum people house");
                    int maximumPeople = Integer.parseInt(sc.nextLine());
                    String dateHouse = "";
                    boolean flagHouse = true;
                    do {
                        System.out.println("----Choose type rental----\n" +
                                "1. Rent by year\n" +
                                "2. Rent by month\n" +
                                "3. Rent by day\n" +
                                "4. Rent by hours\n");
                        System.out.println("---Please input----");
                        String typeRent = sc.nextLine();
                        switch (typeRent) {
                            case "1":
                                dateHouse = "year";
                                flag = false;
                                break;
                            case "2":
                                dateHouse = "month";
                                flag = false;
                                break;
                            case "3":
                                dateHouse = "day";
                                flag = false;
                                break;
                            case "4":
                                dateHouse = "hours";
                                flag = false;
                                break;
                            default:
                                System.out.println("You input wrong");
                                break;
                        }
                    } while (flag);
                    System.out.println("Enter house standard house");
                    String houseStandard = sc.nextLine();
                    System.out.println("Enter floor house");
                    int floorHouse = Integer.parseInt(sc.nextLine());
                    House house = new House(codeService, nameService, areaFacility, chargeRent, maximumPeople, dateHouse, houseStandard,
                            floorHouse);
                    facilityRepository.addNewFacility(house);
                    System.out.println("Add successfull");
                    break;
                case "2":
                    //String codeService, String nameService, double areaFacility, double chargeRent, int maximumPeople,
                    //                 String date, String villaStandard, double areaPool, int floorVilla
                    System.out.println("Enter code service villa");
                    String code = sc.nextLine();
                    System.out.println("Enter name service villa");
                    String name = sc.nextLine();
                    System.out.println("Enter area villa");
                    double area = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter charge rent villa");
                    double charge = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter maximum people villa");
                    int maximum = Integer.parseInt(sc.nextLine());
                    String dateVilla = "";
                    boolean flagVilla = true;
                    do {
                        System.out.println("----Choose type rental----\n" +
                                "1. Rent by year\n" +
                                "2. Rent by month\n" +
                                "3. Rent by day\n" +
                                "4. Rent by hours\n");
                        System.out.println("---Please input----");
                        String typeRent = sc.nextLine();
                        switch (typeRent) {
                            case "1":
                                dateVilla = "year";
                                flag = false;
                                break;
                            case "2":
                                dateVilla = "month";
                                flag = false;
                                break;
                            case "3":
                                dateVilla = "day";
                                flag = false;
                                break;
                            case "4":
                                dateVilla = "hours";
                                flag = false;
                                break;
                            default:
                                System.out.println("You input wrong");
                                break;
                        }
                    } while (flag);
                    System.out.println("Etner standard villa");
                    String standard = sc.nextLine();
                    System.out.println("Enter area pool villa");
                    double areaPoolVilla = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter floor villa");
                    int floorVilla = Integer.parseInt(sc.nextLine());
                    Villa villa = new Villa(code, name, area, charge, maximum, dateVilla, standard, areaPoolVilla, floorVilla);
                    facilityRepository.addNewFacility(villa);
                    System.out.println("Add successfull");
                    break;
                case "3":
//String codeService, String nameService, double areaFacility, double chargeRent, int maximumPeople,
//                String date, String freeServiceIncluded
                    System.out.println("Enter code room");
                    String codeRoom = sc.nextLine();
                    System.out.println("Enter name room");
                    String nameRoom = sc.nextLine();
                    System.out.println("Enter area room");
                    double areaRoom = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter charge room");
                    double chargeRoom = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter maximum people");
                    int maximumPeopleRoom = Integer.parseInt(sc.nextLine());
                    String dateRoom = "";
                    boolean flagRoom = true;
                    do {
                        System.out.println("----Choose type rental----\n" +
                                "1. Rent by year\n" +
                                "2. Rent by month\n" +
                                "3. Rent by day\n" +
                                "4. Rent by hours\n");
                        System.out.println("---Please input----");
                        String typeRent = sc.nextLine();
                        switch (typeRent) {
                            case "1":
                                dateRoom = "year";
                                flag = false;
                                break;
                            case "2":
                                dateRoom = "month";
                                flag = false;
                                break;
                            case "3":
                                dateRoom = "day";
                                flag = false;
                                break;
                            case "4":
                                dateRoom = "hours";
                                flag = false;
                                break;
                            default:
                                System.out.println("You input wrong");
                                break;
                        }
                    } while (flag);
                    System.out.println("Enter free Service Inclued room");
                    String freeService = sc.nextLine();
                    Room room = new Room(codeRoom, nameRoom, areaRoom, chargeRoom, maximumPeopleRoom, dateRoom, freeService);
                    facilityRepository.addNewFacility(room);
                    System.out.println("Add succesfull");
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("You input wrong");
            }
        } while (flag);
    }
}

