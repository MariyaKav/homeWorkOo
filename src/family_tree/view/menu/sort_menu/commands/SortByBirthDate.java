package family_tree.view.menu.sort_menu.commands;

import view.Console;
import view.View;
import view.menu.Command;

public class SortByBirthDate extends Command {
    public static final String DESCRIPTION = "Отсортирвать по дате рождения";

    public SortByBirthDate(Console console) {
        super(DESCRIPTION, console);
    }

    public void execute(){
        getConsole().sortByBirthDate();
    }
}
