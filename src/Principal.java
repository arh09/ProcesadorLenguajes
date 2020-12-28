import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import javax.swing.*;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) throws Exception{
        CharStream input = CharStreams.fromFileName("level2_sem_1.txt");
        Analex analex = new Analex(input);
        CommonTokenStream tokens = new CommonTokenStream(analex);
        Anasint anasint = new Anasint(tokens);
        ParseTree tree = anasint.programa();
        JFrame frame = new JFrame("Árbol de Análisis");
        JPanel panel = new JPanel();
        JScrollPane panel2 = new JScrollPane(panel);
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                anasint.getRuleNames()),tree);
        viewr.setScale(1);//scale a little
        panel.add(viewr);
        frame.add(panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500,400);
        frame.setVisible(true);

        Anasem anasem = new Anasem();
        anasem.visit(tree);
    }
}
