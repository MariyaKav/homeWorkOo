package family_tree.view.menu.main_menu.commands;

import view.Console;
import view.View;
import view.menu.Command;

public class GetHumanList extends Command {
    public static final String DESCRIPTION = "Получить список людей";

    public GetHumanList(Console console) {
        super(DESCRIPTION, console);
    }

    public void execute(){
        getConsole().getHumanList();
    }
}
