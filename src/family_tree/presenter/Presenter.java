package family_tree.presenter;

import family_tree.view.View;
import model.human.Gender;
import model.human.Human;
import model.service.FamilyTreeService;
import view.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private FamiliTreeService service;

    public Presenter(View view, FamilyTreeService service) {
        this.service = service;
        this.view = view;
    }

    public void addHuman(String name, Gender gender, LocalDate birthDate, long idFather, long idMother) {
        Human human = service.addHuman(name, gender, birthDate, idFather, idMother);
        view.print(human.toString());
    }

    public void addHuman(String name, Gender gender, LocalDate birthDate) {
        Human human = service.addHuman(name, gender, birthDate);
        view.print(human.toString());
    }

    public void getHumanList() {
        String answer = service.getHumanList();
        view.print(answer);
    }

    public void setDeathDate(int idHuman, LocalDate deathDate){
        if (service.setDeathDate(idHuman, deathDate)){
            view.print("Данные обновлены");
        } else {
            view.print("Не удалось обновить данные");
        }
    }

    public void setParentToChild(int idParent, int idChild){
        if (service.setParentToChild(idParent, idChild)){
            view.print("Данные обновлены");
        } else {
            view.print("Данные не удалось обновить");
        }
    }
}