/**
 * Interface for the Visitor, defining visit methods for each component type.
 */
package lab6;
public interface GUIVisitor {
    /**
     * Visit a Button component.
     *
     * @param button the Button to visit
     */
    void visit(Button button);

    /**
     * Visit a Panel component.
     *
     * @param panel the Panel to visit
     */
    void visit(Panel panel);
}
