package family_tree.view.menu.sort_menu.commands;
import view.Console;
import view.View;
import view.menu.Command;

public class SortByName extends Command {
    public static final String DESCRIPTION = "Отсортировать по имени";

    public SortByName(Console console) {
        super(DESCRIPTION, console);
    }

    public void execute(){
        getConsole().sortByName();
    }
}
