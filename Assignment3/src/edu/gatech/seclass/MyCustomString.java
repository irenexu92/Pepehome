package edu.gatech.seclass

import java.util.*;

public class MyCustomString implements MyCustomStringInterfaces{
	private String Str;

	public String getString(){
		return this.Str;
	}

	public void setString(String string);
		if (string != null){
			this.Str = string;
		}
		else{
			this.Str = new String();
		}

	public int countNumbers(){
		int count = 0;

		Pattern digitcount = Pattern.compile("\d+");
		Matcher digitmatch = digitcount.matcher(this.Str);
		while (digitmatch.find()) {
			count++;
		}
		
		return count;
	}

	public String rotateCharacters(int n, boolean right){
		if (this.Str == null){
			throw new NullPointerException();
		}
		if (int n <= 0 && this.Str != null){
			throw new IllegalArgumentException();
		}
		String tempArray[];
		tempArray = this.Str.split("(?<=\\G.{" + n + "})");
		for(int i = 0; i < tempArray.length; i++) {
			if(right){
				tempArray[i] = tempArray[i].substring(tempArray[i].length() - 1) + tempArray[i].substring(0, tempArray[i].length() - 1);
			} else{
				tempArray[i] = tempArray[i].substring(1) + tempArray[i].substring(0,1);
			}
		}
		String rotated = String.join("", tempArray);
		return rotated;
	}

	public void convertLettersToDigitsInSubstring(int startPosition, int endPosition){
		if (this.Str == null){
			throw new NullPointerException();
		}
		if (startPosition < 0 || endPosition >= this.Str.length()) {
			throw new MyIndexOutOfBoundsException();
		}
		if (startPosition > endPosition){
			throw new IllegalArgumentException();
		}

		String rawString = this.Str.substring(startPosition, endPosition);
		rawString = rawString.toLowerCase();

		String[] charArray = rawString.split("");
		int lastCharIndex = 0;

		Pattern isChar = Pattern.compile("[a-z]");

		for (int k = 0; k < charArray.length; k++) {
			Matcher isCharLtr = isChar.matcher(charArray[k]);
			if (isCharLtr.find()) {
				int convVal = charArray[k].charAt(0) - 'a' + 1;
				charArray[k] = Integer.toString(convVal) + ',';
				lastCharIndex = k;
			}
		}

		charArray[lastCharIndex] = charArray[lastCharIndex].substring(0, charArray[lastCharIndex].length() - 1);
		this.Str = this.Str.substring(0, startPosition) + String.join("", charArray) + this.Str.substring(endPosition, this.Str.length() - 1);
	}