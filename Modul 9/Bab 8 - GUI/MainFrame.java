import java.awt.*; 
import java.awt.event.*; 

public class MainFrame extends Frame {
    TextField utsField, uasField, tugasField, kuisField, fieldHasil;
    Checkbox pemlanCheckbox, asdCheckbox, matkomlanCheckbox, probstatCheckbox;
    CheckboxGroup grupMatkul;
    Button hitungButton, tampilButton;
    TextArea areaOutput;

    public MainFrame() {
        setTitle("Hitung Nilai Akhir dengan GUI");
        setSize(450, 700);
        setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); 
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Label title = new Label("Hitung Nilai Akhir", Label.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        add(title, gbc);

        Panel buttonRadio = new Panel(new FlowLayout());
        grupMatkul = new CheckboxGroup();
        buttonRadio.add(asdCheckbox = new Checkbox("ASD", grupMatkul, false));
        buttonRadio.add(pemlanCheckbox = new Checkbox("Pemlan", grupMatkul, true));
        buttonRadio.add(matkomlanCheckbox = new Checkbox("Matkomlan", grupMatkul, false));
        buttonRadio.add(probstatCheckbox = new Checkbox("Probstat", grupMatkul, false));
        
        gbc.gridy = 1;
        add(buttonRadio, gbc);

        Panel panelInput = new Panel(new GridLayout(5, 2, 10, 10));
        
        panelInput.add(new Label("Tugas :", Label.RIGHT));   
        tugasField = new TextField(); panelInput.add(tugasField);
        
        panelInput.add(new Label("Kuis :", Label.RIGHT));    
        kuisField = new TextField();  panelInput.add(kuisField);
        
        panelInput.add(new Label("UTS :", Label.RIGHT));     
        utsField = new TextField();   panelInput.add(utsField);
        
        panelInput.add(new Label("UAS :", Label.RIGHT));     
        uasField = new TextField();   panelInput.add(uasField);
        
        panelInput.add(new Label("Hasil :", Label.RIGHT));   
        fieldHasil = new TextField(); panelInput.add(fieldHasil);
        fieldHasil.setEditable(false);

        gbc.gridy = 2; 
        gbc.gridwidth = 1;
        gbc.insets = new Insets(10, 60, 10, 60); 
        add(panelInput, gbc);

        gbc.gridy = 3; 
        gbc.insets = new Insets(10, 120, 10, 120);
        add(hitungButton = new Button("Hitung"), gbc);

        areaOutput = new TextArea("HASIL NILAI SEMUA MATA KULIAH\n\n", 10, 40, TextArea.SCROLLBARS_VERTICAL_ONLY);
        areaOutput.setEditable(false);
        gbc.gridy = 4; 
        gbc.insets = new Insets(10, 30, 10, 30);
        add(areaOutput, gbc);

        gbc.gridy = 5;
        gbc.insets = new Insets(5, 30, 20, 30);
        add(tampilButton = new Button("Tampilkan nilai semua matkul"), gbc);

        hitungButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int tgs = Integer.parseInt(tugasField.getText());
                    int kuis = Integer.parseInt(kuisField.getText());
                    int uts = Integer.parseInt(utsField.getText());
                    int uas = Integer.parseInt(uasField.getText());

                    MataKuliah matkul;
                    Checkbox opsi = grupMatkul.getSelectedCheckbox();

                    if (opsi == pemlanCheckbox) {
                        matkul = new Pemlan();
                    } else if (opsi == asdCheckbox) {
                        matkul = new ASD();
                    } else if (opsi == matkomlanCheckbox) {
                        matkul = new Matkomlan();
                    } else {
                        matkul = new Probstat();
                    }

                    matkul.setNilai(uts, uas, tgs, kuis);
                    double hasil = matkul.hitungNilaiAkhir();

                    fieldHasil.setText(String.format("%.1f", hasil));
                    
                } catch (NumberFormatException ex) {
                    fieldHasil.setText("Input Angka!");
                }
            }
        });

        tampilButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String matkulTerpilih = grupMatkul.getSelectedCheckbox().getLabel();
                String nilaiAkhir = fieldHasil.getText();
                
                if (!nilaiAkhir.isEmpty() && !nilaiAkhir.equals("Input Angka!")) {
                    String namaMatkul = matkulTerpilih;
                    
                    if (namaMatkul.equals("ASD")) {
                        namaMatkul = "ASD           ";
                    } else if (namaMatkul.equals("Pemlan")) {
                        namaMatkul = "Pemlan      ";
                    } else if (namaMatkul.equals("Matkomlan")) {
                        namaMatkul = "Matkomlan ";
                    } else if (namaMatkul.equals("Probstat")) {
                        namaMatkul = "Probstat     ";
                    }
                    areaOutput.append(namaMatkul + " : " + nilaiAkhir + "\n");
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { dispose(); }
        });
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}