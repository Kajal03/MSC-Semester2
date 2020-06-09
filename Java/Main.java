import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("this is a test. ");
        }
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextPane newsTextPane = new JTextPane();
        newsTextPane.setContentType("text/html");
        newsTextPane.setEditable(false);
        newsTextPane.setText(sb.toString());

        JScrollPane scrollPane = new JScrollPane(newsTextPane);
        scrollPane.setVerticalScrollBarPolicy(
                  javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        frame.add(scrollPane);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
