public class BuildTower {

    public static String[] towerBuilder(int nFloors) {
        String[] towerString = new String[nFloors];

        for (int i = 0; i < nFloors; i++) {
            String repeat = " ".repeat(nFloors - (i + 1)) + "*".repeat(1 + (i) * 2);
            towerString[i] = repeat;
//            String s = " ".repeat(nFloors - (i + 1)) + "*".repeat(1 + (i) * 2) + " ".repeat(nFloors - (i + 1));
//            towerString[i] = s;
        }
        return towerString;
    }

}
