public class Class111 {
	Node aClass124_816;
	public Node aClass124_817 = new Node();

	public static void method423(final Node var0, final Node var1) {
		if (var0.aClass124_876 != null)
			var0.method450();

		var0.aClass124_876 = var1.aClass124_876;
		var0.aClass124_875 = var1;
		var0.aClass124_876.aClass124_875 = var0;
		var0.aClass124_875.aClass124_876 = var0;
	}

	public void method424(final Node var1) {
		if (var1.aClass124_876 != null)
			var1.method450();

		var1.aClass124_876 = aClass124_817.aClass124_876;
		var1.aClass124_875 = aClass124_817;
		var1.aClass124_876.aClass124_875 = var1;
		var1.aClass124_875.aClass124_876 = var1;
	}

	public void method425(final Node var1) {
		if (var1.aClass124_876 != null)
			var1.method450();

		var1.aClass124_876 = aClass124_817;
		var1.aClass124_875 = aClass124_817.aClass124_875;
		var1.aClass124_876.aClass124_875 = var1;
		var1.aClass124_875.aClass124_876 = var1;
	}

	public Node method426() {
		final Node var1 = aClass124_816;
		if (var1 == aClass124_817) {
			aClass124_816 = null;
			return null;
		} else {
			aClass124_816 = var1.aClass124_876;
			return var1;
		}
	}

	public Node method427() {
		final Node var1 = aClass124_817.aClass124_875;
		if (var1 == aClass124_817)
			return null;
		else {
			var1.method450();
			return var1;
		}
	}

	public Node method428() {
		final Node var1 = aClass124_817.aClass124_875;
		if (var1 != aClass124_817) {
			aClass124_816 = var1.aClass124_875;
			return var1;
		} else {
			aClass124_816 = null;
			return null;
		}
	}

	public Node method429() {
		final Node var1 = aClass124_817.aClass124_876;
		if (var1 == aClass124_817) {
			aClass124_816 = null;
			return null;
		} else {
			aClass124_816 = var1.aClass124_876;
			return var1;
		}
	}

	public Node method430() {
		final Node var1 = aClass124_816;
		if (var1 == aClass124_817) {
			aClass124_816 = null;
			return null;
		} else {
			aClass124_816 = var1.aClass124_875;
			return var1;
		}
	}

	public Class111() {
		aClass124_817.aClass124_875 = aClass124_817;
		aClass124_817.aClass124_876 = aClass124_817;
	}

	public void method431() {
		while (true) {
			final Node var1 = aClass124_817.aClass124_875;
			if (var1 == aClass124_817) {
				aClass124_816 = null;
				return;
			}

			var1.method450();
		}
	}

	public Node method432() {
		final Node var1 = aClass124_817.aClass124_876;
		if (var1 == aClass124_817)
			return null;
		else {
			var1.method450();
			return var1;
		}
	}
}
