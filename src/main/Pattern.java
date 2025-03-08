package main;
import pattern.NumberPattern;
import pattern.StarPattern;

public class Pattern {
	StarPattern starPattern;NumberPattern numberPattern;
	
	public Pattern() {
		starPattern=new StarPattern();
		numberPattern=new NumberPattern(); }
	
	public static void main(String[] args) {
		Pattern pattern=new Pattern();
		pattern.print();
	}
	
	
	
	public void print() {
		//starPattern.rightPyramid(6);
		//starPattern.leftPyramid(6);
		starPattern.reverseRightPyramid(5);
	}
}
