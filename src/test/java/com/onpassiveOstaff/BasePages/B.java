package com.onpassiveOstaff.BasePages;

import java.io.IOException;

public class B {

	public static void main(String[] args) throws IOException {
		Configurationfileread con = new Configurationfileread();
		System.out.println(con.fileread("url"));

	}

}
