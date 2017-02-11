public final class Class124_Sub22_Sub19_Sub3_Sub2 extends Class124_Sub22_Sub19_Sub3 {
	int anInt1947;
	int anInt1948;
	int anInt1950;
	int anInt1952;
	int anInt1955;
	int anInt1957;
	int anInt1961;
	int anInt1962;
	int anInt1944 = -1;
	int anInt1945 = -1;
	int anInt1959 = 0;
	String aString1956;
	int anInt1946 = 0;
	int anInt1951 = 0;
	boolean aBool1960 = false;
	Somet3 spomet3;
	Class124_Sub22_Sub19_Sub7 aClass124_Sub22_Sub19_Sub7_1953;
	int anInt1942 = 0;
	int anInt1949 = 0;
	boolean aBool1958 = false;

	final void method1044(final RSBuf var1) {
		var1.pos = 0;
		final int var9 = var1.readByteU();
		anInt1944 = var1.readByte();
		anInt1945 = var1.readByte();
		int var2 = -1;
		anInt1959 = 0;
		final int[] var3 = new int[12];

		int var5;
		int var6;
		for (int var4 = 0; var4 < 12; ++var4) {
			var5 = var1.readByteU();
			if (var5 == 0)
				var3[var4] = 0;
			else {
				var6 = var1.readByteU();
				var3[var4] = (var5 << 8) + var6;
				if ((var4 == 0) && (var3[0] == '\uffff')) {
					var2 = var1.readShortU();
					break;
				}

				if (var3[var4] >= 512) {
					final int var7 = Def10.method724(var3[var4] - 512).anInt1501;
					if (var7 != 0)
						anInt1959 = var7;
				}
			}
		}

		final int[] var8 = new int[5];

		for (var5 = 0; var5 < 5; ++var5) {
			var6 = var1.readByteU();
			if ((var6 < 0) || (var6 >= client.aShortArrayArray783[var5].length))
				var6 = 0;

			var8[var5] = var6;
		}

		anInt1719 = var1.readShortU();
		if (anInt1719 == '\uffff')
			anInt1719 = -1;

		anInt1676 = var1.readShortU();
		if (anInt1676 == '\uffff')
			anInt1676 = -1;

		anInt1677 = anInt1676;
		anInt1712 = var1.readShortU();
		if (anInt1712 == '\uffff')
			anInt1712 = -1;

		anInt1679 = var1.readShortU();
		if (anInt1679 == '\uffff')
			anInt1679 = -1;

		anInt1680 = var1.readShortU();
		if (anInt1680 == '\uffff')
			anInt1680 = -1;

		anInt1681 = var1.readShortU();
		if (anInt1681 == '\uffff')
			anInt1681 = -1;

		anInt1682 = var1.readShortU();
		if (anInt1682 == '\uffff')
			anInt1682 = -1;

		aString1956 = var1.readStr2();
		if (this == Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246)
			RuntimeException_Sub1.aString1911 = aString1956;

		anInt1946 = var1.readByteU();
		anInt1951 = var1.readShortU();
		aBool1960 = var1.readByteU() == 1;
		if ((client.anInt2080 == 0) && (client.prights >= 2))
			aBool1960 = false;

		if (spomet3 == null)
			spomet3 = new Somet3();

		spomet3.method394(var3, var8, var9 == 1, var2);
	}

	@Override
	protected final Class124_Sub22_Sub19_Sub7 method834(final int var1) {
		if (spomet3 == null)
			return null;
		else {
			final Def12 var3 = (anInt1699 != -1) && (anInt1673 == 0)
					? Def15.method750(anInt1699) : null;
			final Def12 var5 = (anInt1675 != -1) && !aBool1958
					&& ((anInt1719 != anInt1675) || (var3 == null)) ? Def15.method750(anInt1675) : null;
			Class124_Sub22_Sub19_Sub7 var2 = spomet3.method399(var3, anInt1700, var5, anInt1695);
			if (null == var2)
				return null;
			else {
				var2.method989();
				anInt1717 = var2.anInt1605;
				Class124_Sub22_Sub19_Sub7 var4;
				Class124_Sub22_Sub19_Sub7[] var6;
				if (!aBool1958 && (anInt1710 != -1) && (anInt1705 != -1)) {
					var4 = Class43.method217(anInt1710).method733(anInt1705);
					if (var4 != null) {
						var4.method997(0, -anInt1678, 0);
						var6 = new Class124_Sub22_Sub19_Sub7[] { var2, var4 };
						var2 = new Class124_Sub22_Sub19_Sub7(var6, 2);
					}
				}

				if (!aBool1958 && (null != aClass124_Sub22_Sub19_Sub7_1953)) {
					if (client.anInt2158 >= anInt1949)
						aClass124_Sub22_Sub19_Sub7_1953 = null;

					if ((client.anInt2158 >= anInt1942) && (client.anInt2158 < anInt1949)) {
						var4 = aClass124_Sub22_Sub19_Sub7_1953;
						var4.method997(anInt1961 - anInt1690, anInt1950 - anInt1948, anInt1952 - anInt1697);
						if (anInt1718 == 512) {
							var4.method994();
							var4.method994();
							var4.method994();
						} else if (anInt1718 == 1024) {
							var4.method994();
							var4.method994();
						} else if (anInt1718 == 1536)
							var4.method994();

						var6 = new Class124_Sub22_Sub19_Sub7[] { var2, var4 };
						var2 = new Class124_Sub22_Sub19_Sub7(var6, 2);
						if (anInt1718 == 512)
							var4.method994();
						else if (anInt1718 == 1024) {
							var4.method994();
							var4.method994();
						} else if (anInt1718 == 1536) {
							var4.method994();
							var4.method994();
							var4.method994();
						}

						var4.method997(anInt1690 - anInt1961, anInt1948 - anInt1950, anInt1697 - anInt1952);
					}
				}

				var2.aBool1861 = true;
				return var2;
			}
		}
	}

	@Override
	final boolean method895(final int var1) {
		return spomet3 != null;
	}
}
