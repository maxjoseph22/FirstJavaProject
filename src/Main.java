//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DJ facta = new DJ("Facta", "UK bass", 1000, 750.00);
        Crowd crowd = new Crowd(300, true);
        Record iceCreamDream = new Record("ice cream dream", 9, true, 8);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to the club! Tonight we have DJ " + facta.name + " playing some " + facta.genre + "!");
        facta.rewind(3);
        crowd.reaction();

        }

    }
