public class Def9 extends Class124_Sub22 {
	public int anInt1318;
	static Class94 aClass94_1328;
	static int[] anIntArray1335;
	static Widget aClass124_Sub17_1352;
	public String aString1319 = "null";
	public int anInt1320 = 1;
	public int anInt1323 = -1;
	public int anInt1324 = -1;
	public int anInt1325 = -1;
	public int anInt1326 = -1;
	public int anInt1327 = -1;
	public int anInt1334 = -1;
	public int anInt1329 = -1;
	public String[] aStringArray1344 = new String[5];
	public boolean aBool1332 = true;
	public int anInt1350 = -1;
	int anInt1336 = 128;
	int anInt1337 = 128;
	public boolean aBool1338 = false;
	int anInt1315 = 0;
	int anInt1340 = 0;
	public int anInt1322 = -1;
	public int anInt1343 = 32;
	int anInt1339 = -1;
	int anInt1351 = -1;
	public boolean aBool1346 = true;
	public boolean aBool1347 = true;
	public boolean aBool1348 = false;
	public int anInt1349 = 30;
	int[] anIntArray1321;
	short[] aShortArray1330;
	short[] aShortArray1331;
	short[] aShortArray1345;
	short[] aShortArray1333;
	int[] anIntArray1341;
	public int[] anIntArray1342;
	static Class113 aClass113_1316 = new Class113(64);
	static Class113 aClass113_1317 = new Class113(50);

	void method638() {
	}

	static final void method639() {
		Def4.aClass113_1553.method436();
		Class22.method147();
		Def3.aClass113_1354.method436();
		Class62.method275();
		RuntimeException_Sub1.method1011();
		Class71.method308();
		Def12.aClass113_1532.method436();
		Def12.aClass113_1541.method436();
		Def13.aClass113_1515.method436();
		Def13.aClass113_1518.method436();
		Class28.method168();
		Def16.aClass113_1373.method436();
		Class124_Sub22_Sub19_Sub3.method897();
		Widget.aClass113_1147.method436();
		Widget.aClass113_1164.method436();
		Widget.aClass113_1149.method436();
		Widget.aClass113_1150.method436();
		((Class31) Class124_Sub22_Sub16_Sub3.anInterface2_1828).method177();
		Somet2.aClass113_1600.method436();
		Class82.aClass94_Sub1_671.empty();
		Class45.aClass94_Sub1_450.empty();
		Class9.aClass94_Sub1_100.empty();
		Class39.aClass94_Sub1_399.empty();
		Class125.aClass94_Sub1_883.empty();
		Class5.aClass94_Sub1_58.empty();
		Class66.aClass94_Sub1_562.empty();
		Class124_Sub11.aClass94_Sub1_1047.empty();
		Class65.aClass94_Sub1_561.empty();
		Class124_Sub22_Sub20.aClass94_Sub1_1647.empty();
		Class68.aClass94_Sub1_571.empty();
		Class88.aClass94_Sub1_695.empty();
	}

