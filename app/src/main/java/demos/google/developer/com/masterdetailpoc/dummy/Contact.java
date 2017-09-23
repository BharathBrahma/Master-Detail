package demos.google.developer.com.masterdetailpoc.dummy;

/**
 * Created by 5165587 on 9/22/17.
 */

public class Contact {
    public  String id;
    public  String name;
    public  String phone_number;

    public Contact(String id, String name, String phone_number) {
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
    }

    public Contact(){

    }

    @Override
    public String toString() {
        return name;
    }

    // getting ID
    public String getID(){
        return this.id;
    }

    // setting id
    public void setID(String id){
        this.id = id;
    }

    // getting name
    public String getName(){
        return this.name;
    }

    // setting name
    public void setName(String name){
        this.name = name;
    }

    // getting phone number
    public String getPhoneNumber(){
        return this.phone_number;
    }

    // setting phone number
    public void setPhoneNumber(String phone_number){
        this.phone_number = phone_number;
    }
}


