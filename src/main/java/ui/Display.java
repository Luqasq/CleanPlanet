package ui;


import static org.cleanplanet.CleanThePlanet.RFM_Name;

public class Display {
    public static final String LOG_MENU =
            """
                    1. Retinal scanning 
                    2. Fingerprints scanning    """;
    public static final String MATERIALS_MENU =
            """  
                    1. Plastic
                    2. Paper
                    3. Metal
                    4. Glass
                    5. Organic garbage """;

    public void showWelcomeMsg() {
        System.out.println(" Welcome to " + RFM_Name + " ! " + "Thank you for recycling in 2103 !");
    }

    public void selectPassOption() {
        System.out.println("      Please select pass option ! ");
    }

    public void showPassMenu() {
        System.out.println(LOG_MENU);
    }

    public void showMessagePass() {
        System.out.println("Scan accepted ! ");
    }

    public void chooseMaterial() {
        System.out.println("      Please choose material ! ");
    }

    public void showMaterials() {
        System.out.println(MATERIALS_MENU);
    }

    public void finishIntroduction() {
        System.out.println(" Successful recycling , thank you ! " + " Next in line , please ! ");
        System.out.println(" Hello Mister Elon , you don t have to pas the recognition ! ");
    }

}
