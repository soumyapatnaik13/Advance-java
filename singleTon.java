class PrinterSpooler {
    
    private static PrinterSpooler instance;
    private PrinterSpooler() {
        System.out.println("Instance is created");
    }

    
    public static PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }

    
    public void printDoc() {
        String docx = "Doc is printed";
        System.out.println(docx);
    }
}

public class singleTon {
    public static void main(String[] args) {
        
        PrinterSpooler s1 = PrinterSpooler.getInstance();
        PrinterSpooler s2 = PrinterSpooler.getInstance();
        
        s1.printDoc();
        s2.printDoc();
    }
}