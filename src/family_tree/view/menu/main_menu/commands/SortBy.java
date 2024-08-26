package family_tree.view.menu.main_menu.commands;

import view.Console;
import view.View;
import view.menu.Command;

public class SortBy extends Command {
    public static final String DESCRIPTION = "Отсортировать по..";

    public SortBy(Console console) {
        super(DESCRIPTION, console);
    }

    public void execute(){
        getConsole().sortBy();
    }
}
