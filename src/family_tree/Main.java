package family_tree;

import model.save.FileHandler;
import model.service.FamilyTreeService;
import presenter.Presenter;
import view.Console;
import view.View;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/model/save/tree.txt";

        FamilyTreeService service = new FamilyTreeService(new FileHandler(filePath));
        Console console = new Console();
        Presenter presenter = new Presenter(console, service);
        console.setPresenter(presenter);

        console.start();
    }
}