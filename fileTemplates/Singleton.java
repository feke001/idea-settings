#parse("GrasFileHeader.java")
package ${PACKAGE_NAME};

#parse("File Header.java")
public class ${Name}{
    private static ${Name} ourInstance = new ${Name}();

    public static ${Name} getInstance() {
        return ourInstance;
    }

    private ${Name}() {
    }
}
