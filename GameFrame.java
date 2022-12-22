import javax.swing.JFrame;

class GameFrame extends JFrame {
    GameFrame() {
        add(new GamePanel());
        setTitle("Tetromino Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
