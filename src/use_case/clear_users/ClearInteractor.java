package use_case.clear_users;


import data_access.FileUserDataAccessObject;

import java.io.IOException;

public class ClearInteractor implements ClearInputBoundary{

    final ClearOutputBoundary clearOutputBoundary;
    final FileUserDataAccessObject fileUserDataAccessObject;

    public ClearInteractor(ClearOutputBoundary clearOutputBoundary, FileUserDataAccessObject fileUserDataAccessObject){
        this.clearOutputBoundary = clearOutputBoundary;
        this.fileUserDataAccessObject = fileUserDataAccessObject;
    }

    @Override
    public void execute() {

        fileUserDataAccessObject.clear();

        ClearOutputData clearOutputdata = new ClearOutputData(true);
        clearOutputBoundary.prepareView(clearOutputdata);
    }
}
