package lockedme;

public interface DisplayOperations {

	public abstract void createFileIfNotExist();

	public abstract void showMenu();

	public abstract void displayWelcomeScreen();

	public abstract String chooseOption();

	public static String displayBusinessLevelOperation() {
		return null;
	}

	public static void showFilesInAscendingOrder() {
	}

}
