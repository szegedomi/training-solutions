package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void setMeetingRooms(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
    }

    public void addMeetingRoom(MeetingRoom meetingRoom){
        this.meetingRooms.add(meetingRoom);
    }

    public void printNames(){
        for (MeetingRoom meetingRoom : this.meetingRooms){
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNamesReverse(){
        int s = meetingRooms.size();
        for (int i = 0 ; i < s ; i++){
            System.out.println(meetingRooms.get(s-1-i).getName());
        }
    }

    public void printEvenNames(){
        int i = 1;
        for (MeetingRoom meetingRoom : this.meetingRooms){
            if(i%2 == 0) {
                System.out.println(meetingRoom.getName());
            }
            i++;
        }
    }

    public void printAreas(){
        for (MeetingRoom meetingRoom : this.meetingRooms){
            System.out.println(meetingRoom.getName() + " has an area of " + meetingRoom.getArea());
        }
    }

    public void printMeetingRoomsWithName(String name){
        boolean found =false;
        for (MeetingRoom meetingRoom : this.meetingRooms){
            if(meetingRoom.getName().equals(name) && !found){
                System.out.println(meetingRoom.getName() + " found with length:" + meetingRoom.getLength() + ", and width of: "+ meetingRoom.getWidth() + ", and area of: " + meetingRoom.getArea());
                found =true;
            }
        }
        if(!found){
            System.out.println("No such meeting room in the office");
        }
    }

    public void printMeetingRoomsContains(String part){
        int found = 0;
        for (MeetingRoom meetingRoom : this.meetingRooms){
            if(meetingRoom.getName().toLowerCase().contains(part.toLowerCase())){
                System.out.println(meetingRoom.getName() + " found with length:" + meetingRoom.getLength() + ", and width of: "+ meetingRoom.getWidth() + ", and area of: " + meetingRoom.getArea());
                found++;
            }
        }
        System.out.println(found + " record found.");
    }


    public void printAreasLargerThan(int area){
        int found = 0;
        for (MeetingRoom meetingRoom : this.meetingRooms){
            if(meetingRoom.getArea() > area){
                System.out.println(meetingRoom.getName() + " found with length:" + meetingRoom.getLength() + ", and width of: "+ meetingRoom.getWidth() + ", and area of: " + meetingRoom.getArea());
                found++;
            }
        }
        System.out.println(found + " record found.");
    }
}

