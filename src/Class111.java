public class Class111 {
	Class124 aClass124_816;
	public Class124 aClass124_817 = new Class124();

	public static void method423(final Class124 var0, final Class124 var1) {
		if (var0.aClass124_876 != null)
			var0.method450();

		var0.aClass124_876 = var1.aClass124_876;
		var0.aClass124_875 = var1;
		var0.aClass124_876.aClass124_875 = var0;
		var0.aClass124_875.aClass124_876 = var0;
	}

	public void method424(final Class124 var1) {
		if (var1.aClass124_876 != null)
			var1.method450();

		var1.aClass124_876 = aClass124_817.aClass124_876;
		var1.aClass124_875 = aClass124_817;
		var1.aClass124_876.aClass124_875 = var1;
		var1.aClass124_875.aClass124_876 = var1;
	}

	public void method425(final Class124 var1) {
		if (var1.aClass124_876 != null)
			var1.method450();

		var1.aClass124_876 = aClass124_817;
		var1.aClass124_875 = aClass124_817.aClass124_875;
		var1.aClass124_876.aClass124_875 = var1;
		var1.aClass124_875.aClass124_876 = var1;
	}

	public Class124 method426() {
		final Class124 var1 = aClass124_816;
		if (var1 == aClass124_817) {
			aClass124_816 = null;
			return null;
		} else {
			aClass124_816 = var1.aClass124_876;
			return var1;
		}
	}

	public Class124 method427() {
		final Class124 var1 = aClass124_817.aClass124_875;
		if (var1 == aClass124_817)
			return null;
		else {
			var1.method450();
			return var1;
		}
	}

	public Class124 method428() {
		final Class124 var1 = aClass124_817.aClass124_875;
		if (var1 != aClass124_817) {
			aClass124_816 = var1.aClass124_875;
			return var1;
		} else {
			aClass124_816 = null;
			return null;
		}
	}

	public Class124 method429() {
		final Class124 var1 = aClass124_817.aClass124_876;
		if (var1 == aClass124_817) {
			aClass124_816 = null;
			return null;
		} else {
			aClass124_816 = var1.aClass124_876;
			return var1;
		}
	}

	public Class124 method430() {
		final Class124 var1 = aClass124_816;
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
			final Class124 var1 = aClass124_817.aClass124_875;
			if (var1 == aClass124_817) {
				aClass124_816 = null;
				return;
			}

			var1.method450();
		}
	}

	public Class124 method432() {
		final Class124 var1 = aClass124_817.aClass124_876;
		if (var1 == aClass124_817)
			return null;
		else {
			var1.method450();
			return var1;
		}
	}
}
