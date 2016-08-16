public class Class120 {
	String aString848;
	String aString852;
	public int anInt851;
	public long aLong849;
	public Class125 aClass125_850;

	public String method445() {
		return aString848;
	}

	public String method446() {
		return aString852;
	}

	Class120(final RSBuf var1, final byte var2, final int var3) {
		aString848 = var1.readStr2();
		aString852 = var1.readStr2();
		anInt851 = var1.readShortU();
		aLong849 = var1.readLong2();
		final int var4 = var1.readInt2(1599678246);
		final int var5 = var1.readInt2(377225105);
		aClass125_850 = new Class125();
		aClass125_850.method452(2);
		aClass125_850.method453(var2);
		aClass125_850.anInt881 = var4;
		aClass125_850.anInt880 = var5;
		aClass125_850.anInt882 = 0;
		aClass125_850.anInt879 = 0;
		aClass125_850.anInt878 = var3;
	}
}
