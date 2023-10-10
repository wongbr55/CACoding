package interface_adapter.clear_users;
import use_case.clear_users.ClearInteractor;
public class ClearController {

    final private ClearInteractor clearInteractor;

    public ClearController(ClearInteractor clearInteractor){
        this.clearInteractor = clearInteractor;
    }

    public void execute(){
        this.clearInteractor.execute();
    }
}
