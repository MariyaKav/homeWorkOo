package family_tree.model.familiTree;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface TreeNode<T> extends Serializable, Comparable<T> {
    void setId(long id);
    long getId();
    T getFather();
    T getMother();
    boolean addChild(T human);
    boolean addParent(T human);
    String getName();
    LocalDate getDeathDate();
    LocalDate getBirthDate();
    List<T> getParents();
    List<T> getChildren();
    T getSpouse();
    void setSpouse(T human);
}