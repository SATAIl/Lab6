/**
 * Class representing a Button component.
 */
package lab6;
public class Button implements GUIComponent {
    private String label;

    /**
     * Constructs a Button with the given label.
     *
     * @param label the label of the button
     */
    public Button(String label) {
        this.label = label;
    }

    /**
     * Gets the label of the button.
     *
     * @return the button label
     */
    public String getLabel() {
        return label;
    }

    @Override
    public void accept(GUIVisitor visitor) {
        visitor.visit(this);
    }
}
