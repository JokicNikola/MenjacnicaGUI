package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblValuta;
	private JLabel lblProdajni;
	private JTextField textFieldKupovni;
	private JTextField textFieldProdajni;
	private JComboBox comboBoxValuta;
	private JLabel lblIznos;
	private JLabel lblVrstaTransakcije;
	private JTextField textFieldIznos;
	private JRadioButton rdbtnNewRadioButtonKupovina;
	private JRadioButton rdbtnNewRadioButtonProdaja;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	MenjacnicaGUI menjacnica;

	

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI menjacnica) {
		this.menjacnica=menjacnica;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(getLblNewLabel())
								.addComponent(getTextFieldKupovni(), GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(getLblValuta())
									.addPreferredGap(ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
									.addComponent(getLblProdajni())
									.addGap(45))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(getComboBoxValuta(), GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
									.addComponent(getTextFieldProdajni(), GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(getLblIznos())
								.addComponent(getTextFieldIznos(), GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(getRdbtnNewRadioButtonKupovina())
								.addComponent(getLblVrstaTransakcije())
								.addComponent(getRdbtnNewRadioButtonProdaja()))
							.addContainerGap(94, Short.MAX_VALUE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(getBtnIzvrsiZamenu())
					.addPreferredGap(ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
					.addComponent(getBtnOdustani())
					.addGap(58))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(getSlider(), GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblNewLabel())
						.addComponent(getLblValuta())
						.addComponent(getLblProdajni()))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getTextFieldKupovni(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextFieldProdajni(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(getComboBoxValuta(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblIznos())
						.addComponent(getLblVrstaTransakcije()))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getTextFieldIznos(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(getRdbtnNewRadioButtonKupovina()))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getRdbtnNewRadioButtonProdaja())
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getSlider(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getBtnIzvrsiZamenu())
						.addComponent(getBtnOdustani()))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Kupovni kurs");
		}
		return lblNewLabel;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
		}
		return lblValuta;
	}
	private JLabel getLblProdajni() {
		if (lblProdajni == null) {
			lblProdajni = new JLabel("Prodajni kurs");
		}
		return lblProdajni;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setEditable(false);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setEditable(false);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}
	private JComboBox getComboBoxValuta() {
		if (comboBoxValuta == null) {
			comboBoxValuta = new JComboBox();
			comboBoxValuta.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
		}
		return comboBoxValuta;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
		}
		return lblIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
		}
		return lblVrstaTransakcije;
	}
	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setColumns(10);
			
		}
		return textFieldIznos;
	}
	private JRadioButton getRdbtnNewRadioButtonKupovina() {
		if (rdbtnNewRadioButtonKupovina == null) {
			rdbtnNewRadioButtonKupovina = new JRadioButton("Kupovina");
			rdbtnNewRadioButtonKupovina.setSelected(true);
			buttonGroup_1.add(rdbtnNewRadioButtonKupovina);
		}
		return rdbtnNewRadioButtonKupovina;
	}
	private JRadioButton getRdbtnNewRadioButtonProdaja() {
		if (rdbtnNewRadioButtonProdaja == null) {
			rdbtnNewRadioButtonProdaja = new JRadioButton("Prodaja");
			buttonGroup_1.add(rdbtnNewRadioButtonProdaja);
		}
		return rdbtnNewRadioButtonProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					textFieldIznos.setText(""+slider.getValue());
				}
			});
			slider.setMinorTickSpacing(5);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMajorTickSpacing(10);
		}
		return slider;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String transfer;
					if(rdbtnNewRadioButtonProdaja.isSelected())
						transfer="Prodaja";
					else transfer="kupovina";
					
					String podaci = (String)comboBoxValuta.getSelectedItem()+" "+textFieldIznos.getText()+" "+transfer+"\n";
				menjacnica.textAreaStatus.setText(menjacnica.textAreaStatus.getText()+podaci);
				dispose();
				}
			});
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
		return btnOdustani;
	}
}
