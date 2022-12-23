import javax.swing.JFrame;

class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Tetromino Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        // this.setSize(500, 500); Take this out later
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}