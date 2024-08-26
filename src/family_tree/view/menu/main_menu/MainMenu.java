package family_tree.view.menu.main_menu;

import view.Console;
import view.View;
import view.menu.Command;
import view.menu.Menu;
import view.menu.main_menu.commands.AddHuman;
import view.menu.main_menu.commands.FindHumanById;
import view.menu.main_menu.commands.GetHumanList;
import view.menu.main_menu.commands.SortBy;

import java.util.List;

public class MainMenu extends Menu {
    public MainMenu(Console console) {
        super(console);
    }

    @Override
    protected void setCommands() {
        List<Command> commands = getCommands();
        commands.add(new AddHuman(getConsole()));
        commands.add(new FindHumanById(getConsole()));
        commands.add(new GetHumanList(getConsole()));
        commands.add(new SortBy(getConsole()));
    }
}