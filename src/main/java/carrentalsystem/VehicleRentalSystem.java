package carrentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {

    private List<Store> storeList;

    private List<User> userList;

    public VehicleRentalSystem() {
        storeList=new ArrayList<>();
        userList=new ArrayList<>();
    }

    public void addStore(Store store){
        storeList.add(store);
    }

    public void addUser(User user){
        userList.add(user);
    }
}
