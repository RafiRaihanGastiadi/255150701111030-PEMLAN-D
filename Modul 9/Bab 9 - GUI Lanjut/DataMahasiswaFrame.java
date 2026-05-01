import java.awt.*;
import javax.swing.*;

public class DataMahasiswaFrame extends JFrame {
    public DataMahasiswaFrame(String nama, String tgl, String noDaftar, String telp, String alamat, String email) {
        setTitle("Data Mahasiswa");
        setSize(450, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(214, 217, 223));
        mainPanel.setLayout(new BorderLayout(20, 20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Data Mahasiswa", JLabel.CENTER);
        mainPanel.add(title, BorderLayout.NORTH);

        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(100, 150, 200), 2),
            BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));

        String content = 
            "Nama                   :  " + nama + "\n" +
            "Tanggal Lahir      :  " + tgl + "\n" +
            "No.Pendaftaran  :  " + noDaftar + "\n" +
            "No.Telp                :  " + telp + "\n" +
            "Alamat                 :  " + alamat + "\n" +
            "E-mail                  :  " + email;
        
        displayArea.setText(content);
        mainPanel.add(displayArea, BorderLayout.CENTER);

        add(mainPanel);
    }
}