/**
 * Visitor that counts the number of components of a specific type.
 */
package lab6;
public class CountVisitor implements GUIVisitor {
    private Class<?> typeToCount;
    private int count = 0;

    /**
     * Constructs a CountVisitor for the specified type.
     *
     * @param typeToCount the class type to count
     */
    public CountVisitor(Class<?> typeToCount) {
        this.typeToCount = typeToCount;
    }

    /**
     * Gets the count of components of the specified type.
     *
     * @return the count
     */
    public int getCount() {
        return count;
    }

    @Override
    public void visit(Button button) {
        if (typeToCount.isInstance(button)) {
            count++;
        }
    }

    @Override
    public void visit(Panel panel) {
        if (typeToCount.isInstance(panel)) {
            count++;
        }
        // The accept method in Panel already iterates over children,
        // so we don't need to do anything else here.
    }
}
