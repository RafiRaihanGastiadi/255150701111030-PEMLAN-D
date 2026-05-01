import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormDaftarUlang extends JFrame {
    private JTextField namaField, tanggalField, noDaftarField, telponField, emailField;
    private JTextArea txtAlamat;
    private JButton submitButton;

    public FormDaftarUlang() {
        setTitle("Form Daftar Ulang");
        setSize(500, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelUtama = new JPanel(new GridBagLayout());
        panelUtama.setBackground(new Color(230, 230, 235));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 15, 10, 15);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        namaField = new JTextField(20);
        tanggalField = new JTextField(20);
        noDaftarField = new JTextField(20);
        telponField = new JTextField(20);
        emailField = new JTextField(20);
        txtAlamat = new JTextArea(4, 20);
        txtAlamat.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        
        submitButton = new JButton("submit");

        tambahBarisInput("Nama Lengkap", namaField, panelUtama, gbc, 0);
        tambahBarisInput("Tanggal Lahir", tanggalField, panelUtama, gbc, 1);
        tambahBarisInput("Nomor Pendaftaran", noDaftarField, panelUtama, gbc, 2);
        tambahBarisInput("No. Telp", telponField, panelUtama, gbc, 3);
        
        gbc.gridx = 0; gbc.gridy = 4;
        panelUtama.add(new JLabel("Alamat"), gbc);
        gbc.gridx = 1;
        panelUtama.add(new JScrollPane(txtAlamat), gbc);

        tambahBarisInput("E-mail", emailField, panelUtama, gbc, 5);

        gbc.gridx = 1; gbc.gridy = 6;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_END;
        panelUtama.add(submitButton, gbc);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jalankanProsedurSubmit();
            }
        });

        add(panelUtama);
    }

    private void tambahBarisInput(String label, JTextField field, JPanel panel, GridBagConstraints gbc, int baris) {
        gbc.gridx = 0; gbc.gridy = baris;
        panel.add(new JLabel(label), gbc);
        gbc.gridx = 1;
        panel.add(field, gbc);
    }

    private void jalankanProsedurSubmit() {
        if (namaField.getText().trim().isEmpty() || tanggalField.getText().trim().isEmpty() || 
            noDaftarField.getText().trim().isEmpty() || telponField.getText().trim().isEmpty() || 
            txtAlamat.getText().trim().isEmpty() || emailField.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Semua kolom harus terisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int konfirmasi = JOptionPane.showConfirmDialog(this, 
            "Apakah anda yakin data yang Anda isi sudah benar?", 
            "Konfirmasi Data", JOptionPane.OK_CANCEL_OPTION);

        if (konfirmasi == JOptionPane.OK_OPTION) {
            DataMahasiswaFrame frameHasil = new DataMahasiswaFrame(
                namaField.getText(), tanggalField.getText(), noDaftarField.getText(),
                telponField.getText(), txtAlamat.getText(), emailField.getText()
            );
            frameHasil.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FormDaftarUlang().setVisible(true);
        });
    }
}