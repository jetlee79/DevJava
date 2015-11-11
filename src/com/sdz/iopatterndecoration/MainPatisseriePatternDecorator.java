package com.sdz.iopatterndecoration;

public class MainPatisseriePatternDecorator {

	public static void main(String[] args) {
		Patisserie pat = new CoucheChocolat(new CoucheCaramel(new CoucheBiscuit(new CoucheChocolat(new Gateau()))));
		System.out.println(pat.preparer());
		
	}

}
