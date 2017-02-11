public final class Outbuf extends RSBuf {
	ISAAC isac;
	int anInt1608;
	static int[] sizes = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383,
			32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863,
			134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	public void isa(final int[] var1) {
		isac = new ISAAC(var1);
	}

	public void writeOpcode(final int var1) {
		backing[++pos - 1] = (byte) (var1 + isac.key());
	}

	public Outbuf(final int var1) {
		super(var1);
	}

	public int readOpcode() {
		int c = (backing[++pos - 1] - isac.key()) & 255;
		System.out.printf("in %d%n", c);
		return c;
	}

	public int clever(int var1) {
		int var2 = anInt1608 >> 3;
		int var4 = 8 - (anInt1608 & 7);
		int var3 = 0;

		for (anInt1608 += var1; var1 > var4; var4 = 8) {
			var3 += (backing[var2++] & sizes[var4]) << (var1 - var4);
			var1 -= var4;
		}

		if (var4 == var1)
			var3 += backing[var2] & sizes[var4];
		else
			var3 += (backing[var2] >> (var4 - var1)) & sizes[var1];

		return var3;
	}

	public void bitinit() {
		pos = (anInt1608 + 7) / 8;
	}

	public void tempbit() {
		anInt1608 = pos * 8;
	}

	public int bitpos(final int var1) {
		return (var1 * 8) - anInt1608;
	}
}