	void method640(final RSBuf var1, final int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.method558();
			anIntArray1321 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1321[var4] = var1.method560();
		} else if (var2 == 2)
			aString1319 = var1.method597();
		else if (var2 == 12)
			anInt1320 = var1.method558();
		else if (var2 == 13)
			anInt1323 = var1.method560();
		else if (var2 == 14)
			anInt1326 = var1.method560();
		else if (var2 == 15)
			anInt1324 = var1.method560();
		else if (var2 == 16)
			anInt1325 = var1.method560();
		else if (var2 == 17) {
			anInt1326 = var1.method560();
			anInt1327 = var1.method560();
			anInt1334 = var1.method560();
			anInt1329 = var1.method560();
		} else if ((var2 >= 30) && (var2 < 35)) {
			aStringArray1344[var2 - 30] = var1.method597();
			if (aStringArray1344[var2 - 30].equalsIgnoreCase("Hidden"))
				aStringArray1344[var2 - 30] = null;
		} else if (var2 == 40) {
			var3 = var1.method558();
			aShortArray1330 = new short[var3];
			aShortArray1331 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				aShortArray1330[var4] = (short) var1.method560();
				aShortArray1331[var4] = (short) var1.method560();
			}
		} else if (var2 == 41) {
			var3 = var1.method558();
			aShortArray1345 = new short[var3];
			aShortArray1333 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				aShortArray1345[var4] = (short) var1.method560();
				aShortArray1333[var4] = (short) var1.method560();
			}
		} else if (var2 == 60) {
			var3 = var1.method558();
			anIntArray1341 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1341[var4] = var1.method560();
		} else if (var2 == 93)
			aBool1332 = false;
		else if (var2 == 95)
			anInt1350 = var1.method560();
		else if (var2 == 97)
			anInt1336 = var1.method560();
		else if (var2 == 98)
			anInt1337 = var1.method560();
		else if (var2 == 99)
			aBool1338 = true;
		else if (var2 == 100)
			anInt1315 = var1.method559();
		else if (var2 == 101)
			anInt1340 = var1.method559() * 5;
		else if (var2 != 102) {
			if (var2 == 103)
				anInt1343 = var1.method560();
			else if (var2 == 106) {
				anInt1339 = var1.method560();
				if (anInt1339 == '\uffff')
					anInt1339 = -1;

				anInt1351 = var1.method560();
				if (anInt1351 == '\uffff')
					anInt1351 = -1;

				var3 = var1.method558();
				anIntArray1342 = new int[var3 + 1];

				for (var4 = 0; var4 <= var3; ++var4) {
					anIntArray1342[var4] = var1.method560();
					if (anIntArray1342[var4] == '\uffff')
						anIntArray1342[var4] = -1;
				}
			} else if (var2 == 107)
				aBool1346 = false;
			else if (var2 == 109)
				aBool1347 = false;
			else if (var2 == 111)
				aBool1348 = true;
			else if (var2 == 112)
				anInt1349 = var1.method558();
		} else
			anInt1322 = var1.method560();

	}

	public final Class124_Sub22_Sub19_Sub4 method641() {
		if (anIntArray1342 != null) {
			final Def9 var3 = method644();
			return var3 == null ? null : var3.method641();
		} else if (null == anIntArray1341)
			return null;
		else {
			boolean var6 = false;

			for (int var5 = 0; var5 < anIntArray1341.length; ++var5)
				if (!Class80.aClass94_646.valid(anIntArray1341[var5], 0))
					var6 = true;

			if (var6)
				return null;
			else {
				final Class124_Sub22_Sub19_Sub4[] var1 = new Class124_Sub22_Sub19_Sub4[anIntArray1341.length];

				for (int var7 = 0; var7 < anIntArray1341.length; ++var7)
					var1[var7] = Class124_Sub22_Sub19_Sub4.method943(Class80.aClass94_646, anIntArray1341[var7], 0);

				Class124_Sub22_Sub19_Sub4 var2;
				if (var1.length == 1)
					var2 = var1[0];
				else
					var2 = new Class124_Sub22_Sub19_Sub4(var1, var1.length);

				int var4;
				if (null != aShortArray1330)
					for (var4 = 0; var4 < aShortArray1330.length; ++var4)
						var2.method951(aShortArray1330[var4], aShortArray1331[var4]);

				if (null != aShortArray1345)
					for (var4 = 0; var4 < aShortArray1345.length; ++var4)
						var2.method939(aShortArray1345[var4], aShortArray1333[var4]);

				return var2;
			}
		}
	}

	void method642(final RSBuf var1) {
		while (true) {
			final int var2 = var1.method558();
			if (var2 == 0)
				return;

			method640(var1, var2);
		}
	}

	public boolean method643() {
		if (anIntArray1342 != null) {
			int var1 = -1;
			if (anInt1339 != -1)
				var1 = Class74.method315(anInt1339, (byte) 0);
			else if (anInt1351 != -1)
				var1 = Class91.anIntArray711[anInt1351];

			return (var1 >= 0) && (var1 < anIntArray1342.length) && (anIntArray1342[var1] != -1);
		} else
			return true;
	}

	public final Def9 method644() {
		int var1 = -1;
		if (anInt1339 != -1)
			var1 = Class74.method315(anInt1339, (byte) 0);
		else if (anInt1351 != -1)
			var1 = Class91.anIntArray711[anInt1351];

		return (var1 >= 0) && (var1 < anIntArray1342.length) && (anIntArray1342[var1] != -1)
				? Class34.method188(anIntArray1342[var1], 1576074197) : null;
	}

	public final Class124_Sub22_Sub19_Sub7 method645(final Def12 var1, final int var2,
			final Def12 var3, final int var4) {
		if (anIntArray1342 != null) {
			final Def9 var12 = method644();
			return var12 == null ? null : var12.method645(var1, var2, var3, var4);
		} else {
			Class124_Sub22_Sub19_Sub7 var6 = (Class124_Sub22_Sub19_Sub7) aClass113_1317.method434(anInt1318);
			if (var6 == null) {
				boolean var9 = false;

				for (int var7 = 0; var7 < anIntArray1321.length; ++var7)
					if (!Class80.aClass94_646.valid(anIntArray1321[var7], 0))
						var9 = true;

				if (var9)
					return null;

				final Class124_Sub22_Sub19_Sub4[] var5 = new Class124_Sub22_Sub19_Sub4[anIntArray1321.length];

				int var11;
				for (var11 = 0; var11 < anIntArray1321.length; ++var11)
					var5[var11] = Class124_Sub22_Sub19_Sub4.method943(Class80.aClass94_646, anIntArray1321[var11], 0);

				Class124_Sub22_Sub19_Sub4 var8;
				if (var5.length == 1)
					var8 = var5[0];
				else
					var8 = new Class124_Sub22_Sub19_Sub4(var5, var5.length);

				if (null != aShortArray1330)
					for (var11 = 0; var11 < aShortArray1330.length; ++var11)
						var8.method951(aShortArray1330[var11], aShortArray1331[var11]);

				if (null != aShortArray1345)
					for (var11 = 0; var11 < aShortArray1345.length; ++var11)
						var8.method939(aShortArray1345[var11], aShortArray1333[var11]);

				var6 = var8.method945(anInt1315 + 64, anInt1340 + 850, -30, -50, -30);
				aClass113_1317.method435(var6, anInt1318);
			}

			Class124_Sub22_Sub19_Sub7 var10;
			if ((var1 != null) && (var3 != null))
				var10 = var1.method742(var6, var2, var3, var4);
			else if (null != var1)
				var10 = var1.method741(var6, var2);
			else if (null != var3)
				var10 = var3.method741(var6, var4);
			else
				var10 = var6.method987(true);

			if ((anInt1336 != 128) || (anInt1337 != 128))
				var10.method1002(anInt1336, anInt1337, anInt1336);

			return var10;
		}
	}

	static final void method646(final int var0, final int var1, final int var2, final int var3,
			final Class124_Sub22_Sub16_Sub1 var4, final Class124_Sub22_Sub20 var5) {
		if (null != var4) {
			final int var9 = (client.anInt2053 + client.anInt2255) & 2047;
			final int var10 = (var2 * var2) + (var3 * var3);
			if (var10 <= 6400) {
				int var7 = Class124_Sub22_Sub16_Sub3.anIntArray1847[var9];
				int var6 = Class124_Sub22_Sub16_Sub3.anIntArray1848[var9];
				var7 = (var7 * 256) / (256 + client.anInt2055);
				var6 = (256 * var6) / (256 + client.anInt2055);
				final int var11 = ((var3 * var7) + (var2 * var6)) >> 16;
				final int var8 = ((var3 * var6) - (var7 * var2)) >> 16;
				if (var10 <= 2500)
					var4.method907(((var5.anInt1646 / 2) + var0 + var11) - (var4.anInt1733 / 2),
							(var1 + (var5.anInt1643 / 2)) - var8 - (var4.anInt1734 / 2));
				else
					var4.method918(((var5.anInt1646 / 2) + var11) - (var4.anInt1733 / 2),
							(var5.anInt1643 / 2) - var8 - (var4.anInt1734 / 2), var0, var1, var5.anInt1646,
							var5.anInt1643, var5.anIntArray1645, var5.anIntArray1644);

			}
		}
	}
}
