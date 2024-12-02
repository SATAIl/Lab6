/**
 * Main class to demonstrate the Visitor pattern.
 */
import lab6.*;
public class Main {
    public static void main(String[] args) {
        // Create GUI components
        Panel mainPanel = new Panel();
        Button knopka1 = new Button("OK");
        Button knopka2 = new Button("Cancel");
        Panel subPanel = new Panel();
        Button knopka3 = new Button("Apply");

        // Build the component hierarchy
        mainPanel.addComponent(knopka1);
        mainPanel.addComponent(subPanel);
        subPanel.addComponent(knopka2);
        subPanel.addComponent(knopka3);

        // Create a visitor to count Button components
        CountVisitor buttonCounter = new CountVisitor(Button.class);
        mainPanel.accept(buttonCounter);

        System.out.println("Number of Button components: " + buttonCounter.getCount());

        // Create a visitor to count Panel components
        CountVisitor panelCounter = new CountVisitor(Panel.class);
        mainPanel.accept(panelCounter);

        System.out.println("Number of Panel components: " + panelCounter.getCount());
    }
}
