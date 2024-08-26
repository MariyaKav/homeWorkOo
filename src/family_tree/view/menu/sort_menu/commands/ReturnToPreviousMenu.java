package family_tree.view.menu.sort_menu.commands;

import view.Console;
import view.View;
import view.menu.Command;

public class ReturnToPreviousMenu extends Command {
    public static final String DESCRIPTION = "Вернуться в предыдущее меню";

    public ReturnToPreviousMenu(Console console) {
        super(DESCRIPTION, console);
    }

    public void execute(){
        getConsole().returnToPreviosMenu();
    }
}