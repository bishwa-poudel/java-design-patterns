package Structural.CompositePattern;

import Structural.CompositePattern.Composites.Room;

/**
 * @author Bishwa on 15/10/2020
 */
public class MainProgram {
    public static void main(String[] args) {
        Housing building = new Housing("Khoretol");
        Housing floor1 = new Housing("Khoretol - First floor");
        int firstFloor = building.addStructure(floor1);

        Room washRoomM = new Room("1F Men's washroom");
        Room washroomW = new Room("1F Women's washroom");
        Room common = new Room("1F Common Area");

        int firstMens = floor1.addStructure(washRoomM);
        int firstWomens = floor1.addStructure(washroomW);
        int firstCommon = floor1.addStructure(common);

        building.enter(); // Enter the building

        Housing currentFloor = (Housing) building.getStructure(firstFloor);
        currentFloor.enter(); // Walk into the first floor

        Room currentRoom = (Room) currentFloor.getStructure(firstMens);
        currentRoom.enter(); // Walk into the men's room

        currentRoom = (Room) currentFloor.getStructure(firstCommon);
        currentRoom.enter(); // Walk into the common area
    }
}
