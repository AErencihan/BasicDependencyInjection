package Log;

public class FileLogger implements Logging {

    @Override
    public void log(String data) {
        System.out.println("dosyaya loglandı");
    }
}
