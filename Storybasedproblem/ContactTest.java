package Storybasedproblem;
class Contact{
    String name;
    String phoneNumber;

    Contact(String name,String phone){
        this.name=name;
        phoneNumber=phone;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phoneNumber);
    }
}

class BusinessContact extends Contact{

    String companyName;

    BusinessContact(String name,String phone,String company){
        super(name,phone);
        companyName=company;
    }

    void display(){
        System.out.println("Name: "+name.toUpperCase());
        System.out.println("Phone: "+phoneNumber);
        System.out.println("Company: "+companyName);
    }
}

public class ContactTest {
    public static void main(String[] args){

        Contact c=new BusinessContact("Rahul","9876543210","Infosys");
        c.display();
    }
}
