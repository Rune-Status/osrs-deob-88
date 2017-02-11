public class Class109 {
	int[] anIntArray814;

	public int off(final int var1) {
		final int var2 = (anIntArray814.length >> 1) - 1;
		int var4 = var1 & var2;

		while (true) {
			final int var3 = anIntArray814[var4 + var4 + 1];
			if (var3 == -1)
				return -1;

			if (anIntArray814[var4 + var4] == var1)
				return var3;

			var4 = (var4 + 1) & var2;
		}
	}

	public Class109(final int[] var1) {
		int var3;
		for (var3 = 1; var3 <= (var1.length + (var1.length >> 1)); var3 <<= 1)
			;

		anIntArray814 = new int[var3 + var3];

		int var4;
		for (var4 = 0; var4 < (var3 + var3); ++var4)
			anIntArray814[var4] = -1;

		int var2;
		for (var4 = 0; var4 < var1.length; anIntArray814[var2 + var2 + 1] = var4++) {
			for (var2 = var1[var4] & (var3 - 1); anIntArray814[var2 + var2 + 1] != -1; var2 = (var2 + 1) & (var3 - 1))
				;

			anIntArray814[var2 + var2] = var1[var4];
		}

	}
}
