import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class45 {
	static Class124_Sub22_Sub16_Sub1[] aClass124_Sub22_Sub16_Sub1Array439;
	static int anInt445;
	public static boolean aBool447;
	static Class124_Sub22_Sub16_Sub1[] aClass124_Sub22_Sub16_Sub1Array448;
	static Class94_Sub1 aClass94_Sub1_450;
	DataInputStream aDataInputStream441;
	int anInt449;
	int anInt443;
	byte[] aByteArray444;
	int anInt451;
	byte[] aByteArray442 = new byte[4];
	Class79 aClass79_440;
	long aLong446;

	static final void method223(final RSBuf var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6) {
		int var7;
		if ((var2 >= 0) && (var2 < 104) && (var3 >= 0) && (var3 < 104)) {
			Class27.aByteArrayArrayArray285[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.readByteU();
				if (var7 == 0) {
					if (var1 == 0)
						Class27.anIntArrayArrayArray284[0][var2][var3] = -Class30.method172(var4 + 932731 + var2,
								556238 + var3 + var5) * 8;
					else
						Class27.anIntArrayArrayArray284[var1][var2][var3] = Class27.anIntArrayArrayArray284[var1
								- 1][var2][var3] - 240;
					break;
				}

				if (var7 == 1) {
					int var8 = var0.readByteU();
					if (var8 == 1)
						var8 = 0;

					if (var1 == 0)
						Class27.anIntArrayArrayArray284[0][var2][var3] = 8 * -var8;
					else
						Class27.anIntArrayArrayArray284[var1][var2][var3] = Class27.anIntArrayArrayArray284[var1
								- 1][var2][var3] - (var8 * 8);
					break;
				}

				if (var7 <= 49) {
					Class57.aByteArrayArrayArray537[var1][var2][var3] = var0.readByte();
					Class27.aByteArrayArrayArray288[var1][var2][var3] = (byte) ((var7 - 2) / 4);
					Class3.aByteArrayArrayArray17[var1][var2][var3] = (byte) (((var7 - 2) + var6) & 3);
				} else if (var7 <= 81)
					Class27.aByteArrayArrayArray285[var1][var2][var3] = (byte) (var7 - 49);
				else
					Class27.aByteArrayArrayArray293[var1][var2][var3] = (byte) (var7 - 81);
			}
		} else
			while (true) {
				var7 = var0.readByteU();
				if (var7 == 0)
					break;

				if (var7 == 1) {
					var0.readByteU();
					break;
				}

				if (var7 <= 49)
					var0.readByteU();
			}

	}

	byte[] method224(final byte var1) throws IOException {
		if (Class74.method316(1198263883) > aLong446)
			throw new IOException();
		else {
			if (anInt449 == 0) {
				if (aClass79_440.anInt642 == 2)
					throw new IOException();

				if (aClass79_440.anInt642 == 1) {
					aDataInputStream441 = (DataInputStream) aClass79_440.anObject638;
					anInt449 = 1;
				}
			}

			int var3;
			if (anInt449 == 1) {
				var3 = aDataInputStream441.available();
				if (var3 > 0) {
					if ((var3 + anInt443) > 4)
						var3 = 4 - anInt443;

					anInt443 += aDataInputStream441.read(aByteArray442, anInt443, var3);
					if (anInt443 == 4) {
						final int var2 = (new RSBuf(aByteArray442)).readInt2(-502146649);
						aByteArray444 = new byte[var2];
						anInt449 = 2;
					}
				}
			}

			if (anInt449 == 2) {
				var3 = aDataInputStream441.available();
				if (var3 > 0) {
					if ((var3 + anInt451) > aByteArray444.length)
						var3 = aByteArray444.length - anInt451;

					anInt451 += aDataInputStream441.read(aByteArray444, anInt451, var3);
					if (anInt451 == aByteArray444.length)
						return aByteArray444;
				}
			}

			return null;
		}
	}

	Class45(final Class82 var1, final URL var2) {
		aClass79_440 = var1.method335(var2);
		anInt449 = 0;
		aLong446 = Class74.method316(-580816830) + 30000L;
	}

	static final void method225(final String var0) {
		if (var0 != null)
			if (((client.anInt2056 < 200) || (client.anInt2107 == 1)) && (client.anInt2056 < 400)) {
				final String var4 = Class34.method186(var0, Class49.aClass117_488);
				if (null != var4) {
					int var2;
					String var3;
					String var5;
					for (var2 = 0; var2 < client.anInt2056; ++var2) {
						final Class32 var1 = client.aClass32Array2098[var2];
						var5 = Class34.method186(var1.aString344, Class49.aClass117_488);
						if ((var5 != null) && var5.equals(var4)) {
							Class20.method95(30, "", var0 + " is already on your friend list");
							return;
						}

						if (var1.aString338 != null) {
							var3 = Class34.method186(var1.aString338, Class49.aClass117_488);
							if ((null != var3) && var3.equals(var4)) {
								Class20.method95(30, "", var0 + " is already on your friend list");
								return;
							}
						}
					}

					for (var2 = 0; var2 < client.anInt2252; ++var2) {
						final Class35 var6 = client.aClass35Array1986[var2];
						var5 = Class34.method186(var6.aString372, Class49.aClass117_488);
						if ((var5 != null) && var5.equals(var4)) {
							Class20.method95(30, "", "Please remove " + var0 + " from your ignore list first");
							return;
						}

						if (null != var6.aString373) {
							var3 = Class34.method186(var6.aString373, Class49.aClass117_488);
							if ((var3 != null) && var3.equals(var4)) {
								Class20.method95(30, "", "Please remove " + var0 + " from your ignore list first");
								return;
							}
						}
					}

					if (Class34
							.method186(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aString1956, Class49.aClass117_488)
							.equals(var4))
						Class20.method95(30, "", "You can\'t add yourself to your own friend list");
					else {
						client.aClass124_Sub14_Sub1_2024.method837(70);
						client.aClass124_Sub14_Sub1_2024.writeByte(Class54.method258(var0));
						client.aClass124_Sub14_Sub1_2024.writestr(var0);
					}
				}
			} else
				Class20.method95(30, "", "Your friend list is full. Max of 200 for free users, and 400 for members");
	}

	static void method226(final Class124_Sub22_Sub19_Sub3_Sub2 var0, final int var1, final int var2) {
		if ((var0.anInt1699 == var1) && (var1 != -1)) {
			final int var3 = Def15.method750(var1).anInt1546;
			if (var3 == 1) {
				var0.anInt1700 = 0;
				var0.anInt1687 = 0;
				var0.anInt1673 = var2;
				var0.anInt1703 = 0;
			}

			if (var3 == 2)
				var0.anInt1703 = 0;
		} else if ((var1 == -1) || (var0.anInt1699 == -1) || (Def15
				.method750(var1).anInt1531 >= Def15.method750(var0.anInt1699).anInt1531)) {
			var0.anInt1699 = var1;
			var0.anInt1700 = 0;
			var0.anInt1687 = 0;
			var0.anInt1673 = var2;
			var0.anInt1703 = 0;
			var0.anInt1726 = var0.anInt1721;
		}

	}

	static Class34[] method227(final short var0) {
		return new Class34[] { Class34.aClass34_369, Class34.aClass34_370, Class34.aClass34_368 };
	}
}
