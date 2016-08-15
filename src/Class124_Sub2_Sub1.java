public class Class124_Sub2_Sub1 extends Class124_Sub2 {
	public int anInt1590;
	public byte[] aByteArray1586;
	public int anInt1588;
	int anInt1587;
	public boolean aBool1589;

	Class124_Sub2_Sub1(final int var1, final byte[] var2, final int var3, final int var4) {
		anInt1590 = var1;
		aByteArray1586 = var2;
		anInt1588 = var3;
		anInt1587 = var4;
	}

	public Class124_Sub2_Sub1 method821(final Class16 var1) {
		aByteArray1586 = var1.method78(aByteArray1586);
		anInt1590 = var1.method79(anInt1590);
		if (anInt1588 != anInt1587) {
			anInt1588 = var1.method80(anInt1588);
			anInt1587 = var1.method80(anInt1587);
			if (anInt1588 == anInt1587)
				--anInt1588;
		} else
			anInt1588 = anInt1587 = var1.method80(anInt1588);

		return this;
	}

	Class124_Sub2_Sub1(final int var1, final byte[] var2, final int var3, final int var4, final boolean var5) {
		anInt1590 = var1;
		aByteArray1586 = var2;
		anInt1588 = var3;
		anInt1587 = var4;
		aBool1589 = var5;
	}
}
