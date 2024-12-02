package lab6;
import java.util.ArrayList;
import java.util.List;
/**
 * Class representing a Panel component, which can contain other GUI components.
 */
public class Panel implements GUIComponent {
    private List<GUIComponent> children = new ArrayList<>();

    /**
     * Adds a child component to the panel.
     *
     * @param component the component to add
     */
    public void addComponent(GUIComponent component) {
        children.add(component);
    }

    /**
     * Removes a child component from the panel.
     *
     * @param component the component to remove
     */
    public void removeComponent(GUIComponent component) {
        children.remove(component);
    }

    /**
     * Gets the list of child components.
     *
     * @return the list of children
     */
    public List<GUIComponent> getChildren() {
        return children;
    }

    @Override
    public void accept(GUIVisitor visitor) {
        visitor.visit(this);
        for (GUIComponent component : children) {
            component.accept(visitor);
        }
    }
}
