package level2;

public final class PathInput {
    private PathInput() {
    }

    public static String clean(String path) {
        String cleanedPath = path.trim();
        if (cleanedPath.length() >= 2 && cleanedPath.startsWith("\"")
                && cleanedPath.endsWith("\"")) {
            return cleanedPath.substring(1, cleanedPath.length() - 1);
        }
        return cleanedPath;
    }
}