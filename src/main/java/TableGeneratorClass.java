public class TableGeneratorClass {
    public String getTable(int tablesStart, int tablesEnd, int range) {
        int j = tablesStart;
        int currentMultiplier = 1;
        String tableString = "";

        for (int i = 1; i <= range * (tablesEnd - tablesStart + 1); i++) {
            tableString += String.format("%d * %d = %-4d\t", j, currentMultiplier, j * currentMultiplier);

            if (j < tablesEnd) {
                j++;
            } else {
                j = tablesStart;
                currentMultiplier++;
                tableString += "\n";
            }
        }

        return tableString;
    }

}
