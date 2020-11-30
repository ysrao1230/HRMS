package com.onpassiveOstaff.BasePages;

import java.io.IOException;

import com.onpassiveOstaff.Utility.FileLibrary;

public class B extends Basepage {

	public static void main(String[] args) throws Exception {
		FileLibrary fl = new FileLibrary();
		System.out.println(fl.getPropKeyvalue(PROP_PATH, "url"));
	}

}
