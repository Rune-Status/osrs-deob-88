public class Class124_Sub15 extends Class124 {
	int anInt1090;
	int anInt1091;
	int anInt1094;
	int anInt1101;
	static int anInt1106;
	int anInt1107;
	int anInt1112;
	String aString1102;
	String aString1103;
	String aString1108;
	String aString1105;
	int[] anIntArray1110 = new int[3];
	int anInt1089;
	boolean aBool1104;
	int anInt1092;
	int anInt1093;
	int anInt1098;
	int anInt1111;
	int anInt1096;
	boolean aBool1097;
	int anInt1095;
	int anInt1099;
	int anInt1100;
	String aString1088;
	String aString1109;

	void method608() {
		if (aString1102.length() > 40)
			aString1102 = aString1102.substring(0, 40);

		if (aString1103.length() > 40)
			aString1103 = aString1103.substring(0, 40);

		if (aString1108.length() > 10)
			aString1108 = aString1108.substring(0, 10);

		if (aString1105.length() > 10)
			aString1105 = aString1105.substring(0, 10);

	}

	public int method609() {
		final byte var1 = 38;
		int var2 = var1 + Class121_Sub1.method488(aString1102);
		var2 += Class121_Sub1.method488(aString1103);
		var2 += Class121_Sub1.method488(aString1108);
		var2 += Class121_Sub1.method488(aString1105);
		var2 += Class121_Sub1.method488(aString1088);
		var2 += Class121_Sub1.method488(aString1109);
		return var2;
	}

	public Class124_Sub15(final boolean var1) {
		if (Class7.aString75.startsWith("win"))
			anInt1089 = 1;
		else if (Class7.aString75.startsWith("mac"))
			anInt1089 = 2;
		else if (Class7.aString75.startsWith("linux"))
			anInt1089 = 3;
		else
			anInt1089 = 4;

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase();
		} catch (final Exception var13) {
			var2 = "";
		}

		String var4;
		try {
			var4 = System.getProperty("os.version").toLowerCase();
		} catch (final Exception var12) {
			var4 = "";
		}

		String var3 = "Unknown";
		String var5 = "1.1";

		try {
			var3 = System.getProperty("java.vendor");
			var5 = System.getProperty("java.version");
		} catch (final Exception var11) {
			;
		}

		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64"))
			aBool1104 = false;
		else
			aBool1104 = true;

		if (anInt1089 == 1) {
			if (var4.indexOf("4.0") != -1)
				anInt1092 = 1;
			else if (var4.indexOf("4.1") != -1)
				anInt1092 = 2;
			else if (var4.indexOf("4.9") != -1)
				anInt1092 = 3;
			else if (var4.indexOf("5.0") != -1)
				anInt1092 = 4;
			else if (var4.indexOf("5.1") != -1)
				anInt1092 = 5;
			else if (var4.indexOf("5.2") != -1)
				anInt1092 = 8;
			else if (var4.indexOf("6.0") != -1)
				anInt1092 = 6;
			else if (var4.indexOf("6.1") != -1)
				anInt1092 = 7;
			else if (var4.indexOf("6.2") != -1)
				anInt1092 = 9;
			else if (var4.indexOf("6.3") != -1)
				anInt1092 = 10;
		} else if (anInt1089 == 2)
			if (var4.indexOf("10.4") != -1)
				anInt1092 = 20;
			else if (var4.indexOf("10.5") != -1)
				anInt1092 = 21;
			else if (var4.indexOf("10.6") != -1)
				anInt1092 = 22;
			else if (var4.indexOf("10.7") != -1)
				anInt1092 = 23;
			else if (var4.indexOf("10.8") != -1)
				anInt1092 = 24;
			else if (var4.indexOf("10.9") != -1)
				anInt1092 = 25;
			else if (var4.indexOf("10.10") != -1)
				anInt1092 = 26;

		if (var3.toLowerCase().indexOf("sun") != -1)
			anInt1093 = 1;
		else if (var3.toLowerCase().indexOf("microsoft") != -1)
			anInt1093 = 2;
		else if (var3.toLowerCase().indexOf("apple") != -1)
			anInt1093 = 3;
		else if (var3.toLowerCase().indexOf("oracle") != -1)
			anInt1093 = 5;
		else
			anInt1093 = 4;

		int var7 = 2;
		int var8 = 0;

		char var9;
		try {
			while (var7 < var5.length()) {
				var9 = var5.charAt(var7);
				if ((var9 < 48) || (var9 > 57))
					break;

				var8 = (var9 - 48) + (10 * var8);
				++var7;
			}
		} catch (final Exception var16) {
			;
		}

		anInt1098 = var8;
		var7 = var5.indexOf(46, 2) + 1;
		var8 = 0;

		try {
			while (var7 < var5.length()) {
				var9 = var5.charAt(var7);
				if ((var9 < 48) || (var9 > 57))
					break;

				var8 = (var8 * 10) + (var9 - 48);
				++var7;
			}
		} catch (final Exception var15) {
			;
		}

		anInt1111 = var8;
		var7 = var5.indexOf(95, 4) + 1;
		var8 = 0;

		try {
			while (var7 < var5.length()) {
				var9 = var5.charAt(var7);
				if ((var9 < 48) || (var9 > 57))
					break;

				var8 = (var8 * 10) + (var9 - 48);
				++var7;
			}
		} catch (final Exception var14) {
			;
		}

		anInt1096 = var8;
		aBool1097 = false;
		anInt1095 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		if (anInt1098 > 3)
			anInt1099 = Runtime.getRuntime().availableProcessors();
		else
			anInt1099 = 0;

		anInt1100 = 0;
		if (null == aString1102)
			aString1102 = "";

		if (null == aString1103)
			aString1103 = "";

		if (aString1108 == null)
			aString1108 = "";

		if (null == aString1105)
			aString1105 = "";

		if (aString1088 == null)
			aString1088 = "";

		if (null == aString1109)
			aString1109 = "";

		method608();
	}

	public void method610(final Class124_Sub14 var1) {
		var1.method545(6);
		var1.method545(anInt1089);
		var1.method545(aBool1104 ? 1 : 0);
		var1.method545(anInt1092);
		var1.method545(anInt1093);
		var1.method545(anInt1098);
		var1.method545(anInt1111);
		var1.method545(anInt1096);
		var1.method545(aBool1097 ? 1 : 0);
		var1.method592(anInt1095);
		var1.method545(anInt1099);
		var1.method547(anInt1100);
		var1.method592(anInt1112);
		var1.method600(aString1102);
		var1.method600(aString1103);
		var1.method600(aString1108);
		var1.method600(aString1105);
		var1.method545(anInt1094);
		var1.method592(anInt1101);
		var1.method600(aString1088);
		var1.method600(aString1109);
		var1.method545(anInt1091);
		var1.method545(anInt1107);

		for (final int element : anIntArray1110)
			var1.method548(element);

		var1.method548(anInt1090);
	}

	public static void method611(final int var0, int var1) {
		final Class124_Sub22_Sub11 var2 = Class32.method185(var0);
		final int var6 = var2.anInt1510;
		final int var4 = var2.anInt1513;
		final int var3 = var2.anInt1511;
		int var5 = Class91.anIntArray713[var3 - var4];
		if ((var1 < 0) || (var1 > var5))
			var1 = 0;

		var5 <<= var4;
		Class91.anIntArray711[var6] = (Class91.anIntArray711[var6] & ~var5) | ((var1 << var4) & var5);
	}
}
