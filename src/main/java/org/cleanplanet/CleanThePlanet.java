package org.cleanplanet;
import ui.Display;
import user.Saviour;
import java.io.InputStream;
import java.util.Scanner;
public class CleanThePlanet {
    public static final String RFM_Name = "Clean Planet"; // RFM = Recycling Free Machine
    public static void main(String[] args) {
        Display ui = new Display();
        ui.showWelcomeMsg();
        ui.selectPassOption();
        ui.showPassMenu();
        Saviour greta = new Saviour(1, " Greta ", " Thunberg "); //
        Saviour elon = new Saviour(2, "Elon", "Musk");
        String s = readFromKeyboard();
        greta.selectPassMenu(s);
        ui.showMessagePass();
        ui.chooseMaterial();
        ui.showMaterials();
        String s1 = readFromKeyboard();
        greta.chooseMaterial(s1);
        ui.finishIntroduction();
        elon.elonDoesWhatHeWants();
    }
    private static String readFromKeyboard() {
        InputStream in = System.in;
        Scanner keyboard = new Scanner(in);
        return keyboard.next();
    }
}