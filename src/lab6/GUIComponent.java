/**
 * Interface representing a generic GUI component.
 */
package lab6;
public interface GUIComponent {
    /**
     * Accepts a visitor.
     *
     * @param visitor the visitor to accept
     */
    void accept(GUIVisitor visitor);
}
