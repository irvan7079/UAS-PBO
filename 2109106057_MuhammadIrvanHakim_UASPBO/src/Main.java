import java.awt.Color;
import java.awt.Cursor;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class Main {
    
    public static class Login extends JFrame implements ActionListener {
        //===================================================================
        // MENU LOGIN
        JTextField txtUsername = new JTextField();
        JPasswordField txtPassword = new JPasswordField();
        JPasswordField txtKonfirmasiPassword = new JPasswordField();
        JLabel lblJudulLogin, lblUsername, lblPassword, linkRegistrasi, lblJudulRegistrasi, lblKonfirmasiPassword;
        JButton btnLogin = new JButton("Login");
        JButton btnRegistrasi = new JButton("Registrasi");
        JButton btnJudul = new JButton("APLIKASI PENDATAAN MOBIL LISTRIK");
        
        // MENU CRUD MOBIL LISTRIK
        JTextField txtId = new JTextField();
        JTextField txtMerk = new JTextField();
        JTextField txtHarga = new JTextField();
        ButtonGroup group = new ButtonGroup();
        JRadioButton radioButton1 = new JRadioButton("Hybrid Electric Vehicle");
        JRadioButton radioButton2 = new JRadioButton("Battery Electric Vehicle");
        String[] pilihan = {"Kurang dari 50 kWh", "50-100 kWh", "100-200 kWh", "Lebih dari 200 kWh"};
        JComboBox<String> comboBox = new JComboBox<>(pilihan);
        
        JLabel lblId, lblMerk, lblHarga, lblrbo, lblcbo;
        
        JButton btnTambah = new JButton("Tambah");
        JButton btnEdit = new JButton("Edit");
        JButton btnHapus = new JButton("Hapus");
        
        Login() {
            setTitle("Aplikasi Pendataan Mobil Listrik");
            setSize(1500, 800);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            getContentPane().setBackground(new java.awt.Color(0, 120, 200));
            setLayout(null);
            
            btnJudul.setBounds(0, 0, 1500, 110);
            btnJudul.setFont(btnJudul.getFont().deriveFont(30f));
            btnJudul.setForeground(Color.BLACK);
            btnJudul.setBackground(new java.awt.Color(135, 206, 250));
            lblJudulLogin = new JLabel(" >> MENU LOGIN << ");
            lblJudulLogin.setBounds(640, 200, 300, 40);
            lblJudulLogin.setFont(lblJudulLogin.getFont().deriveFont(24f));
            lblJudulLogin.setForeground(Color.WHITE);
            lblJudulRegistrasi = new JLabel(" >> MENU REGISTRASI << ");
            lblJudulRegistrasi.setBounds(600, 200, 400, 40);
            lblJudulRegistrasi.setFont(lblJudulRegistrasi.getFont().deriveFont(24f));
            lblJudulRegistrasi.setForeground(Color.WHITE);
            lblUsername = new JLabel("Username: ");
            lblUsername.setBounds(550, 300, 100, 30);
            lblUsername.setFont(lblUsername.getFont().deriveFont(18f));
            lblUsername.setForeground(Color.WHITE);
            lblPassword = new JLabel("Password: ");
            lblPassword.setBounds(550, 360, 100, 30);
            lblPassword.setFont(lblPassword.getFont().deriveFont(18f));
            lblPassword.setForeground(Color.WHITE);
            
            lblKonfirmasiPassword = new JLabel("Konfirmasi Password: ");
            lblKonfirmasiPassword.setBounds(450, 420, 250, 30);
            lblKonfirmasiPassword.setFont(lblPassword.getFont().deriveFont(18f));
            lblKonfirmasiPassword.setForeground(Color.WHITE);
            
            txtUsername.setBounds(690, 300, 250, 30);
            txtUsername.setFont(txtUsername.getFont().deriveFont(18f));
            txtPassword.setBounds(690, 360, 250, 30);
            txtPassword.setFont(txtPassword.getFont().deriveFont(18f));
            
            txtKonfirmasiPassword.setBounds(690, 420, 250, 30);
            txtKonfirmasiPassword.setFont(txtKonfirmasiPassword.getFont().deriveFont(18f));
            btnLogin.setBounds(765, 450, 100, 40);
            btnLogin.setFont(btnLogin.getFont().deriveFont(18f));
            btnLogin.addActionListener(this);
            btnRegistrasi.setBounds(745, 480, 150, 40);
            btnRegistrasi.setFont(btnRegistrasi.getFont().deriveFont(18f));
            btnRegistrasi.addActionListener(this);
            
            //==========================
            txtId.setBounds(690, 300, 250, 30);
            txtId.setFont(txtId.getFont().deriveFont(18f));
            
            txtMerk.setBounds(690, 360, 250, 30);
            txtMerk.setFont(txtMerk.getFont().deriveFont(18f));
            
            txtHarga.setBounds(690, 420, 250, 30);
            txtHarga.setFont(txtHarga.getFont().deriveFont(18f));
            
            radioButton1.setBounds(690, 480, 250, 30);
            radioButton1.setFont(radioButton1.getFont().deriveFont(18f));
            
            radioButton2.setBounds(690, 510, 250, 30);
            radioButton2.setFont(radioButton2.getFont().deriveFont(18f));
            
            comboBox.setBounds(690, 570, 250, 30);
            comboBox.setFont(comboBox.getFont().deriveFont(18f));
            
            lblId = new JLabel("Id: ");
            lblId.setBounds(550, 300, 100, 30);
            lblId.setFont(lblId.getFont().deriveFont(18f));
            lblId.setForeground(Color.WHITE);
            
            lblMerk = new JLabel("Merk: ");
            lblMerk.setBounds(550, 360, 100, 30);
            lblMerk.setFont(lblMerk.getFont().deriveFont(18f));
            lblMerk.setForeground(Color.WHITE);
            
            lblHarga = new JLabel("Harga: ");
            lblHarga.setBounds(550, 420, 100, 30);
            lblHarga.setFont(lblHarga.getFont().deriveFont(18f));
            lblHarga.setForeground(Color.WHITE);
            
            lblrbo = new JLabel("Jenis: ");
            lblrbo.setBounds(550, 480, 100, 30);
            lblrbo.setFont(lblrbo.getFont().deriveFont(18f));
            lblrbo.setForeground(Color.WHITE);
            
            lblcbo = new JLabel("Baterai: ");
            lblcbo.setBounds(550, 570, 100, 30);
            lblcbo.setFont(lblcbo.getFont().deriveFont(18f));
            lblcbo.setForeground(Color.WHITE);
            
            btnTambah.setBounds(900, 650, 150, 40);
            btnTambah.setFont(btnTambah.getFont().deriveFont(18f));
            btnTambah.addActionListener(this);
            
            btnEdit.setBounds(700, 650, 150, 40);
            btnEdit.setFont(btnEdit.getFont().deriveFont(18f));
            btnEdit.addActionListener(this);
            
            btnHapus.setBounds(500, 650, 150, 40);
            btnHapus.setFont(btnHapus.getFont().deriveFont(18f));
            btnHapus.addActionListener(this);
            //===========================
            
            linkRegistrasi = new JLabel("<html><u>Belum punya akun, klik untuk melakukan registrasi.</u></html>");
            linkRegistrasi.setFont(linkRegistrasi.getFont().deriveFont(Font.PLAIN, 14));
            linkRegistrasi.setForeground(Color.WHITE);
            linkRegistrasi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            linkRegistrasi.setBounds(640, 490, 600, 40);
            
            linkRegistrasi.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lblJudulLogin.setVisible(false);
                linkRegistrasi.setVisible(false);
                btnLogin.setVisible(false);
                lblJudulRegistrasi.setVisible(true);
                btnRegistrasi.setVisible(true);
                lblKonfirmasiPassword.setVisible(true);
                txtKonfirmasiPassword.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // Mengubah tampilan saat mouse masuk ke label
                linkRegistrasi.setForeground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Mengembalikan tampilan saat mouse keluar dari label
                linkRegistrasi.setForeground(Color.WHITE);
            }
        });
            add(btnJudul);
            add(lblJudulLogin);
            add(lblUsername);
            add(txtUsername);
            add(lblPassword);
            add(txtPassword);
            add(btnLogin);
            add(btnRegistrasi);
            add(linkRegistrasi);
            add(lblJudulRegistrasi);
            add(lblKonfirmasiPassword);
            add(txtKonfirmasiPassword);
            lblKonfirmasiPassword.setVisible(false);
            txtKonfirmasiPassword.setVisible(false);
            btnRegistrasi.setVisible(false);
            lblJudulRegistrasi.setVisible(false);
            
            add(comboBox);
            group.add(radioButton1);
            group.add(radioButton2);
            add(radioButton1);
            add(radioButton2);
            add(lblId);
            add(lblMerk);
            add(lblHarga);
            add(lblrbo);
            add(lblcbo);
            add(txtId);
            add(txtMerk);
            add(txtHarga);
            add(btnTambah);
            add(btnEdit);
            add(btnHapus);
            
            comboBox.setVisible(false);
            radioButton1.setVisible(false);
            radioButton2.setVisible(false);
            lblId.setVisible(false);
            lblMerk.setVisible(false);
            lblHarga.setVisible(false);
            lblrbo.setVisible(false);
            lblcbo.setVisible(false);
            txtId.setVisible(false);
            txtMerk.setVisible(false);
            txtHarga.setVisible(false);
            btnTambah.setVisible(false);
            btnEdit.setVisible(false);
            btnHapus.setVisible(false);

            setVisible(true);             
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnLogin) {
                JOptionPane.showMessageDialog(this, "LOGIN BERHASIL!");
                lblJudulLogin.setVisible(false);
                lblUsername.setVisible(false);
                txtUsername.setVisible(false);
                lblPassword.setVisible(false);
                txtPassword.setVisible(false);
                btnLogin.setVisible(false);
                linkRegistrasi.setVisible(false);
                
                comboBox.setVisible(true);
                radioButton1.setVisible(true);
                radioButton2.setVisible(true);
                lblId.setVisible(true);
                lblMerk.setVisible(true);
                lblHarga.setVisible(true);
                lblrbo.setVisible(true);
                lblcbo.setVisible(true);
                txtId.setVisible(true);
                txtMerk.setVisible(true);
                txtHarga.setVisible(true);
                btnTambah.setVisible(true);
                btnEdit.setVisible(true);
                btnHapus.setVisible(true);
//                String username = txtUsername.getText();
//                String password = new String(txtPassword.getPassword());

//                if (username.equals("Irvan") && password.equals("057")) {
//                    JOptionPane.showMessageDialog(this, "LOGIN BERHASIL!");
//                    lblJudulLogin.setVisible(false);
//                    lblUsername.setVisible(false);
//                    txtUsername.setVisible(false);
//                    lblPassword.setVisible(false);
//                    txtPassword.setVisible(false);
//                    btnLogin.setVisible(false);

//                } else {
//                    JOptionPane.showMessageDialog(this, "Username atau Password anda salah, silahkan coba lagi...");
//                }

            }
            else if (e.getSource() == btnRegistrasi) {
                JOptionPane.showMessageDialog(this, "REGISTRASI BERHASIL!");
                lblJudulLogin.setVisible(true);
                linkRegistrasi.setVisible(true);
                btnLogin.setVisible(true);
                lblJudulRegistrasi.setVisible(false);
                btnRegistrasi.setVisible(false);
                lblKonfirmasiPassword.setVisible(false);
                txtKonfirmasiPassword.setVisible(false);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new);
    }
}