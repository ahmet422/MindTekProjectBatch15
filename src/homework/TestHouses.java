package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class TestHouses {
    public static void main(String[] args) {
        House house1=new House(1,"123 Walnut rd. Chicago IL",true);
        House house2=new House(2,"55 State st. New York NY",false);
        House house3=new House(3,"111 Dee rd. Los Angles CA",true);
        House house4=new House(1,"909 Arnold dr. Miami FL",false);


        // Store all above objects to array of houses
        House[] housesArr = new House[]{house1, house2,house3, house4};
        ArrayList<House> houseList = new ArrayList<>(Arrays.asList(house1,house2,house3,house4));

        // Using houses array print house addresses that are for rent.
        System.out.println("For rent: ");
        for(House el : houseList) if(el.isForRent()) System.out.println(el.getAddress());

        // Using houses array print house addresses that has less than or equals to 2 floors
        System.out.println("House addresses with up to 2 floors");
        for(House el : houseList) if(el.getFloors() <= 2) System.out.println(el.getAddress());

        House house5=new House(2,"1123 Arnold dr. Miami NY",true);
        houseList.add(house5);

       // Using houses array print all houses information
        System.out.println("All houses: ");
        int counter = 1;
        for(House el : houseList) {
            System.out.println();
            System.out.println("House " + counter);
            counter++;
            System.out.println("Floors: " + el.getFloors());
            System.out.println("Address: " + el.getAddress());
            System.out.println("For Rent: " + el.isForRent());
        }

    }
}
