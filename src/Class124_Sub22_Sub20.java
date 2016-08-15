public class Class124_Sub22_Sub20 extends Class124_Sub22 {
	static Class69 aClass69_1642;
	static Class94_Sub1 aClass94_Sub1_1647;
	public int anInt1646;
	public int anInt1643;
	public int[] anIntArray1644;
	public int[] anIntArray1645;

	public boolean method881(final int var1, final int var2) {
		if ((var2 >= 0) && (var2 < anIntArray1645.length)) {
			final int var3 = anIntArray1645[var2];
			if ((var1 >= var3) && (var1 <= (var3 + anIntArray1644[var2])))
				return true;
		}

		return false;
	}

	Class124_Sub22_Sub20(final int var1, final int var2, final int[] var3, final int[] var4, final int var5) {
		anInt1646 = var1;
		anInt1643 = var2;
		anIntArray1644 = var3;
		anIntArray1645 = var4;
	}
}
