package flag;

import java.awt.*;

public class ArgentinaFlag extends Flag {
    @Override
    public void draw() {
        Grid grid = new Grid();
        for(int row=0;row<grid.getHt();row++){
            for(int col=0;col<grid.getWd();col++){
                if(row<grid.getHt()/3){
                    grid.setColor(row, col, Color.BLUE);
                }else if(row<grid.getHt()/3*2){
                    grid.setColor(row, col, Color.WHITE);

                }else {
                    grid.setColor(row, col, Color.BLUE);
                }

            }
        }
    }
}

