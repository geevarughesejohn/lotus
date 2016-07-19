package me.lotus.lotuscore.services;

import java.util.ArrayList;
import java.util.List;

public abstract class Register<R extends RegisterEntryRow> {

	private List<RegisterEntryRow> rows;

	public Register() {
		this.rows = new ArrayList<RegisterEntryRow>();
	}

	public void addRow(R r) {
		rows.add(r);
	}

	public void removeRow(R r) {
		rows.remove(r);
	}

}
