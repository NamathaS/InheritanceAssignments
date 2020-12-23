package sample;

public class NumberHolder {
	public int anInt;
	public float aFloat;
	
	public NumberHolder() {}
	
	public NumberHolder(int aint, float afloat) {
		anInt=aint;
		aFloat=afloat;
	}
	
	public void setAnInt(int value) {
		anInt=value;
	}
	public void setAFloat(float value) {
		aFloat=value;
	}
	public int getAnInt() {
		return anInt;
	}
	public float getAFloat() {
		return aFloat;
	}
	


}
