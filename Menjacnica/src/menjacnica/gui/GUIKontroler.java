package menjacnica.gui;

import java.awt.EventQueue;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import kurs.Kurs;

public class GUIKontroler {
	
	private static MenjacnicaGUI menjacnicaGui;
	private static LinkedList<Kurs> kursevi;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kursevi = new LinkedList<Kurs>();
					menjacnicaGui = new MenjacnicaGUI();
					menjacnicaGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void izadjiIzAplikacije() {
		int opcija = JOptionPane.showConfirmDialog(menjacnicaGui.getContentPane(), "Da li zelite da zatvorite aplikaciju?", "Izlazak iz aplikacije", JOptionPane.YES_NO_OPTION);
		if(opcija == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	public static void dodajKurs(double sifra, String naziv, double prodajniKurs, double srednjiKurs, double kupovniKurs, String skraceniNaziv) {
		Kurs noviKurs = new Kurs();
		noviKurs.setSifra(sifra);
		noviKurs.setNaziv(naziv);
		noviKurs.setProdajniKurs(prodajniKurs);
		noviKurs.setSrednjiKurs(srednjiKurs);
		noviKurs.setKupovniKurs(kupovniKurs);
		noviKurs.setSkraceniNaziv(skraceniNaziv);
		
		kursevi.add(noviKurs);
		menjacnicaGui.refreshTable();
		
	}

	public static void dodajKursUPolje(double sifra, String naziv, double prodajniKurs, double srednjiKurs,
			double kupovniKurs, String skraceniNaziv) {
		menjacnicaGui.upisiUPolje(sifra, naziv, prodajniKurs, srednjiKurs, kupovniKurs, skraceniNaziv);
		menjacnicaGui.refreshTable();
	}
	
	public static void pokreniProzorDodajKursGUI() {
		DodajKursGUI dk = new DodajKursGUI();
		dk.setVisible(true);
		dk.setLocationRelativeTo(null);
	}
	
	public static LinkedList<Kurs> getKurs() {
		return kursevi;
	}
}