import java.awt.FontMetrics;

public class Class4 {
	static Class124_Sub22_Sub16_Sub2 aClass124_Sub22_Sub16_Sub2_24;
	static Class124_Sub22_Sub16_Sub2[] aClass124_Sub22_Sub16_Sub2Array25;
	static Class124_Sub22_Sub16_Sub1 aClass124_Sub22_Sub16_Sub1_27;
	static Class124_Sub22_Sub16_Sub2 aClass124_Sub22_Sub16_Sub2_28;
	static Class124_Sub22_Sub16_Sub2 aClass124_Sub22_Sub16_Sub2_29;
	static int[] anIntArray34;
	static Class124_Sub22_Sub16_Sub1 aClass124_Sub22_Sub16_Sub1_40;
	static Class124_Sub22_Sub16_Sub2 aClass124_Sub22_Sub16_Sub2_42;
	static int[] anIntArray46;
	static Class124_Sub22_Sub16_Sub2[] aClass124_Sub22_Sub16_Sub2Array51;
	protected static FontMetrics aFontMetrics53;
	static boolean aBool55;
	static int anInt22 = 0;
	static int anInt30;
	static int[] anIntArray31;
	static int anInt23;
	static int anInt26;
	static int anInt54;
	static int anInt35;
	static int anInt36;
	static int anInt49;
	static int anInt38;
	static String aString39;
	static int anInt43;
	static String aString41;
	static String aString32;
	static String aString47;
	static String aString44;
	static String aString45;
	static Class72 security;
	static boolean aBool37;
	static int anInt33;
	static boolean aBool50;
	static int anInt52;

	static {
		anInt30 = 202 + anInt22;
		anIntArray31 = new int[256];
		anInt23 = 0;
		anInt26 = 0;
		anInt54 = 0;
		anInt35 = 0;
		anInt36 = 0;
		anInt49 = 0;
		anInt38 = 10;
		aString39 = "";
		anInt43 = 0;
		aString41 = "";
		aString32 = "";
		aString47 = "";
		aString44 = "";
		aString45 = "";
		security = Class72.aClass72_593;
		aBool37 = true;
		anInt33 = 0;
		aBool50 = false;
		anInt52 = -1;
	}

	public static Def15 method24(final int var0) {
		Def15 var1 = (Def15) Def15.aClass113_1549.forId(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Def15.aClass94_1551.decode(15, var0);
			var1 = new Def15();
			if (null != var2)
				var1.method748(new RSBuf(var2));

			Def15.aClass113_1549.map(var1, var0);
			return var1;
		}
	}
}
