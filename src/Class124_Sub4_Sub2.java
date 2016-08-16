public class Class124_Sub4_Sub2 extends Class124_Sub4 {
	int anInt1594 = -1;
	int anInt1593 = 0;
	Class111 aClass111_1591 = new Class111();
	Class111 aClass111_1592 = new Class111();

	public final synchronized void method822(final Class124_Sub4 var1) {
		var1.method450();
	}

	void method823() {
		if (anInt1593 > 0) {
			for (Class124_Sub1 var1 = (Class124_Sub1) aClass111_1592
					.method428(); var1 != null; var1 = (Class124_Sub1) aClass111_1592.method430())
				var1.anInt921 -= anInt1593;

			anInt1594 -= anInt1593;
			anInt1593 = 0;
		}

	}

	void method824(Node var1, final Class124_Sub1 var2) {
		while ((var1 != aClass111_1592.aClass124_817) && (((Class124_Sub1) var1).anInt921 <= var2.anInt921))
			var1 = var1.aClass124_875;

		Class111.method423(var2, var1);
		anInt1594 = ((Class124_Sub1) aClass111_1592.aClass124_817.aClass124_875).anInt921;
	}

	void method825(final Class124_Sub1 var1) {
		var1.method450();
		var1.method490();
		final Node var2 = aClass111_1592.aClass124_817.aClass124_875;
		if (var2 == aClass111_1592.aClass124_817)
			anInt1594 = -1;
		else
			anInt1594 = ((Class124_Sub1) var2).anInt921;

	}

	@Override
	protected Class124_Sub4 method505() {
		return (Class124_Sub4) aClass111_1591.method428();
	}

	@Override
	protected Class124_Sub4 method509() {
		return (Class124_Sub4) aClass111_1591.method430();
	}

	@Override
	protected int method507() {
		return 0;
	}

	@Override
	public final synchronized void method511(final int[] var1, int var2, int var3) {
		do {
			if (anInt1594 < 0) {
				method827(var1, var2, var3);
				return;
			}

			if ((anInt1593 + var3) < anInt1594) {
				anInt1593 += var3;
				method827(var1, var2, var3);
				return;
			}

			final int var4 = anInt1594 - anInt1593;
			method827(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			anInt1593 += var4;
			method823();
			final Class124_Sub1 var5 = (Class124_Sub1) aClass111_1592.method428();
			synchronized (var5) {
				final int var7 = var5.method489(this);
				if (var7 < 0) {
					var5.anInt921 = 0;
					method825(var5);
				} else {
					var5.anInt921 = var7;
					method824(var5.aClass124_875, var5);
				}
			}
		} while (var3 != 0);

	}

	@Override
	public final synchronized void method506(int var1) {
		do {
			if (anInt1594 < 0) {
				method826(var1);
				return;
			}

			if ((anInt1593 + var1) < anInt1594) {
				anInt1593 += var1;
				method826(var1);
				return;
			}

			final int var2 = anInt1594 - anInt1593;
			method826(var2);
			var1 -= var2;
			anInt1593 += var2;
			method823();
			final Class124_Sub1 var3 = (Class124_Sub1) aClass111_1592.method428();
			synchronized (var3) {
				final int var5 = var3.method489(this);
				if (var5 < 0) {
					var3.anInt921 = 0;
					method825(var3);
				} else {
					var3.anInt921 = var5;
					method824(var3.aClass124_875, var3);
				}
			}
		} while (var1 != 0);

	}

	void method826(final int var1) {
		for (Class124_Sub4 var2 = (Class124_Sub4) aClass111_1591
				.method428(); var2 != null; var2 = (Class124_Sub4) aClass111_1591.method430())
			var2.method506(var1);

	}

	void method827(final int[] var1, final int var2, final int var3) {
		for (Class124_Sub4 var4 = (Class124_Sub4) aClass111_1591
				.method428(); var4 != null; var4 = (Class124_Sub4) aClass111_1591.method430())
			var4.method508(var1, var2, var3);

	}

	public final synchronized void method828(final Class124_Sub4 var1) {
		aClass111_1591.method425(var1);
	}
}
