public final class Class107 {
	Node aClass124_810;
	Node aClass124_811;
	int anInt812 = 0;
	int anInt809;
	Node[] aClass124Array808;

	public Node method409(final long var1) {
		final Node var3 = aClass124Array808[(int) (var1 & anInt809 - 1)];

		for (aClass124_810 = var3.aClass124_875; aClass124_810 != var3; aClass124_810 = aClass124_810.aClass124_875)
			if (aClass124_810.linkedhash == var1) {
				final Node var4 = aClass124_810;
				aClass124_810 = aClass124_810.aClass124_875;
				return var4;
			}

		aClass124_810 = null;
		return null;
	}

	void method410() {
		for (int var1 = 0; var1 < anInt809; ++var1) {
			final Node var2 = aClass124Array808[var1];

			while (true) {
				final Node var3 = var2.aClass124_875;
				if (var3 == var2)
					break;

				var3.method450();
			}
		}

		aClass124_810 = null;
		aClass124_811 = null;
	}

	public Node method411() {
		anInt812 = 0;
		return method413();
	}

	public void method412(final Node var1, final long var2) {
		if (var1.aClass124_876 != null)
			var1.method450();

		final Node var4 = aClass124Array808[(int) (var2 & anInt809 - 1)];
		var1.aClass124_876 = var4.aClass124_876;
		var1.aClass124_875 = var4;
		var1.aClass124_876.aClass124_875 = var1;
		var1.aClass124_875.aClass124_876 = var1;
		var1.linkedhash = var2;
	}

	public Class107(final int var1) {
		anInt809 = var1;
		aClass124Array808 = new Node[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			final Node var3 = aClass124Array808[var2] = new Node();
			var3.aClass124_875 = var3;
			var3.aClass124_876 = var3;
		}

	}

	public Node method413() {
		Node var1;
		if ((anInt812 > 0) && (aClass124_811 != aClass124Array808[anInt812 - 1])) {
			var1 = aClass124_811;
			aClass124_811 = var1.aClass124_875;
			return var1;
		} else {
			do {
				if (anInt812 >= anInt809)
					return null;

				var1 = aClass124Array808[anInt812++].aClass124_875;
			} while (var1 == aClass124Array808[anInt812 - 1]);

			aClass124_811 = var1.aClass124_875;
			return var1;
		}
	}
}
