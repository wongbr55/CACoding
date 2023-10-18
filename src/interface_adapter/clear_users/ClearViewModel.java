package interface_adapter.clear_users;

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class ClearViewModel extends ViewModel {

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    private ClearState state = new ClearState();

    public ClearViewModel() {
        super("clear");
    }

    @Override
    public void firePropertyChanged() {

    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }

    public void setDeletedUsers(ArrayList<String> deletedUsers){
        this.state.setDeletedUsers(deletedUsers);
    }

    public ClearState getState(){
        return this.state;
    }
}