package main.java.com.yuefeng;

public class FlashBack_Cal8queens {

    int[] values = new int[8];

    public void cal8queens(int row) {
        if (row == 8) {
            print(values);
            return;
        }

        for (int column=0; column<8; column++){
            if(isOk(row, column)) {
                values[row] = column;
                cal8queens(row+1);
            }
        }
    }

    public boolean isOk(int row, int column) {
        int leftup = column - 1;
        int rightup = column +1 ;
        for (int i=row-1; i>=0; i--) {

            if(leftup < 0 || values[i] == leftup) return false;
            if (rightup >= 8 || values[i] == rightup) return false;
            leftup--;
            rightup++;
        }

        return true;
    }

    public void print(int[] values) {

    }
}
