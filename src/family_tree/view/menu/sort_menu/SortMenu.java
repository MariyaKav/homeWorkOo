package family_tree.view.menu.sort_menu;

import view.Console;
import view.View;
import view.menu.Command;
import view.menu.Menu;
import view.menu.sort_menu.commands.SortByBirthDate;
import view.menu.sort_menu.commands.SortByName;

import java.util.List;

public class SortMenu extends Menu {
    public SortMenu(Console console) {
        super(console);
    }

    @Override
    protected void setCommands() {
        List<Command> commands = getCommands();
        commands.add(new SortByName(getConsole()));
        commands.add(new SortByBirthDate(getConsole()));
    }
}
