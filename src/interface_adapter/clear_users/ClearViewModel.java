package interface_adapter.clear_users;

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public ClearViewModel() {
        super("clear");
    }

    @Override
    public void firePropertyChanged() {
//        support.firePropertyChange("state", null, );
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }
}
