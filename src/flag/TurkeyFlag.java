package flag;

import java.awt.*;

    public class TurkeyFlag extends Flag {
        @Override
        public void draw() {
            Grid grid = new Grid();
            int height = grid.getHt();
            int width = grid.getWd();

            // Calculate the center of the flag
            int centerY = height / 2;
            int centerX = width / 2;

            // Set the background to red
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    grid.setColor(row, col, Color.RED);
                }
            }

            // Draw the white crescent
            int crescentRadius = height / 4;  // Adjust the size as needed
            int crescentInnerRadius = height / 6; // Inner radius to create crescent effect
            int crescentXOffset = width / 10; // Offset to position crescent
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    // Check if the point is within the outer circle
                    int distanceToCenter = (int) Math.sqrt(Math.pow(row - centerY, 2) + Math.pow(col - (centerX - crescentXOffset), 2));
                    int distanceToInnerCenter = (int) Math.sqrt(Math.pow(row - centerY, 2) + Math.pow(col - (centerX - crescentXOffset + crescentInnerRadius), 2));

                    if (distanceToCenter <= crescentRadius && distanceToInnerCenter >= crescentInnerRadius) {
                        grid.setColor(row, col, Color.WHITE);
                    }
                }
            }

            // Draw the white star inside the crescent
            int starRadius = height / 10; // Adjust the size as needed
            int starXOffset = centerX + crescentXOffset - crescentRadius / 2; // Adjust position inside the crescent
            int starYOffset = centerY; // Center vertically
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    // Check if the point is within the star shape
                    int distanceToStarCenter = (int) Math.sqrt(Math.pow(row - starYOffset, 2) + Math.pow(col - starXOffset, 2));
                    if (distanceToStarCenter <= starRadius) {
                        grid.setColor(row, col, Color.WHITE);
                    }
                }
            }
        }
    }
