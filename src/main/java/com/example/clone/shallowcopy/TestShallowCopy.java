package com.example.clone.shallowcopy;

public class TestShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address();
        address.setName("北京天安门");
        CustUser custUser = new CustUser();
        custUser.setAddress(address);
        custUser.setLastName("李");
        custUser.setFirstName("雷");
        String[] cars = new String[]{"别克", "路虎"};
        custUser.setCars(cars);

        CustUser custUserCopy = (CustUser) custUser.clone();
//        custUserCopy.setFirstName("梅梅");
//        custUserCopy.setLastName("韩");
        custUserCopy.getAddress().setName("北京颐和园");
        custUserCopy.getCars()[0]="奥迪1";
        System.out.println(custUser.getFirstName() + " " + custUser.getLastName() +  " "  + custUser.getAddress().getName() + " " + custUser.getCars()[0] + " " + custUser.getCars()[1] );
        System.out.println(custUserCopy.getFirstName() + " " + custUserCopy.getLastName() +  " "  + custUserCopy.getAddress().getName() + " " + " " + custUserCopy.getCars()[0] + " " + custUser.getCars()[1] );
    }

}
