package use_case.clear_users;


import data_access.FileUserDataAccessObject;

import java.io.IOException;
import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{

    final ClearOutputBoundary clearOutputBoundary;
    final ClearUserDataAccessInterface clearUserDataAccessInterface;

    public ClearInteractor(ClearOutputBoundary clearOutputBoundary, ClearUserDataAccessInterface clearUserDataAccessInterface){
        this.clearOutputBoundary = clearOutputBoundary;
        this.clearUserDataAccessInterface = clearUserDataAccessInterface;
    }

    @Override
    public void execute() {

        ArrayList<String> deletedUsers = clearUserDataAccessInterface.clear();
        ClearOutputData clearOutputdata = new ClearOutputData(deletedUsers);
        clearOutputBoundary.prepareView(clearOutputdata);
    }
}
