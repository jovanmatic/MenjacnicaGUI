package menjacnica.gui.model;

import java.util.LinkedList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import kurs.Kurs;

public class KursTableModel extends AbstractTableModel {

	private final String[] kolone = new String[] {"Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"};
	private List<Kurs> kursevi;
	
	public KursTableModel(List<Kurs> kursevi) {
		this.kursevi = kursevi;
	}
	
	@Override
	public int getColumnCount() {
		return kolone.length;
	}
	@Override
	public int getRowCount() {
		try {
			return kursevi.size();
		} catch(Exception e) {
			return 0;
		}
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Kurs noviKurs = kursevi.get(rowIndex);
		switch(columnIndex) {
		case 0: return noviKurs.getSifra();
		case 1: return noviKurs.getSkraceniNaziv();
		case 2: return noviKurs.getProdajniKurs();
		case 3: return noviKurs.getSrednjiKurs();
		case 4: return noviKurs.getKupovniKurs();
		case 5: return noviKurs.getNaziv();
		default: return 0;
		}
	}
	
	@Override
	public String getColumnName(int column) {
		return kolone[column];
	}
	
	public void PostaviKurseve(List<Kurs> kursevi) {
		this.kursevi = kursevi;
		fireTableDataChanged();	
	}
	
	public Kurs getKurs(int index) {
		return kursevi.get(index);
	}
}
