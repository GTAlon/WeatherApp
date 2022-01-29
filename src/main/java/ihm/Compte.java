package ihm;

import java.awt.EventQueue;
import compte.Personne;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Compte {

	private JFrame frame;
	private JTextField fieldName;
	private JTextField fieldFirst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compte window = new Compte();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Compte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Création de compte");
		lblNewJgoodiesTitle.setBounds(153, 6, 137, 16);
		panel.add(lblNewJgoodiesTitle);
		
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setBounds(90, 71, 61, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Prénom :");
		lblNewLabel_1.setBounds(90, 120, 61, 16);
		panel.add(lblNewLabel_1);
		
		
		
		fieldName = new JTextField();
		fieldName.setBounds(163, 66, 130, 26);
		panel.add(fieldName);
		fieldName.setColumns(10);
		
		fieldFirst = new JTextField();
		fieldFirst.setBounds(163, 115, 130, 26);
		panel.add(fieldFirst);
		fieldFirst.setColumns(10);
		
		JButton btn_Valid = new JButton("OK");
		btn_Valid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Personne person = new Personne(fieldName.getText(),fieldFirst.getText());
			}
		});
		btn_Valid.setBounds(173, 157, 117, 29);
		panel.add(btn_Valid);
	}
}
