public class Class125 {
	static Class94_Sub1 aClass94_Sub1_883;
	byte aByte877;
	public int anInt878;
	public int anInt881;
	public int anInt880;
	public int anInt882;
	public int anInt879;

	public Class125(final RSBuf var1, final boolean var2) {
		aByte877 = var1.method559();
		anInt878 = var1.method560();
		anInt881 = var1.method562(-2032144560);
		anInt880 = var1.method562(1119070692);
		anInt882 = var1.method562(1341040541);
		anInt879 = var1.method562(608112255);
	}

	void method452(final int var1) {
		aByte877 &= -8;
		aByte877 = (byte) (aByte877 | (var1 & 7));
	}

	void method453(final int var1) {
		aByte877 &= -9;
		if (var1 == 1)
			aByte877 = (byte) (aByte877 | 8);

	}

	public int method454() {
		return aByte877 & 7;
	}

	public int method455() {
		return (aByte877 & 8) == 8 ? 1 : 0;
	}

	public Class125() {
	}
}
