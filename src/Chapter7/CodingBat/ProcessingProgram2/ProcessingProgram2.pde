void setup() {
  size(800, 800);
  noStroke();
  noLoop();
}

void draw() {
  drawCircle(width/2, height/2, 280, 6);
}

void drawCircle(int x, int y, int radius, int level) {
  float tt = 126 * level / 4.0;
  fill(tt);

  ellipse(x, y, radius*2, radius*2);

  if (level > 1) {
    level = level - 1;
    int verticalLevel = level; // Separate variable for the vertical recursion level

    //drawCircle(x - radius, y, radius / 2, level); // Draw circle to the left
    //drawCircle(x + radius, y, radius / 2, level); // Draw circle to the right
    //drawCircle(x, y - radius, radius / 2, level); // Draw circle above
    //drawCircle(x, y + radius, radius / 2, level); // Draw circle below
    
    drawCircle(x - radius, y, radius / 2, level); // Draw circle to the left
    drawCircle(x + radius, y, radius / 2, level); // Draw circle to the right
    drawCircle(x, y - radius, radius / 2, verticalLevel); // Draw circle above
    drawCircle(x, y + radius, radius / 2, verticalLevel); // Draw circle below
  }
}
