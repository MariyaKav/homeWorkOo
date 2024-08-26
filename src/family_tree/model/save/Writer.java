package family_tree.model.save;
import model.familyTree.FamilyTree;
import model.human.Human;

import java.io.Serializable;

public interface Writer {
    boolean save(Serializable serializable);
    Object read();
}
