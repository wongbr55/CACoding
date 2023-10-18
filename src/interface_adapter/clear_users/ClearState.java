package interface_adapter.clear_users;

import java.util.ArrayList;

public class ClearState {
    private ArrayList<String> deletedUsers = new ArrayList<>();

    public ClearState(){
    }

    public void setDeletedUsers(ArrayList<String> deletedUsers) {
        this.deletedUsers = deletedUsers;
    }
    public ArrayList<String> getDeletedUsers(){
        return this.deletedUsers;
    }

}
