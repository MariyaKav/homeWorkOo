package family_tree.view.menu.main_menu.commands;

pimport view.Console;
import view.View;
import view.menu.Command;

public class FindHumanById extends Command {
    public static final String DESCRIPTION = "Найти человека по id";

    public FindHumanById(Console console) {
        super(DESCRIPTION, console);
    }

    public void execute(){
        getConsole().findHumanById();
    }
}