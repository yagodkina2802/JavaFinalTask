package ControlHWJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Shop {
    public static void main(String[] args) {
        Nout nout1 = new Nout("Access" ,16, 500, "Windows", "Grey");
        Nout nout2 = new Nout("Asus" ,8, 180, "Windows", "Black");
        Nout nout3 = new Nout("MakBook" ,32, 1000, "Apple", "Grey");
        Nout nout4 = new Nout("Lenovo" ,8, 250, "Windows", "Black");
        Nout nout5 = new Nout("HuaWey" ,32, 5000, "Linux", "White");
        Nout nout6 = new Nout("MacBook" ,16, 500, "Apple", "White");

        Set<Nout> nouts = new HashSet<>(Arrays.asList(nout1, nout2, nout3, nout4, nout5, nout6));
        HashMap<String,String> filtrCriteria = new HashMap<>();
        filtrCriteria.put("1", "ОЗУ");
        filtrCriteria.put("2", "Объем ЖД");
        filtrCriteria.put("3", "Операционная система");
        filtrCriteria.put("4", "Цвет");

        Scanner scanner = new Scanner(System.in); 
        System.out.println("1: ОЗУ");
        System.out.println("2: Объем ЖД");
        System.out.println("3: Операционная система");
        System.out.println("4: Цвет");
        System.out.println("Выберети цифру, по которой будет осуществляться фильтрация: ");

    
        String input = scanner.nextLine();

        if(filtrCriteria.containsKey(input)){
            String selectedCriteria = filtrCriteria.get(input);
            Set<Nout> filtredNouts = new HashSet<>();
            switch(selectedCriteria){
                case "ОЗУ":
                    System.out.println("Доступны ноутбуки с оперативной памятью 8, 16, 32. ");
                    System.out.println("Введите минимальное значение для " + selectedCriteria + ":");
                    String minAM = scanner.nextLine();
                    int minAccessMemory = Integer.parseInt(minAM);
                    for (Nout nout : nouts) {
                        if(nout.getAccessMemory() >= minAccessMemory){
                            filtredNouts.add(nout);
                        }
                    }
                    break;
                case "Объем ЖД":
                    System.out.println("Доступны ноутбуки с железным диском 180, 250, 500, 1000, 5000.");
                    System.out.println("Введите минимальное значение для " + selectedCriteria + ":");
                    String minHD = scanner.nextLine();
                    int minHardDrive = Integer.parseInt(minHD);
                    for(Nout nout: nouts){
                        if(nout.getHardDrive() >= minHardDrive){
                            filtredNouts.add(nout);
                        }
                    }
                    break;

                case "Операционная система":
                    System.out.println("Доступны ноутбуки с операционной системой Linux, Apple, Windows.");
                    System.out.println("Введите нужную " + selectedCriteria + ":");
                    String stringRAM = scanner.nextLine();
                    for(Nout nout : nouts){
                        if(nout.getRAM().equals(stringRAM)){
                            filtredNouts.add(nout);
                        }
                    }
                    break;
                case "Цвет":
                    System.out.println("Доступны ноутбуки в следующих цветах: White, Black, Grey.");
                    System.out.println("Введите нужный " + selectedCriteria + ":");
                    String colorString = scanner.nextLine();
                    for(Nout nout : nouts){
                        if(nout.getColor().equals(colorString)){
                            filtredNouts.add(nout);
                        }
                    }
                    break;
                default:
                    System.out.println("Некорректный ввод критерия!");
                    return;
                }
            if(filtredNouts.isEmpty()){
                System.out.println("Ноутбуки не найдены. Введите другое значение для фильтрации");
            } else {
                for (Nout nout : filtredNouts) {
                    System.out.println(nout);
                }
            }
        }
        else {
            System.out.println("Введены некорректные данные");
        }
    }
}
