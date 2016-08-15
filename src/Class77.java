public class Class77 {
	public static Class124_Sub4_Sub3 aClass124_Sub4_Sub3_624;
	static char[] aCharArray621 = new char[64];
	static char[] aCharArray622;
	static int[] anIntArray623;

	static {
		int var0;
		for (var0 = 0; var0 < 26; ++var0)
			aCharArray621[var0] = (char) (var0 + 65);

		for (var0 = 26; var0 < 52; ++var0)
			aCharArray621[var0] = (char) ((var0 + 97) - 26);

		for (var0 = 52; var0 < 62; ++var0)
			aCharArray621[var0] = (char) ((48 + var0) - 52);

		aCharArray621[62] = 43;
		aCharArray621[63] = 47;
		aCharArray622 = new char[64];

		for (var0 = 0; var0 < 26; ++var0)
			aCharArray622[var0] = (char) (var0 + 65);

		for (var0 = 26; var0 < 52; ++var0)
			aCharArray622[var0] = (char) ((97 + var0) - 26);

		for (var0 = 52; var0 < 62; ++var0)
			aCharArray622[var0] = (char) ((48 + var0) - 52);

		aCharArray622[62] = 42;
		aCharArray622[63] = 45;
		anIntArray623 = new int[128];

		for (var0 = 0; var0 < anIntArray623.length; ++var0)
			anIntArray623[var0] = -1;

		for (var0 = 65; var0 <= 90; ++var0)
			anIntArray623[var0] = var0 - 65;

		for (var0 = 97; var0 <= 122; ++var0)
			anIntArray623[var0] = 26 + (var0 - 97);

		for (var0 = 48; var0 <= 57; ++var0)
			anIntArray623[var0] = 52 + (var0 - 48);

		final int[] var1 = anIntArray623;
		anIntArray623[43] = 62;
		var1[42] = 62;
		final int[] var2 = anIntArray623;
		anIntArray623[47] = 63;
		var2[45] = 63;
	}
}
