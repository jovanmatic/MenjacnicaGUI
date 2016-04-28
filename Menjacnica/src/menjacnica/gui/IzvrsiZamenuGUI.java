package menjacnica.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JTextField textFieldKupovni;
	private JLabel lblProdajniKurs;
	private JTextField textFieldProdajni;
	private JComboBox comboBoxPadajucaLista;
	private JLabel lblIznos;
	private JTextField textFieldIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JSlider sliderKlizac;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private ButtonGroup grupa = new ButtonGroup();
	
	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI() {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getComboBoxPadajucaLista());
		comboBoxPadajucaLista.addItem("EUR");
		comboBoxPadajucaLista.addItem("USD");
		comboBoxPadajucaLista.addItem("CHF");
		contentPane.add(getLblIznos());
		contentPane.add(getTextFieldIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		grupa.add(rdbtnKupovina);
		grupa.add(rdbtnProdaja);
		contentPane.add(getSliderKlizac());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setPreferredSize(new Dimension(100, 25));
			lblKupovniKurs.setBounds(12, 13, 86, 30);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setEditable(false);
			textFieldKupovni.setBounds(12, 44, 149, 39);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(283, 13, 86, 30);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setEditable(false);
			textFieldProdajni.setBounds(283, 44, 149, 39);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}
	private JComboBox getComboBoxPadajucaLista() {
		if (comboBoxPadajucaLista == null) {
			comboBoxPadajucaLista = new JComboBox();
			comboBoxPadajucaLista.setBounds(173, 44, 98, 39);
		}
		return comboBoxPadajucaLista;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(12, 96, 86, 30);
		}
		return lblIznos;
	}
	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setBounds(12, 122, 149, 39);
			textFieldIznos.setColumns(10);
		}
		return textFieldIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(283, 96, 106, 30);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.setBounds(283, 122, 127, 25);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.setBounds(283, 146, 127, 25);
		}
		return rdbtnProdaja;
	}
	private JSlider getSliderKlizac() {
		if (sliderKlizac == null) {
			sliderKlizac = new JSlider();
			sliderKlizac.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textFieldIznos.setText("" + sliderKlizac.getValue());
				}
			});
			sliderKlizac.setValueIsAdjusting(true);
			sliderKlizac.setPaintLabels(true);
			sliderKlizac.setMajorTickSpacing(10);
			sliderKlizac.setMinorTickSpacing(5);
			sliderKlizac.setPaintTicks(true);
			sliderKlizac.setBounds(12, 180, 420, 52);
		}
		return sliderKlizac;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String valuta = (String) comboBoxPadajucaLista.getSelectedItem();
					double iznos = Double.parseDouble(textFieldIznos.getText());
					String izbor;
					if(getRdbtnKupovina().isSelected()) {
						izbor = "Kupovina";
					} else {
						izbor = "Prodaja";
					}
					GUIKontroler.ispisIzmene(valuta, iznos, izbor);
				}
			});
			btnIzvrsiZamenu.setBounds(12, 245, 149, 39);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(283, 245, 149, 39);
		}
		return btnOdustani;
	}
}
