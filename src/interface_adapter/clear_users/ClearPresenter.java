package interface_adapter.clear_users;

import interface_adapter.ViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import javax.swing.text.View;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel viewModel;

    public ClearPresenter(ClearViewModel viewModel){
        this.viewModel = viewModel;
    }

    @Override
    public void prepareView(ClearOutputData user){
        this.viewModel.setDeletedUsers(user.getDeletedUsers());

    }
}
