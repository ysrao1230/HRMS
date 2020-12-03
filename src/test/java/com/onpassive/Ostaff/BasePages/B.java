package com.onpassive.Ostaff.BasePages;

import java.io.IOException;

import com.onpassive.Ostaff.Utility.FileLibrary;

public class B extends Basepage {

	public static void main(String[] args) throws Exception {
		FileLibrary fl = new FileLibrary();
		System.out.println(fl.getPropKeyvalue(PROP_PATH, "url"));
	}

}
