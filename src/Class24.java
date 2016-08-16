public class Class24 {
	static int[] anIntArray267 = new int[500];
	static int[] anIntArray268 = new int[500];
	static int[] anIntArray274 = new int[500];
	static int[] anIntArray270 = new int[500];
	Class124_Sub12 aClass124_Sub12_271 = null;
	int anInt275 = -1;
	boolean aBool277 = false;
	int[] anIntArray273;
	int[] anIntArray269;
	int[] anIntArray272;
	int[] anIntArray276;

	Class24(final byte[] var1, final Class124_Sub12 var2) {
		aClass124_Sub12_271 = var2;
		final RSBuf var6 = new RSBuf(var1);
		final RSBuf var10 = new RSBuf(var1);
		var6.pos = 2;
		final int var7 = var6.readByteU();
		int var8 = -1;
		int var4 = 0;
		var10.pos = var6.pos + var7;

		int var5;
		for (var5 = 0; var5 < var7; ++var5) {
			final int var9 = var6.readByteU();
			if (var9 > 0) {
				if (aClass124_Sub12_271.anIntArray1054[var5] != 0)
					for (int var3 = var5 - 1; var3 > var8; --var3)
						if (aClass124_Sub12_271.anIntArray1054[var3] == 0) {
							anIntArray267[var4] = var3;
							anIntArray268[var4] = 0;
							anIntArray274[var4] = 0;
							anIntArray270[var4] = 0;
							++var4;
							break;
						}

				anIntArray267[var4] = var5;
				short var11 = 0;
				if (aClass124_Sub12_271.anIntArray1054[var5] == 3)
					var11 = 128;

				if ((var9 & 1) != 0)
					anIntArray268[var4] = var10.method601();
				else
					anIntArray268[var4] = var11;

				if ((var9 & 2) != 0)
					anIntArray274[var4] = var10.method601();
				else
					anIntArray274[var4] = var11;

				if ((var9 & 4) != 0)
					anIntArray270[var4] = var10.method601();
				else
					anIntArray270[var4] = var11;

				var8 = var5;
				++var4;
				if (aClass124_Sub12_271.anIntArray1054[var5] == 5)
					aBool277 = true;
			}
		}

		if (var10.pos != var1.length)
			throw new RuntimeException();
		else {
			anInt275 = var4;
			anIntArray273 = new int[var4];
			anIntArray269 = new int[var4];
			anIntArray272 = new int[var4];
			anIntArray276 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				anIntArray273[var5] = anIntArray267[var5];
				anIntArray269[var5] = anIntArray268[var5];
				anIntArray272[var5] = anIntArray274[var5];
				anIntArray276[var5] = anIntArray270[var5];
			}

		}
	}
}
